package net.eviera.tubecurator;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/resttest")
public class RESTEasyTest {

	// http://localhost:18080/tubecurator/rest/resttest/tito?pregunta=caca
	
	@GET
	@Path("/{rutaParam}")
	public Response mensaje(@PathParam("rutaParam") String rutaParam,
			@DefaultValue("nada") @QueryParam("pregunta") String pregunta) {
		String respuesta = "Hola " +rutaParam  + " : " + pregunta;
		
		return Response.status(200).entity(respuesta).build();
	}
	
	
}
