package es.dhr.eritrium.windows.rest;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/test")
@RequestScoped
public class Rest {
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public Response test() {
		return Response.ok("Hola desde msi en remoto recompilado Hora:" + new Date().toString()).build();
	}
}
