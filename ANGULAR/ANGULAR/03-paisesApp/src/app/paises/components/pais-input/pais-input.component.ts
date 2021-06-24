import { Component, Output, EventEmitter, OnInit, Input } from '@angular/core';
import { Subject } from 'rxjs';
import { debounceTime } from 'rxjs/operators';


@Component({
  selector: 'app-pais-input',
  templateUrl: './pais-input.component.html',
  styles: [
  ]
})
export class PaisInputComponent implements OnInit {

  termino: string = '';

  @Output() onEnter  : EventEmitter<string> = new EventEmitter();

  @Output() onDebonce: EventEmitter<string> = new EventEmitter();

  @Input() placeholder: string = '';

  deboucer: Subject<string> = new Subject();

  ngOnInit(){
    this.deboucer
        .pipe(
          debounceTime(400))
        .subscribe( valor => {
        this.onDebonce.emit( valor );
    });
  }

  bucar(){
    this.onEnter.emit( this.termino );
  }

  teclaPrecionada(){
    
    this.deboucer.next( this.termino );

  }

}
