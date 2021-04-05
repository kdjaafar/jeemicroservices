
package com.eni.microservices.commande.service;

import  com.eni.microservices.commande.entite.ArticleCommande;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author kdjaafar
 */

@ApplicationScoped
@Transactional(Transactional.TxType.REQUIRED)
public class ArticleCommandeService {

    @PersistenceContext(unitName = "WebStockCommande-PU")
    private EntityManager em;

    public List<ArticleCommande> findArticleCommandes() {
        TypedQuery<ArticleCommande> query = em.createNamedQuery("ArticleCommandes.findAll", ArticleCommande.class);
        List<ArticleCommande> articleCommandes = query.getResultList();
        return articleCommandes;
    }

    public ArticleCommande createArticleCommande(ArticleCommande articleCommande) {
        em.persist(articleCommande);
        return articleCommande;
    }

}