package io.github.vasouv.customer.startup;

import io.github.vasouv.customer.entity.Customer;
import io.github.vasouv.customer.service.CustomerService;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author vasou
 */
@Startup
@Singleton
public class InitializerBean {

    @Inject
    private CustomerService customerService;

    @PostConstruct
    public void init() {

        Customer cust1 = new Customer ("DJAAFAR", "Karim","kdjaafar@eni.fr");
        Customer cust2 = new Customer("DOE", "john", "jdoe@eni.fr");

        customerService.createCustomer(cust1);
        customerService.createCustomer(cust2);

    }

}
