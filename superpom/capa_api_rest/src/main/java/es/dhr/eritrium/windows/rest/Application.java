package es.dhr.eritrium.windows.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;

@ApplicationPath("/services")
public class Application extends javax.ws.rs.core.Application {
	
	
	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		Set<Class<?>> retorno = new HashSet<Class<?>>();
		retorno.add(Rest.class);
		return retorno;
	}
	
}
