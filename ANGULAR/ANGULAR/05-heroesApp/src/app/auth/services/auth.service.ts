import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Auth } from '../pages/interfaces/auth.interface';
import { tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private baseUrl: string = environment.baseUrl;

  private _auth: Auth | undefined;

  get auth(): Auth{
    return { ...this._auth! };
  }

  constructor( private http: HttpClient ) { }

  login(){
    return this.http.get<Auth>(`${this.baseUrl}/usuarios/1`)
    .pipe(
      tap( auth => this._auth = auth ),
      tap( auth => localStorage.setItem('id', auth.id) )
    );
  }

}