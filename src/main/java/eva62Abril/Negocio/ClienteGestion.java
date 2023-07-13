package eva62Abril.Negocio;

import java.util.List;

import eva62Abril.Datos.ComputadoraDAO;
import eva62Abril.Modelo.Computadora;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;


@Stateless
public class ClienteGestion {

	@Inject 
	private ComputadoraDAO computadoradao;
	
	public void guardarCliente(Computadora computadora) throws Exception {
		if (!this.validartamcodigo(computadora.getCodigo()))
				throw new Exception("tama;o del codigo invalido");
		
		if(computadoradao.read(computadora.getCodigo())==null) {
			try {
				computadoradao.insert(computadora);
				
			} catch (Exception e) {
				
				throw new Exception("error la guardar"+e.getMessage());
			}
			
		}
		else {
		
			try {
				computadoradao.update(computadora);
			}catch(Exception e) {
				throw new Exception("Error al actualizar: " + e.getMessage());
			}
		}
	}
	
private boolean validartamcodigo(String codigo) {
		if(codigo.length()>=2 & codigo.length()<=5)
			return true;
		return false;

		
}

public List<Computadora>listadocomputadoras() {
	List<Computadora>personas=computadoradao.getAll();
	return personas;
}
}
