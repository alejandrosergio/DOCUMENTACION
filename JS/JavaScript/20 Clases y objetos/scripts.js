/* 

Crea una clase Libro
La clase libro tendrá título, autor, año y género.
Crea un método que devuelva toda la información del libro
Pide 3 libros y guárdalos en un array
Los libros se introducirán al arrancar el programa pidiendo los datos con prompt.
Validar que los campos no se introduzcan vacíos
Validar que el año sea un número y que tenga 4 dígitos
Validar que el género sea: aventuras, terror o fantasía
Crea una función que muestre todos los libros
Crea una función que muestre los autores ordenados alfabéticamente
Crea una función que pida un género y muestre la información de los libros que pertenezcan a ese género usando un el método que devuelve la información

*/

class Book{

    constructor(title,author,year,gender){
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
    }

    getAuthor(){
        return this.author;
    }

    getGender(){
        return this.gender;
    }

    bookInfo(){
        return `${title} es un libro de ${gender} escrito por el author ${author} en el año ${year}`;
    }

}

let books = [];
let iterador = 1;

while(books.length < 3){

    let title = prompt(`Introduce el titulo del libro ${iterador} :`).toLowerCase().trim(); // Pasar a minuscilas y borrar espacios
    let author = prompt(`Introduce el author del libro ${iterador} :`).toLowerCase().trim();
    let year = prompt(`Introduce el año del libro ${iterador} :`);
    let gender = prompt(`Introduce el genero del libro ${iterador} :`).toLowerCase().trim();

        if (title != '' &&
            author != '' &&
            !isNaN(year) && 
            year.length == 4 &&
            (gender == 'aventura' ||
            gender == 'terror' ||
            gender == 'fantasia')) {
            iterador++;
                
            books.push(new Book(title,author,year,gender));
            
        }else{
            alert("datos incorrectos, intentalo de nuevo");
        }
        
}

const showAllBooks = () => {
    console.log(books);
}

const showAuthors = () => {
    let authors = []; 

    for (const book of books) {
        authors.push(book.getAuthor());
    }

    console.log(authors.sort());
}

const showGender = () => {
    const gender = prompt("Introdce el genero a buscar");

    for (const book of books) {
        if (book.getGender() == gender) {
            console.log(book.bookInfo())
        }
    }
}

showAllBooks();
showAuthors();
showGender();