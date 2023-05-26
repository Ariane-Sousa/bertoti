package org.park;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

@Path("/album")
public class Controller {

	
	Model model = new Model();
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{nome}/{cantor}/{ano}/")
    public Response album2(@PathParam String nome, @PathParam String cantor, @PathParam String ano) {	
		List<Album> albunsEncontrados = model.buscarEspecificacao(new Especificacao(nome, cantor, ano));	
		String json = new Gson().toJson(albunsEncontrados);
    	return Response.status(200).entity(json).build();	
    }
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/codigo/{codigo}")
    public Response album3(@PathParam String codigo) {	
		List<Album> albunsEncontrados = model.buscarCodigo(codigo);	
		String json = new Gson().toJson(albunsEncontrados);
    	return Response.status(200).entity(json).build();	
    }
	
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello";
    }
}