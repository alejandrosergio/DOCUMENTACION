package com.curso.spring.empleos.controllers;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.curso.spring.empleos.models.Perfil;
import com.curso.spring.empleos.models.Usuario;
import com.curso.spring.empleos.models.Vacante;
import com.curso.spring.empleos.services.ICategoriaService;
import com.curso.spring.empleos.services.IUsuariosService;
import com.curso.spring.empleos.services.IVacantesService;

/**
 * @author alejandroseeik
 *
 */
@Controller
public class HomeController {
	
	
	@Autowired
	private IVacantesService serviceVacantes;
	
	@Autowired
	private IUsuariosService usuariosService;
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	// HOME
	
	@ModelAttribute
	public void setGenericos( Model model ) {
		
		// Objeto de tipo vacante
		Vacante vacanteSearch = new Vacante();
		vacanteSearch.reset();
	
		// ATRIBUTO PARA VACANTES-DESTACADAS
		model.addAttribute("vacantes", serviceVacantes.buscarDestacadas());
		
		// ATRIBUTO PARA VACANTES
		model.addAttribute("vacantes", serviceVacantes.obtenerVacantes());
		
		// ATRIBUTO PARA OBTENER CATEGORIAS
		model.addAttribute("categorias", categoriaService.obtenerCategorias());
		
		
		// ATRIBUTO SEARCH PARA BUSCAR
		model.addAttribute("search", vacanteSearch);
	}
	
	
	
	@GetMapping("/index")
	public String mostrarIndex(Authentication auth, HttpSession session) {
		
		for(GrantedAuthority rol: auth.getAuthorities()) {
			
			System.out.println("ROL: " + rol.getAuthority() );
			
		}
		
		String username = auth.getName();
		
		if (session.getAttribute("usuario") == null) {
			
			Usuario usuario = usuariosService.buscarPorUsername(username);
			
			usuario.setPassword(null);
			
			session.setAttribute("usuario", usuario);
			
			System.out.println(usuario);
			
		}
		
		return "redirect:/";
	}
	
	
	
	/**
	 * InitBinder para String si los detecta vacios en el data Binding los settea a null
	 * 
	 * 
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	
	

	// URL RAIZ NOS ENSEÑA LAS VACANTES DESTACADAS
	@GetMapping("/")
	public String mostrarHome(Model model) {
		
		return "home"; // retorno de la vista
		
	}
	
	
	@GetMapping("/search")
	public String buscar(@ModelAttribute("search") Vacante vacante, Model model) {
	
		// CONFIGURAMOS LA DESCRIPCION PARA NO USAR EL OPERADOR IGUAL EN LA CONSULTA EN SU LUGAR EL LIKE
			// where descripcion '%?%'
		ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("descripcion", ExampleMatcher.GenericPropertyMatchers.contains());
		
		
		Example<Vacante> example = Example.of(vacante,matcher);
		
		List<Vacante> list = serviceVacantes.buscarByExample(example);
		
		model.addAttribute("vacantes", list);
		
		return "home"; 
		
	}
	
	
	
	@GetMapping("/signup")
	public String registrarse(Usuario usuario) {
		return "formRegistro";
	}
	
	
	
	
	// GUARDAR UN USUARIO
	
	@PostMapping("/signup")
	public String guardarRegistro(Usuario usuario, RedirectAttributes attributes) {
		
		// ENCRIPTAMOS LA CONTRASEÑA
		String pwdPlano = usuario.getPassword();
		String pwdEncriptado = passwordEncoder.encode(pwdPlano);
		usuario.setPassword(pwdEncriptado);
		
		
		usuario.setEstatus(1); // Activado por defecto
		
		usuario.setFechaRegistro(new Date()); // Fecha de Registro, la fecha actual del servidor
		
		// Creamos el Perfil que le asignaremos al usuario nuevo
		Perfil perfil = new Perfil();
		perfil.setID(3); // Perfil USUARIO
		usuario.agregarPerfiles(perfil);
		
		/**
		 * Guardamos el usuario en la base de datos. El Perfil se guarda automaticamente
		 */
		usuariosService.guardar(usuario);
				
		attributes.addFlashAttribute("msgCreate", "El registro fue guardado correctamente!");
		
		return "redirect:/usuarios/index";
	}
	
	
	
	// ENCRIPTAR
	
	@GetMapping("/bcrypt/{texto}")
	@ResponseBody
	public String encriptar(@PathVariable("texto") String texto ){
		
		return texto + " encriptado en bcrypt: " + passwordEncoder.encode(texto);
		
	}
	
	
	// LOGIN
	@GetMapping("/login" )
	public String mostrarLogin() {
	    return "formLogin";
	}
	
	
	// LOGOUT - SALIR
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request){
		
		SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
		
		logoutHandler.logout(request, null, null);
		
		return "redirect:/login";
	}
	
	
	
	
	// LISTADO

	@GetMapping("/listado")
	public String mostrarListado(Model model) {

		List<String> lista = new LinkedList<String>(); // Creamos una lista de tipo string enlasada.
		lista.add("Ingeniero de sistemas"); // Agregamos a la lista
		lista.add("Auxiliar de contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");

		// AGREGAR LISTA AL MODELO
		model.addAttribute("empleos", lista);

		return "listado";

	}
	
	
	// DETALLE

	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {

		Vacante vacante = new Vacante(); // Creamos una variable de tipo Vacante: MODELO - CONTROLADOR

		// Establecemos los vaolres de la vacante
		

		// AGREGAMOS LA VACANTE AL CONTROLADOR - VISTA
		model.addAttribute("vacante", vacante);

		return "detalle"; // Llamamos la vista
	}
	
	
	
	// TABLA
	
	@GetMapping("/tabla")
	public String mostrarVacante( Model model) {
		
		return "tabla";
	}
	
	

}