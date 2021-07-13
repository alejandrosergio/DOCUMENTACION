import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { combineLatest, Observable, of } from 'rxjs';

import { Pais, PaisSmall } from '../interfaces/paises.interface';

@Injectable({
  providedIn: 'root'
})
export class PaisesServiceService {

  private _baseUrl: string = 'https://restcountries.eu/rest/v2';

  private _regiones: string[] = [ 'Africa', 'Americas', 'Asia', 'Europe', 'Oceania' ];

  get regiones(): string[] {
    return [...this._regiones];
  }

  constructor( private http: HttpClient ) { }


  getPaisesRegion( region: string ): Observable<PaisSmall[]> {
    const url: string = `${this._baseUrl}/region/${region}?fields=alpha3Code;name`;
    return this.http.get<PaisSmall[]>( url );
  }

  getPaises( codigo: string ): Observable<Pais | null> {
    if ( !codigo) {
      return of(null)
    }
    const url: string = `${this._baseUrl}/alpha/${codigo}`;
    return this.http.get<Pais>( url );
  }

  getPaisesSmall( codigo: string ): Observable<PaisSmall> {
    const url: string = `${this._baseUrl}/alpha/${codigo}`;
    return this.http.get<PaisSmall>( url );
  }

  getPaisesFrontera( borders: string[] ): Observable<PaisSmall[]>{
    if ( !borders ) {
      return of([]);
    }
    const peticiones: Observable<PaisSmall>[] = [];

    borders.forEach( codigo => {
      const peticion = this.getPaisesSmall( codigo );
      peticiones.push( peticion );
    });

    return combineLatest( peticiones );
  }

}