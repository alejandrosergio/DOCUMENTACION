import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-hay-error',
  templateUrl: './hay-error.component.html',
  styles: [
  ]
})
export class HayErrorComponent {

  @Input() hayError: boolean = false;

  @Input() termino: string = '';

}
