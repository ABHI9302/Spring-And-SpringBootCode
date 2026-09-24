package in.ashokit.app.runner;

import in.ashokit.app.repository.MyRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.Scanner;

@Component
public class MyRunner implements ApplicationRunner {
    private final MyRepository myRepository;

    public MyRunner(MyRepository myRepository){
        this.myRepository= myRepository;
    }
    @Override
    public  void run(ApplicationArguments  args)throws Exception{
        Scanner scanner= new Scanner (System.in);
        System.out.println("enter a empno to find the bonus");
        int id= scanner.nextInt();
        Double d= myRepository.fetchBonus(id);
        System.out.println("Bonus:"+d);
    }

}
