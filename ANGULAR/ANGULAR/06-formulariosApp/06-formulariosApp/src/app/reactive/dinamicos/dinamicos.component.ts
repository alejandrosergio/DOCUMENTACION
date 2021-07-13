import { Component } from '@angular/core';
import { Validators, FormGroup, FormBuilder, FormArray, FormControl } from '@angular/forms';

@Component({
  selector: 'app-dinamicos',
  templateUrl: './dinamicos.component.html',
  styles: [
  ]
})
export class DinamicosComponent {

  miFormulario: FormGroup = this.fb.group({
    nombre: [ 
      'Sergio', 
      [ 
        Validators.required,
        Validators.minLength(3)
      ] 
    ],
    favoritos: this.fb.array( 
      [
        ['nirvana', Validators.required],
        ['pink flow', Validators.required]
      ],
      [
        Validators.required
      ]
    )
  });

  /* ARRAY for HTML */
  get favoritosArr(){
    return this.miFormulario.get('favoritos') as FormArray;
  }

  nuevoFavorito: FormControl = this.fb.control('', Validators.required);

  /* Agregar al array */
  agregarFavorito(){
    if (this.nuevoFavorito.invalid) { return; };

    this.favoritosArr.push( new FormControl( this.nuevoFavorito.value, Validators.required ) );
    this.nuevoFavorito.reset();
  }

  eliminar( index: number ){
    this.favoritosArr.removeAt( index );
  } 

  constructor( private fb: FormBuilder ) { }

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
    this.miFormulario.reset(
      {nombre: 'sergio'}
    );
  }

}