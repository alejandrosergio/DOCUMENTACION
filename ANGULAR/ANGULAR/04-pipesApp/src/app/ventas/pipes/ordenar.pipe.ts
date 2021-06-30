import { Pipe, PipeTransform } from '@angular/core';
import { deflate } from 'zlib';
import { Color, Herores } from '../interfaces/ventas.interfaces';

@Pipe({
  name: 'ordenar'
})
export class OrdenarPipe implements PipeTransform {


  transform( heroes: Herores[], order: string ): Herores[]{

    switch(order){
      case 'nombre':
        return heroes = heroes.sort( (a,b) => (a.nombre > b.nombre ? 1 : -1));
        break;
      
      case 'vuelo':
        return heroes = heroes.sort( (a,b) => (a.vuela > b.vuela ? -1 : 1));
        break;
      
      case 'color':
        return heroes = heroes.sort( (a,b) => (a.color > b.color ? 1 : -1));
        break;

      default:
        return heroes;
    }

  }

}
