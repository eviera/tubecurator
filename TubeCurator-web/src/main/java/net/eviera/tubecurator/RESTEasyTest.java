package net.eviera.tubecurator;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import net.eviera.tubecurator.entity.TubeEntry;
import net.eviera.tubecurator.manager.TubeEntryManagerBean;

@Path("/resttest")
public class RESTEasyTest {

	@EJB
	private TubeEntryManagerBean tubeEntryManager;
	
	// http://localhost:18080/tubecurator/rest/resttest/tito?pregunta=caca
	
	@GET
	@Path("/{rutaParam}")
	@Produces("application/json")
	//public Response mensaje(@PathParam("rutaParam") String rutaParam,
	public List<TubeEntry> mensaje(@PathParam("rutaParam") String rutaParam,
			@DefaultValue("nada") @QueryParam("pregunta") String pregunta) {
		String respuesta = "Hola " +rutaParam  + " : " + pregunta;
		List<TubeEntry> result = tubeEntryManager.getAll();
		
		//return Response.status(200).entity(result).build();
		return result;
	}
	
	
}
