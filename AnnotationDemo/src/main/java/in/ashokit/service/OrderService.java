package in.ashokit.service;

import in.ashokit.model.Order;
import in.ashokit.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository  orderRepository;

    @Autowired
    NotificationService notificationService;

    public void createOrder(Order order) {
        boolean flag = orderRepository.saveOrder(order);

        if(flag) {

            boolean status = notificationService.sendEmail(order.getCustomerEmail());

            if(status) {
                System.out.println("Order is placed successfully, email is also sent");
            }
            else {
                System.out.println("Order is placed successfully, email will be sent later");
            }
        }
        else {
            System.out.println("Out of stock, please try later");
        }
    }
}
