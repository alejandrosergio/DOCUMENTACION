import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name: 'mayusculas'
})
export class MayusculasPipes implements PipeTransform {

    transform(value: string, valor: boolean = true): string {
    return (valor) ? value.toUpperCase() : value.toLowerCase();
    }

}