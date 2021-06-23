import { Component } from '@angular/core';
import { PaisService } from '../../services/pais.service';
import { Country } from '../../interfaces/pais.interface';

@Component({
  selector: 'app-por-pais',
  templateUrl: './por-pais.component.html',
  styles: [
  ]
})
export class PorPaisComponent {

  termino: String = '';
  hayError: Boolean = false;
  paises: Country[] = [];

  constructor( private paisService: PaisService){}

  bucar(){
    this.hayError = false;
    this.paisService.buscarPais(this.termino)
    .subscribe( (paises) => {
      console.log(paises);
      this.paises = paises;
    } , (err) => {
      this.hayError = true;
      this.paises = [];
    });
    
  }
}
