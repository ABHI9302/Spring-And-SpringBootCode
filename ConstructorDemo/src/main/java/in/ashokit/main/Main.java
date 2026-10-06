package in.ashokit.main;

import in.ashokit.bean.OrderStatus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        OrderStatus orderStatus = (OrderStatus) ctx.getBean("orderStatus");


        orderStatus.findOrderStatus("4223-1133");
    }
}