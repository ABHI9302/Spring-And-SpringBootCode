package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class EmailNotification implements NotificatonService{
    @Override
    public void send(){

        System.out.println("Email Notification send..");
    }

}
