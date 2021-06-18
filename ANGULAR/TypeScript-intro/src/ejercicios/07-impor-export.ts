/*
    ===== Código de TypeScript =====
*/

// EXPORTACIONES E IMPORTACIONES

    // Importacion tradicional -> CMD . IMPORT
    import { calculaISV, Productos } from "./06-desestructuracion-function";

    const carritoCompra: Productos[] = [
        {
            desc: 'Telefono 1',
            precio: 100
        },
        {
            desc: 'Telefono 2',
            precio: 150
        },
    ];

    const [totoal,isv] = calculaISV(carritoCompra);

    console.log('Total : ',totoal) ;
    console.log('ISV : ',isv) ;