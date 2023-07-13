package eva62Abril.Services;

import java.util.List;

import eva62Abril.Modelo.Computadora;
import eva62Abril.Negocio.ClienteGestion;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;



@Path("clientes")
public class ServicesCliente {
	
	@Inject
	private ClienteGestion clientegestion;
	
	
	@GET
	@Path("listado")
	@Produces("application/json")
	public List<Computadora>listadocomputadoras() {
		List<Computadora>computadoras=clientegestion.listadocomputadoras();
		return computadoras;
	}
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response guardarCliente(Computadora computadora) {
		try {
			clientegestion.guardarCliente(computadora);
			return Response.status(Response.Status.OK).entity(computadora).build();
		} catch (Exception e) {
			e.printStackTrace();
			Error error = new Error();
			error.setError(99);
			error.setMensaje("Error no se guardo: " +e.getMessage());
			return Response.status(Response.Status.OK).entity(error).build();
		}
	}
}
