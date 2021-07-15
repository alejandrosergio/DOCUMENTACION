import { Component } from '@angular/core';

interface MenuItem {
  ruta: string;
  nombre: string;
}


@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styles: [`
    li{
      cursor: pointer;
      width: 13rem;
      text-align: center;
      margin: 0.2em;
      border-radius: 0.3rem;
    }
  `]
})
export class MenuComponent {

  menuItems: MenuItem[] = [
    {
      ruta: '/mapas/full-screen',
      nombre: 'Full Screen'
    },
    {
      ruta: '/mapas/zoom-ranger',
      nombre: 'Zoom Ranger'
    },
    {
      ruta: '/mapas/marcadores',
      nombre: 'Marcadores'
    },
    {
      ruta: '/mapas/propiedades',
      nombre: 'Propiedades'
    },
  ];

  constructor() { }


}
