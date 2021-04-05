
package com.eni.microservices.commande.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author kdjaafar
 */

@Entity
@Table(name = "commandes")
@NamedQueries({
    @NamedQuery(name = "ArticleCommandes.findAll", query = "SELECT co FROM ArticleCommande co")
})
public class ArticleCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "articleNom")
    private String articleNom;

    @Column(name = "prix")
    private String prix;

    @Column(name = "clientId")
    private Long clientId;

    public Long getId() {
        return id;
    }

    public String getArticleNom() {
        return articleNom;
    }

    public void setArticleNom(String articleNom) {
        this.articleNom = articleNom;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

}