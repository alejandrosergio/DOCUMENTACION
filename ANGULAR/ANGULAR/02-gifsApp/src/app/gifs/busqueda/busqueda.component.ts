import { Component, ElementRef, ViewChild } from '@angular/core';

@Component({
  selector: 'app-busqueda',
  templateUrl: './busqueda.component.html',
  styles: [
  ]
})
export class BusquedaComponent {

  @ViewChild('txtBuscar') txtBuscar!: ElementRef<HTMLInputElement>;

  bucar(){

    const valor = this.txtBuscar.nativeElement.value;

    console.log(valor);

    this.txtBuscar.nativeElement.value = '';

  }


}
