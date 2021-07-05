import { Component, Input } from '@angular/core';
import { Heroe } from '../../interfaces/heroe.interface';

@Component({
  selector: 'app-heroe-tarjeta',
  templateUrl: './heroe-tarjeta.component.html',
  styles: [`
  mat-card{
    margin: .5rem;
  }
`
  ]
})
export class HeroeTarjetaComponent {

  @Input() heroe!: Heroe;

}
