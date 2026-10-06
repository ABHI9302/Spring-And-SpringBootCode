package in.ashokit.main;

import in.ashokit.bean.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // start the Spring Container
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        // get the OrderService bean
        Object ob = ctx.getBean("orderService");
        OrderService orderService = (OrderService) ob;

        //call the method
        orderService.placeOrder("iphone17", 5);
    }
}
