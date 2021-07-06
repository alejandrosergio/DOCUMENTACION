import { Component, OnInit } from '@angular/core';
import { switchMap } from "rxjs/operators";
import { ActivatedRoute, Router } from '@angular/router';

import { Heroe, Publisher } from '../../interfaces/heroes.interface';
import { HeroesService } from '../../services/heroes.service';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styles: [`
    img{
      width: 100%;
      border-radius: 5px;
    }
  `]
})
export class AgregarComponent implements OnInit {

  publishers: any = [
    {
      id: 'Dc Comics',
      desc: 'Dc - Comics' 
    },
    {
      id: 'Marvel Comics',
      desc: 'Marvel - Comics'
    }
  ];

  heroe: Heroe = {
    superhero: '',
    alter_ego: '',
    characters: '',
    first_appearance: '',
    publisher: Publisher.DCComics,
    alt_img: ''
  }

  constructor( 
    private heroeService: HeroesService,
    private activateRouter: ActivatedRoute,
    private router: Router
    ) { }

  ngOnInit(): void {

    if ( !this.router.url.includes( 'editar' )) {
      return;
    }

    this.activateRouter.params
    .pipe(
      switchMap( ({ id }) => this.heroeService.getHeroePorId( id ) )
    )
    .subscribe( heroe => this.heroe = heroe );
  }

  guardar(){
    if ( this.heroe.superhero.trim().length === 0) {
      return;
    }

    if (this.heroe.id) {
      this.heroeService.actualizarHeroe( this.heroe)
      .subscribe( heroe => {
        this.router.navigate(['/heroes', heroe.id ]);
      });
    } else {
      this.heroeService.agregarHeroe( this.heroe )
      .subscribe( heroe =>   {
        this.router.navigate(['/heroes/listado']);
      });
    }
    
  }

  borrar(){

    this.heroeService.eliminarHeroe( this.heroe.id! )
    .subscribe( resp => {
      this.router.navigate(['/heroes/listado']);
    });

  }

}
