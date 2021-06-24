import { Component } from '@angular/core';
import { Country } from '../../interfaces/pais.interface';
import { PaisService } from '../../services/pais.service';

@Component({
  selector: 'app-por-capital',
  templateUrl: './por-capital.component.html',
  styles: [
  ]
})
export class PorCapitalComponent {

  termino: String = '';

  hayError: Boolean = false;

  capitales: Country[] = [];

  constructor( private capitalService: PaisService){}

  buscar( termino:string ){

    this.hayError = false;
    this.termino = termino;

    this.capitalService.buscarCapital( this.termino )
    .subscribe( (capitales) => {
      this.capitales = capitales;
    } , (err) => {
      this.hayError = true;
      this.capitales = [];
    });
  }

  sugerencias( termino: string){
    this.hayError = false;
  }

}
