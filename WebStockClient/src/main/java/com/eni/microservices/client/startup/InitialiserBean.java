package com.eni.microservices.client.startup;

import com.eni.microservices.client.entite.Client;
import com.eni.microservices.client.service.ClientService;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author kdjaafar
 */

@Startup
@Singleton
public class InitialiserBean {

    @Inject
    private ClientService clientService;

    @PostConstruct
    public void init() {

        Client cust1 = new Client ("DJAAFAR", "Karim","kdjaafar@eni.fr");
        Client cust2 = new Client("DOE", "john", "jdoe@eni.fr");

        clientService.createClient(cust1);
        clientService.createClient(cust2);

    }

}
