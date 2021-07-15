import { Component, ElementRef, OnInit, ViewChild, AfterViewInit } from '@angular/core';
import * as mapboxgl from 'mapbox-gl';


interface MarcadorColor{
  color: string;
  marker?: mapboxgl.Marker;
  centro?: [number,number];
}
@Component({
  selector: 'app-marcadores',
  templateUrl: './marcadores.component.html',
  styles: [`
    .mapa-container{
      height: 100%;
      width: 100%;
    }

    .list-group{
      position: fixed;
      top: 1.3rem;
      right: 1.3rem;
      z-index: 99999;
      cursor: pointer;
      width: 9rem;
      text-align: center;
    }

    li{
      margin: 0.3em;
    }

    li.color{
      color: white;
    }
  `]
})
export class MarcadoresComponent implements AfterViewInit {

  @ViewChild('mapa') divMapa!: ElementRef;
  mapa!: mapboxgl.Map;
  zoomLevel: number = 15;
  center: [ number, number] = [ -76.53394147426296, 3.4531159536370746 ];

  marcadores: MarcadorColor[] = [];

  constructor() { }

  ngAfterViewInit(): void {

    this.mapa = new mapboxgl.Map({
      container: this.divMapa.nativeElement,
      style: 'mapbox://styles/mapbox/streets-v11',
      center: this.center,
      zoom: this.zoomLevel
    });

      this.leerLocalStorage();
  }

  agregarMarkador() {

    const color = "#xxxxxx".replace(/x/g, y=>(Math.random()*16|0).toString(16));

    const newMaker = new mapboxgl.Marker({
      draggable: true,
      color
    })
      .setLngLat( this.center )
      .addTo( this.mapa );
  
      this.marcadores.push({
        color, 
        marker: newMaker
      });

      this.guardarMarcadoresLocalStorage();

      newMaker.on('draggable', () => {
        this.guardarMarcadoresLocalStorage();
      });
  }

  irMarcador( marker: mapboxgl.Marker ) {
    this.mapa.flyTo({
      center: marker.getLngLat()
    });
  }

  guardarMarcadoresLocalStorage() {

    const lngArray: MarcadorColor[] = [];

    this.marcadores.forEach( m => {
    
      const color = m.color;
      const { lng, lat } =  m.marker!.getLngLat();

      lngArray.push({
        color: color,
        centro: [ lng, lat]
      });
        
    });

    localStorage.setItem('marcadores', JSON.stringify( lngArray ) );

  }

  leerLocalStorage() {
    if ( !localStorage.getItem('marcadores')) {
      return;
    }

    const lngLatArr: MarcadorColor[] = JSON.parse( localStorage.getItem( 'marcadores')! );

    lngLatArr.forEach( m => {
      const newMarker = new mapboxgl.Marker({
        color: m.color,
        draggable: true
      })
        .setLngLat( m.centro! )
        .addTo( this.mapa );

        this.marcadores.push({
          marker: newMarker,
          color: m.color
        });

        newMarker.on('draggable', () => {
          this.guardarMarcadoresLocalStorage();
        });

    });
  }

  borrarMarcador( index: number) {
    this.marcadores[index].marker?.remove();
    this.marcadores.splice( index, 1);
    this.guardarMarcadoresLocalStorage();
  }
}
