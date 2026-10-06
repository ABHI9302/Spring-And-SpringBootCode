package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
   @Autowired

           @Qualifier(value= " SMSNotification " )
    NotificatonService service;



    public void createCustomer(){
        System.out.println("Customer is created.");
        service .send();

    }
}
