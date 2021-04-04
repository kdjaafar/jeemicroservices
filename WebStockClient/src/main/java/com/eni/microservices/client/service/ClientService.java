package com.eni.microservices.client.service;

import com.eni.microservices.client.entite.Client;
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
public class ClientService {

    @PersistenceContext(unitName = "EniClient-PU")
    private EntityManager em;

    public List<Client> findClients() {
        TypedQuery<Client> query = em.createNamedQuery("Client.findAll", Client.class);
        List<Client> clients = query.getResultList();
        return clients;
    }
    
    public Client createClient(Client client) {
        em.persist(client);
        return client;
    }
    

}
