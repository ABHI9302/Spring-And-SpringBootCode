package in.ashokit.main;

import in.ashokit.config.AppConfig;
import in.ashokit.model.Order;
import in.ashokit.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);

        Object ob = context.getBean("orderService");
        OrderService orderService = (OrderService) ob;

        Order order = new Order(101, "john@gmail.com", "Laptop", 2);

        orderService.createOrder(order);
    }
}
