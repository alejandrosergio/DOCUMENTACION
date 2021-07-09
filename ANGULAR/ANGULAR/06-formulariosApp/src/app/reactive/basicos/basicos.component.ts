import { Component, NgModule, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-basicos',
  templateUrl: './basicos.component.html',
  styles: [
  ]
})
export class BasicosComponent implements OnInit {

  miFormulario: FormGroup = this.fb.group({
    nombre: [ 
      /* valor por defecto */, 
      [ 
        Validators.required,
        Validators.minLength(3)
      ] 
    ],
    precio: [
      /* valor por defecto */,
      [
        Validators.required,
        Validators.min(100)
      ]
    ],
    existencia: [
      /* valor por defecto */,
      [
        Validators.required,
        Validators.min(5)
      ]
    ],
  });

  constructor( private fb: FormBuilder ) { }

  ngOnInit(){
    /* Si queremos valores por defecto */
    this.miFormulario.reset({ /* o value si exigimos todos los campos  */
      nombre: 'RTX 4080ti',
      precio: 1600,
      existencia: 20
    });
  }

  campoEsValido( campo: string ){
    return  this.miFormulario.controls[campo].errors
            &&
            this.miFormulario.controls[campo].touched
  }

  guardar(){
    if ( this.miFormulario.invalid ) {
      this.miFormulario.markAllAsTouched();
      return;
    }
    this.miFormulario.reset();
  }

}
