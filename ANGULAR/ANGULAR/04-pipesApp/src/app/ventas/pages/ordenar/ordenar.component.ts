import { Component } from '@angular/core';
import { Color, Herores } from '../../interfaces/ventas.interfaces';


@Component({
  selector: 'app-ordenar',
  templateUrl: './ordenar.component.html',
  styles: [
  ]
})
export class OrdenarComponent {

  cambio: boolean = true;

  ordenarPor: string = '';

  heroes: Herores[] = [
    {
      nombre:'Superman',
      vuela: true,
      color: Color.azul
    },
    {
      nombre:'Batman',
      vuela: false,
      color: Color.negro
    },
    {
      nombre:'Robbie',
      vuela: false,
      color: Color.rojo
    },
    {
      nombre:'literna verde',
      vuela: true,
      color: Color.verde
    },
  ];

  cambiar(){
    this.cambio = !this.cambio;
  }

  cambiarOrden( valor: string){
    this.ordenarPor = valor;
  }

}