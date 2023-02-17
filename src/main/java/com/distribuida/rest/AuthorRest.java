package com.distribuida.rest;

import com.distribuida.db.Authors;

import com.distribuida.service.AuthorService;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/authors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@OpenAPIDefinition(
        info = @Info(
                title = "Author API ",
                version = "1.0.0"
        )
)
public class AuthorRest {

    @Inject
    AuthorService service;

    @GET
    public List<Authors> findAll() {
        return service.findAll();
    }

    @GET
    @Path("/{id}")
    public Authors findById(@PathParam("id") Long id) {
        return service.findById(id);
    }

    @POST
    public void save(Authors author) {
        service.save(author);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        service.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") Long id, Authors author) {
        service.update(id, author);
    }

}
