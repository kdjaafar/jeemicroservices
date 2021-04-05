package com.eni.microservices.commande.rest;

import com.eni.microservices.commande.entite.ArticleCommande;
import com.eni.microservices.commande.service.ArticleCommandeService;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author kdjaafar
 */

@Path("commandes")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticleCommandeResource {

    @Inject
    private ArticleCommandeService articleCommandeService;

    @GET
    public Response getArticleCommandes() {
        return Response.ok(articleCommandeService.findArticleCommandes()).build();
    }

    @POST
    public Response createArticleCommande(ArticleCommande newArticleCommande) {
        return Response.ok(articleCommandeService.createArticleCommande(newArticleCommande)).build();
    }

}