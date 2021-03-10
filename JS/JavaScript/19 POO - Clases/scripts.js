class Persona{

    constructor(nombre, apellido, edad){
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad

        this.datos = `Me llamo ${nombre} ${apellido} y tengo ${edad} años`
    }

    saludar(){
        return `Hola, me llamo ${this.nombre} y tengo ${this.edad} años.`
    }
}

const juan = new Persona('Juan', 'García', 25)
const marta = new Persona('Marta', 'García', 35)

console.log(juan);

console.log(juan.saludar());
console.log(marta.saludar());


class Alumno{

	constructor (nombre , apellidos , edad , calificacion)
		{
		this . nombre = nombre 
		this . apellidos = apellidos
		this . edad = edad 
		this . calificacion = calificacion
	}

				mayor ()
				{
					return (this . edad > 17) ? true : false
				}

				desempeno ()
				{
					if (this . calificacion < 7)
						return 1
					else if (this . calificacion < 9)
						return 2
					else
						return 3
				}
			}

			let alumno1 = new Alumno ('Flor' , 'Hernández' , 18 , 9.4)

            console . log ('Datos del alumno \'alumno1\':');
            
			for (let propiedad in alumno1)
				console . log (`${propiedad}: ${alumno1 [propiedad]}`)

			console . log (`Mayor de edad: ${(alumno1 . mayor ()) ? `SI` : `NO`}`)

			let desempeno
			
			switch (alumno1 ['desempeno'] ())
			{
				case 1:
					desempeno = 'malo'
					break
				case 2:
					desempeno = 'regular'
					break

				case 3:
					desempeno = 'bueno'
					break
				default:
					desempeno = 'inválido'

			}
			console . log (`Desempeño: ${desempeno}`)