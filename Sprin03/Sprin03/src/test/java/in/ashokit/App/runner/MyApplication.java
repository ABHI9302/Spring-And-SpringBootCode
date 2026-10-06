package in.ashokit.App.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class MyApplication implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Accessing non-option arguments
        System.out.println("The non-option args : ");
        List<String> nonOptionArgsList = args.getNonOptionArgs();
        nonOptionArgsList.forEach(System.out::println);

        System.out.println("======================");

        // Accessing option arguments
        System.out.println("The option args : ");
        Set<String> optionNames = args.getOptionNames();
        for(String optionName : optionNames) {
            List<String> list = args.getOptionValues(optionName);
            System.out.println("option name : " + optionName);
            System.out.println("option value : " + list);
            System.out.println("*********************");
        }

    }
}