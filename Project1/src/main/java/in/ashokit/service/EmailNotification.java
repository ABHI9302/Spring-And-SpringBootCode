package in.ashokit.service;
import org.springframework.stereotype.Service;
public class EmailNotification implements NotificationService {
   @Override
   public void send(){
       System.out.println("Email Notification send.");
   }
}
