package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public boolean sendEmail(String email) {
        System.out.println("Email is sent successfully to  : " + email);
        return true;
    }
}
