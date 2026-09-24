package in.ashokit.app.runner;
import in.ashokit.app.bean.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner{
    @Autowired
    HelloWorld helloWorld;
    @Override
    public  void run(String...args)throws Exception {
        System.out.println(helloWorld.sayHello());


    }

}
