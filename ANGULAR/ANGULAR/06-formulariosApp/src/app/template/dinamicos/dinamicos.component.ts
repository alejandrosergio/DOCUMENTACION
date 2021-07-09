import { Component } from '@angular/core';

interface Persona {
  nombre: string;
  favoritos: Favorito[];
}

interface Favorito {
  id: number;
  nombre: string;
}

@Component({
  selector: 'app-dinamicos',
  templateUrl: './dinamicos.component.html',
  styles: [
  ]
})
export class DinamicosComponent {

  nuevoJuego: string = '';

  persona: Persona = {
    nombre: 'Sergio',
    favoritos: [
      {
        id: 1,
        nombre: 'Horna'
      },
      {
        id: 2,
        nombre: 'Evanessense'
      }
    ]
  }

  agregarJuego(){
    const nuevoFavorito: Favorito = {
      id: this.persona.favoritos.length + 1,
      nombre: this.nuevoJuego
    }

    this.persona.favoritos.push({...nuevoFavorito});
    this.nuevoJuego = '';

  }

  eliminar( index: number ){
    this.persona.favoritos.splice(index, 1);
  } 


  guardar(){

  }


}