import { Component } from '@angular/core';
import { ChartDataSets } from 'chart.js';

@Component({
  selector: 'app-barras-doble',
  templateUrl: './barras-doble.component.html',
  styles: [
  ]
})
export class BarrasDobleComponent {

  proveedoresData: ChartDataSets[] = [
    { data: [ 100,200,300,400,500 ], label: 'Vendedor A' },
    { data: [ 50,250,30, 450,200 ], label: 'Vendedor B' },
  ];
  
  proveedoresLabels: string[] = ['2021', '2022','2023','2024','2025'];
  
  productoData: ChartDataSets[] = [
    { data: [ 200, 300,400,300, 100 ], label: 'Carros', backgroundColor: 'blue' },
  ];

}
