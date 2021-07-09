import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-switches',
  templateUrl: './switches.component.html',
  styles: [
  ]
})
export class SwitchesComponent {

  miFormulario: FormGroup = this.fb.group({
    genero: [
      'M',
      [
        Validators.required
      ]
    ],
    notificaciones: [
      false,
      [
        Validators.required
      ]
    ]
  });

  persona = {
    genero: 'F',
    notificaciones: true
  }

  constructor( private fb: FormBuilder) { }


}
