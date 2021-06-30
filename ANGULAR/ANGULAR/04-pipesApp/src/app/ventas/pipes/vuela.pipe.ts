import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name: 'vuela'
})
export class VuelaPipes implements PipeTransform {

    transform(value: boolean = true): string {
    return (value) ? "si vuela"  : "no vuela";
    }

}