package in.ashokit.main;

import in.ashokit.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Object obj = ctx.getBean("helloWorld");
        HelloWorld hw = (HelloWorld) obj;
        hw.sayHello();
    }
}