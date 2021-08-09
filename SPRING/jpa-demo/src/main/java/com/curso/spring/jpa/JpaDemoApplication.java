package com.curso.spring.jpa;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso.spring.jpa.models.Categoria;
import com.curso.spring.jpa.repository.CategoriasRepository;

@SpringBootApplication
public class JpaDemoApplication  implements CommandLineRunner{
	
	
	// INYECCION CRUD-REPOSITORY
	@Autowired
	private CategoriasRepository categoriasRepository;

	// CORAZON DEL PROYECTO
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	
	// COMPILAR EL PROYECTO EN CONSOLA
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring DATA-JPA");
		

		
	}
	
	// METODOS IMPLEMENTADOS DE CRUD-REPOSITORY
	
	// método save: nos inserta un registro en la base de datos para que persista
	@SuppressWarnings("unused")
	private void save() {
		
		// INSTANICIA DE LA ENTIDAD CATEGORIA -> MODELO
		Categoria categoria = new Categoria();
		
		// Establecemos valores a la instancia
		categoria.setNombre("Finanzas");
		categoria.setDescripcion("Trabajo relacionado con finanzas y contabilidad");
		
		// Pasamos la categoria establecida a la funcion save que provee el CrudRepository  para guardar en la base de datos
		categoriasRepository.save( categoria );
		
		// mensaje de exito
		System.out.println("Registro agregado exitosamente: " +  categoria );
	}
	
	
	// método findById: nos prmite buscar un registro buscando por su id unico
	@SuppressWarnings("unused")
	private void findById() {
		
		// Creamos un optional que nos devuelva true o false depende de la busqueda del findById
		Optional<Categoria> optional = categoriasRepository.findById(1);
		
		// Si optional devolvio un true obtenemos el registro de lo contrario se muestra el error
		if ( optional.isPresent() ) {
			System.out.println( optional.get() );
		}else {
			System.out.println("Categoria no encontrada...");
		}
	}
	
	
	// método save(update), si tiene un id actualiza si no tiene id inserta
	@SuppressWarnings("unused")
	private void update() {
		
		// Creamos un optional que nos devuelva true o false depende de la busqueda del findById
		Optional<Categoria> optional = categoriasRepository.findById(2);
		
		// Si optional devolvio un true obtenemos el registro de lo contrario se muestra el error
		if ( optional.isPresent() ) {
			
			// Creamos una variable de tipo Categoria donde se almacenara la categoria obtenida por el findById
			Categoria categoriaTmp = optional.get();
			
			// Establecemos los valores de la actualización
			categoriaTmp.setNombre("Ing. de Software");
			categoriaTmp.setDescripcion("Desarrollo de sistemas");
			
			// Guardamos el registro
			categoriasRepository.save( categoriaTmp );
			
			System.out.println( categoriaTmp );
		}else {
			System.out.println("Error al actualizar el registro...");
		}
		
	}
	
	
	// deleteById Método que nos permite eliminar un registro por su ID
	@SuppressWarnings("unused")
	private void deleteById() {
		
		int idCategoria = 1;
		
		categoriasRepository.deleteById( idCategoria );
		
		
	}
	
	
	// count Método que nos permite el numero de entidades o registros en nuestra tabla
	@SuppressWarnings("unused")
	private void count() {
		
		long count = categoriasRepository.count();
		
		System.out.println("Total categorias: " +  count);
		
	}
	
	
	// deleteAll Método que nos permite eliminar todas las entidades o registros de la tabla
	@SuppressWarnings("unused")
	private void deleteAll() {
		
		categoriasRepository.deleteAll();
		
	}

	
	// findAllById Método que nos permite buscar vari@s entidades o registros por su id
	@SuppressWarnings("unused")
	private void findAllById() {

		// Creamos la colección de id a buscar		
		List<Integer> ids = new LinkedList<Integer>(); // Lista enlazada de tipo integer
		
		// Agregamos los ids
		ids.add(1); ids.add(4); ids.add(10);
		
		// Almacenamos el resultado que nos regresa el método findAllById en una variable de tipo Categorias
		Iterable<Categoria> caIterable = categoriasRepository.findAllById(ids);
		
		// Un for de tipo categoria que nos imprime todas las categorias de caIterable
		for( Categoria categoria: caIterable ) {
			
			System.out.println(categoria);
			
		}
		
	}
	
	
	// findAll método que nos permite encontrar todas las entidades y tablas de nuestro registro
	@SuppressWarnings("unused")
	private void findAll() {
		
		
		// guardamos en una variable lo que nos devuelve el método findAll
		Iterable<Categoria> caIterable = categoriasRepository.findAll();
		
		
		// mostramos todos los  registros devueltos por el método findAll y almacenados en la variable caIterable
		for(Categoria categoria: caIterable) {
			System.out.println(categoria);
		}
		
	}
	
	
	// existsById Método que nos permite consultar si existe un registro con ese id retorna true o false
	@SuppressWarnings("unused")
	private void existsById() {
		
		boolean exists = categoriasRepository.existsById(50);
		
		if (exists) {
			System.out.println("El registro se encuntra en la base de datos");
		}else {
			System.out.println("El registro no se encuntra en la base de datos");
		}
		
	}
	
	
	
	// saveAll Método que nos permite 
	@SuppressWarnings("unused")
	private void saveAll() {
		
		// Creamos una variable de tipo lista categoria y obtenemos las categorias del método
		List<Categoria> categorias = getListaCategorias();
		
		
		// Guardamos las categorias en el método saveAll
		categoriasRepository.saveAll(categorias);
		
	}
	
	
	/*
	 * 
	 * Método que reguresa una lista de 3 categorias
	 * @return
	 * 
	 */
	
	private List<Categoria> getListaCategorias(){
		
		List<Categoria> list = new LinkedList<Categoria>();
		
		// Categoria 1
		Categoria categoria1 = new Categoria();
		categoria1.setNombre("Programador de Blockchain");
		categoria1.setDescripcion("Trabajo relacionados con bitcoin y Criptomonedas.");
		
		// Categoria 2
		Categoria categoria2 = new Categoria();
		categoria2.setNombre("Soldador/pintura");
		categoria2.setDescripcion("Trabajos relacionan con soldadura, pintura y enderexado.");
		
		// Categoria 1
		Categoria categoria3 = new Categoria();
		categoria3.setNombre("Ingeniero Industrial");
		categoria3.setDescripcion("Trabajos relacionados con Ingenieria industrial.");
		
		//  Agregamos las categorias a la lista
		list.add(categoria1);
		list.add(categoria2);
		list.add(categoria3);
		
		
		System.out.println("Listas agregadas");
		
		// Retornamos la lista
		return list;
		
	}
	
	
}












































