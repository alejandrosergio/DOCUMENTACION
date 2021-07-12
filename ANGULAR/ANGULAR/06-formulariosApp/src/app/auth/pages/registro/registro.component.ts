import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

import { ValidatorsService } from '../../../shared/validators/validators.service';



@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styles: [
  ]
})
export class RegistroComponent implements OnInit {

  miFormulario: FormGroup = this.fb.group({
    nombre: [
      '',
      [
        Validators.required, Validators.pattern( this.vs.nombreApellidoPattern )
      ]
    ],
    email: [
      '',
      [
        Validators.required, Validators.pattern( this.vs.emailPattern )
      ]
    ],
    username: [
      '',
      [
        Validators.required, this.vs.noPuedeSerEsteUser
      ]
    ]
  });

  constructor( 
    private fb: FormBuilder,
    private vs: ValidatorsService
    ) { }

  ngOnInit(): void {
    this.miFormulario.reset({
      nombre: 'Alejandro Seeik',
      email: 'test@test.com',
      username: 'usuario'
    });
  }

  campoNoValido( campo: string ){
    return  this.miFormulario.get( campo )?.invalid
            &&
            this.miFormulario.get( campo )?.touched;
  }

  createAccount(){
    if ( this.miFormulario.invalid ) {
      this.miFormulario.markAllAsTouched();
      return;
    }
  }

}
