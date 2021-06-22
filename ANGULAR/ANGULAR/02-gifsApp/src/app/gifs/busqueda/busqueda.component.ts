import { Component, ElementRef, ViewChild } from '@angular/core';
import { GifsService } from '../service/gifs.service';

@Component({
  selector: 'app-busqueda',
  templateUrl: './busqueda.component.html',
  styles: [
  ]
})
export class BusquedaComponent {

  @ViewChild('txtBuscar') txtBuscar!: ElementRef<HTMLInputElement>;
  
  constructor( private gifsService: GifsService){}

  bucar(){

    const valor = this.txtBuscar.nativeElement.value;

    if (valor.trim().length === 0) {
      alert('No mandes espacios vacios');
      return;
    }

    this.gifsService.bucarGifs(valor);

    this.txtBuscar.nativeElement.value = '';

  }

}
