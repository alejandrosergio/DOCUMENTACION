import { Injectable } from '@angular/core';
import { FormControl, ValidationErrors } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class ValidatorsService {

  /* EXPRECIONES REGULARES */
  nombreApellidoPattern: string = '([a-zA-Z]+) ([a-zA-Z]+)';
  emailPattern         : string = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";

  constructor() { }

  /* FUNCIONES */
  noPuedeSerEsteUser( control: FormControl ): ValidationErrors | null {
    const valor: String = control.value?.trim().toLowerCase();
    if ( valor === 'username') {
      return {
          noUserName: true
      }
    }
    return null;
  }

}