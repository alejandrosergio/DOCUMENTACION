import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { switchMap, tap } from 'rxjs/operators';

import { PaisSmall } from '../../interfaces/paises.interface';
import { PaisesServiceService } from '../../services/paises-service.service';

@Component({
  selector: 'app-selector-page',
  templateUrl: './selector-page.component.html',
  styles: [
  ]
})
export class SelectorPageComponent implements OnInit {

  miFormulario: FormGroup = this.fb.group({
    region: [
      '',
      [
        Validators.required
      ]
    ],
    pais: [
      '',
      [
        Validators.required
      ]
    ],
    frontera: [
      '',
      [
        Validators.required
      ]
    ]
  });

  /* LLENAR SELECTORES */
  regiones: string[] = [];
  paises: PaisSmall[] = [];
  fronteras: PaisSmall[] = [];

  /* UI */
  cargando : boolean = false;

  constructor( 
    private fb: FormBuilder,
    private paisesServiceService: PaisesServiceService
    ) { }

  ngOnInit(): void {

    this.regiones = this.paisesServiceService.regiones;

    // Cuando seleccione la region
    this.miFormulario.get('region')?.valueChanges
    .pipe(
      tap( () => {
        this.miFormulario.get('pais')?.reset('');
        this.cargando = true;
      }), 
      switchMap( region => this.paisesServiceService.getPaisesRegion( region ) )
    )
    .subscribe( paises => {
      this.paises = paises;
      this.cargando = false;
    });

    // Cuando seleccione un pais
    this.miFormulario.get('pais')?.valueChanges
    .pipe(
      tap( () => {
        this.miFormulario.get('frontera')?.reset('');
        this.cargando = true;
      }), 
      switchMap( codigo => this.paisesServiceService.getPaises( codigo )),
      switchMap( pais => this.paisesServiceService.getPaisesFrontera( pais?.borders! ))
    )
    .subscribe( paises => {
      this.fronteras = paises;
      this.cargando = false;
    });

  }

  Seleccionar(){
    alert("Seleccionado con exito");
  }

}
