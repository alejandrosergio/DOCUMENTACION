import { AfterViewInit, Component, ElementRef, OnDestroy, ViewChild } from '@angular/core';
import { NumberValueAccessor } from '@angular/forms';
import * as mapboxgl from 'mapbox-gl';

@Component({
  selector: 'app-zoom-range',
  templateUrl: './zoom-range.component.html',
  styles: [`
    .mapa-container{
      height: 100%;
      width: 100%;
    }
    .row{
      background: white;
      position: fixed;
      bottom: 3.2rem;
      left: 3.2rem;
      padding: 0.7rem;
      border-radius: 0.3rem;
      z-index: 999;
      width: 28.13rem;
      text-align: center;
    }
  `]
})
export class ZoomRangeComponent implements AfterViewInit, OnDestroy {

  @ViewChild('mapa') divMapa!: ElementRef;
  mapa!: mapboxgl.Map;
  zoomLevel: number = 16;
  center: [ number, number] = [ -76.53394147426296, 3.4531159536370746 ];

  constructor() { }

  ngAfterViewInit(): void {

    this.mapa = new mapboxgl.Map({
      container: this.divMapa.nativeElement,
      style: 'mapbox://styles/mapbox/streets-v11',
      center: this.center,
      zoom: this.zoomLevel
    });

    this.mapa.on('zoom', () => {
      this.zoomLevel = this.mapa.getZoom();
    });

    this.mapa.on('zoomend', () => {
      if ( this.mapa.getZoom() > 18 ) {
        this.mapa.zoomTo( 19 );
      }
    });

    // Movimiento del Mapa
    this.mapa.on( 'move', ( event) => {
      const target = event.target;
      const { lng , lat} = target.getCenter();
      this.center = [ lng , lat ];
    });

  }

  ngOnDestroy(): void {
    this.mapa.off('zoom',    () => {} );
    this.mapa.off('zoomend', () => {} );
    this.mapa.off('move',    () => {} );
  }

  zoomOut() {
    this.mapa.zoomOut();
  }

  zoomIn() {
    this.mapa.zoomIn();
  }

  zoomCambio( value: string ) {
    this.mapa.zoomTo( Number( value ) );
  }

}
