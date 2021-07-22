import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from "rxjs/operators";

import { environment } from '../../../environments/environment';

import { AuthResponse, Usuario } from '../interfaces/interface';
import { of, Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private _baseUrl: string = environment.baseUrl;
  private _user!: Usuario;

  get usuario() {
    return { ...this._user };
  }

  constructor( private http: HttpClient ) { }

  login( email: string , password: string ){

    const url  = `${this._baseUrl}/auth`;
    const body = { email , password };

    return this.http.post<AuthResponse>( url, body )
    .pipe(
      tap( resp => {
        if ( resp.ok === true ) {
          localStorage.setItem('token', resp.token!);
          this._user = {
            name: resp.name!,
            uid: resp.uid!
          }
        }
      }),
      map( valid => valid.ok ),
      catchError( err => of( err.error.msg ) )
    );

  }

  validarToken(): Observable<boolean> {
    const url = `${this._baseUrl}/auth/renew`;
    const headers = new HttpHeaders()
    .set('x-token', localStorage.getItem('token') || '' );

    return this.http.get<AuthResponse>( url, { headers } )
      .pipe(
        map( resp => {

          localStorage.setItem('token', resp.token!);
          this._user = {
            name: resp.name!,
            uid: resp.uid!
          }

          return resp.ok
        }),
        catchError( err => of(false) )
      )
  }

}
