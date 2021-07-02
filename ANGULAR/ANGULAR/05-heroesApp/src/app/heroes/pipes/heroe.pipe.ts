import { Pipe, PipeTransform } from '@angular/core';
import { Heroe } from '../interfaces/heroe.interface';

@Pipe({
  name: 'imagen'
})
export class HeroePipe implements PipeTransform {

  transform(heroe: Heroe): string {
    return `assets/heroes/${ heroe.id }.jpg`;
  }

}
