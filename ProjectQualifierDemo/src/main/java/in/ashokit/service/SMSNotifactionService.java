package in.ashokit.service;

import org.springframework.context.annotation.Primary;

public class SMSNotifactionService implements NotificatonService{

    @Override


    @Primary
    public void send (){

        System.out.println("SMS Notification send....");
    }
}
