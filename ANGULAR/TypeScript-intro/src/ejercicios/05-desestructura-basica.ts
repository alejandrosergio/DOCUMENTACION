/*
    ===== Código de TypeScript =====
*/


interface Reproductor{
    volumen: number;
    segundo: number;
    cancion: String;
    detalles: Detalles;
}

interface Detalles{
    author: String;
    anio: number;
}

const reproductor: Reproductor = {
    volumen: 90,
    segundo: 45,
    cancion: 'voiced main',
    detalles: {
        author: 'motionless',
        anio: 2016
    }
}

/*
    //NORMALMENTE
    console.log('El volumen actual es de: ' , reproductor.volumen);

    console.log('El segundo actual es de: ' , reproductor.segundo);

    console.log('La cancion actual es de: ' , reproductor.cancion);

    console.log('El autor actual es de: ' , reproductor.detalles.author);

    console.log('El año actual es de: ' , reproductor.detalles.anio);
*/

// DESESTRUCTURACION DE OBJETOS
    const { volumen, segundo, cancion, detalles } = reproductor; // 1

    const {author: authorDetalle, anio} = detalles; // 2

    const author = 'fredy mercury';

    //const { volumen, segundo, cancion, detalles:{author,anio} } = reproductor; // OTRA FORMA

    console.log('El volumen actual es de: ' , volumen);

    console.log('El segundo actual es de: ' , segundo);

    console.log('La cancion actual es de: ' , cancion);

    console.log('El autor actual es de: ' , authorDetalle);

    console.log('El año actual es de: ' , anio);


// DESESTRUCTURACION DE ARREGLOS

    const dbz: string[] = ['Goku', 'Veguetta', 'Trunks'];

    const [p1, p2, p3] = dbz;
    // const [, , p3] = dbz; // -> otros casos de querer solo uno

    console.log('El personaje 1: ', p1);
    console.log('El personaje 2: ', p2);
    console.log('El personaje 3: ', p3);