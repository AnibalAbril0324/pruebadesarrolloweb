package eva62Abril.Negocio;

import java.util.List;

import eva62Abril.Datos.ComputadoraDAO;
import eva62Abril.Modelo.Computadora;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;


@Singleton
@Startup
public class DatosDemo {

	@Inject
	private ComputadoraDAO computadoradao;
	@PostConstruct
	public void init () {
	
		Computadora computadora=new Computadora();
		computadora.setCodigo("0");
		computadora.setColor("Negro");
		computadora.setMarca("Asus");
		computadora.setModelo("Gamer");
		computadora.setTipo("Escritorio");
	    computadoradao.insert(computadora);
	    
	 
	    Computadora computadora1=new Computadora();
		computadora1.setCodigo("1");
		computadora1.setColor("Plomo");
		computadora1.setMarca("Dell");
		computadora1.setModelo("N1050");
		computadora1.setTipo("Laptop");
	    computadoradao.insert(computadora1);
	    
	    Computadora computadora2=new Computadora();
	  	computadora2.setCodigo("2");
	  	computadora2.setColor("Negro");
	  	computadora2.setMarca("Asus");
	  	computadora2.setModelo("Gamer");
	  	computadora2.setTipo("Laptop");
	  	computadoradao.insert(computadora2);
		
		List<Computadora> listcom = computadoradao.getAll();
		System.out.println("Listado =====");
		for(Computadora com: listcom) {
			System.out.println(com);
		}
		
	}
}
