package com.eni.microservices.client.rest;

import com.eni.microservices.client.entite.Client;
import com.eni.microservices.client.service.ClientService;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author kdjaafar
 */

@Path("clients")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientResource {

    @Inject
    private ClientService clientService;

    @GET
    public Response getClients() {
        List<Client> clients = clientService.findClients();
        GenericEntity<List<Client>> list = new GenericEntity<List<Client>>(clients) {};
        return Response.ok(list).build();
    }

    @POST
    public Response createClient(Client newClient) {
        Client created = clientService.createClient(newClient);
        return Response.ok(created).build();
    }

}