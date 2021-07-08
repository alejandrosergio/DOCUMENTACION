import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-basicos',
  templateUrl: './basicos.component.html',
  styles: [
  ]
})
export class BasicosComponent implements OnInit {

  @ViewChild('miFormulario') miFormulario!: NgForm;

  initialForm = {
    producto: 'zanahorias',
    precio: 10,
    existencia: 10
  }

  nombreValido(): boolean{

    return  this.miFormulario?.controls.producto?.invalid
            && 
            this.miFormulario?.controls.producto?.touched;
  }

  precioValido(): boolean{
    return this.miFormulario?.controls.precio?.touched
            && 
            this.miFormulario?.controls.precio?.value < 100
  }

  constructor() { }

  ngOnInit(): void {
  }

  guardar(){
    console.log( this.miFormulario );
    this.miFormulario.resetForm(
      {
        producto: 'que quieres agregar?',
        precio: 0,
        existencia: 0
      }
    );
  }

}