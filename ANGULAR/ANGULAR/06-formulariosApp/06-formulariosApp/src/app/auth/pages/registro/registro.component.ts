import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

import { ValidatorsService } from '../../../shared/validators/validators.service';
import { EmailValidatorsService } from '../../../shared/validators/email-validators.service';



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
      ],
      [
        this.ve
      ]
    ],
    username: [
      '',
      [
        Validators.required, this.vs.noPuedeSerEsteUser
      ],
    ],
    password: [
      '',
      [
        Validators.required, Validators.minLength(6)
      ],
    ],
    password2: [
      '',
      [
        Validators.required
      ],
    ]
  } , {
    validators: [ this.vs.camposIguales('password', 'password2') ]  
  });


  get emailErrorMsg(): string {

    const errors = this.miFormulario.get('email')?.errors;

    if ( errors?.required ) {
      return 'El campo es obligatorio'
    }else if ( errors?.pattern ) {
      return 'El campo debe tener formato de correo'
    }else if ( errors?.emailTomado ) {
      return 'El correo ya esta en uso'
    }
    return '';
  }

  constructor( 
    private fb: FormBuilder,
    private vs: ValidatorsService,
    private ve: EmailValidatorsService
    ) { }

  ngOnInit(): void {
    this.miFormulario.reset({
      nombre: 'Alejandro Seeik',
      email: 'test1@test.com',
      username: 'usuario',
      password: '123456',
      password2: '123456'
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
    alert('Formulario enviado con exito');
    this.miFormulario.reset();
  }

}
