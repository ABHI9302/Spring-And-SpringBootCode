package in.ashokit.App.runner;

import in.ashokit.App.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Map;

@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    OrderRepository orderRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // saveOrder
        orderRepo.saveOrder(10101, LocalDate.of(2026, 7, 6), "placed");
        orderRepo.saveOrder(10102, LocalDate.of(2026, 7, 3), "delivered");

        // fetchOrderById
        Map<String,Object> map = orderRepo.fetchOrderById(10101);
        map.forEach((k,v) -> System.out.println(k + ", " + v));

        // deleteOrderById
        orderRepo.deleteOrderById(10102);
    }
}