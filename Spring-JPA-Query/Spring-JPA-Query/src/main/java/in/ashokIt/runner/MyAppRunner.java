package in.ashokIt.runner;

import in.ashokIt.model.Order;
import in.ashokIt.model.OrderStatus;
import in.ashokIt.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    private OrderRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
       // prepareData();
        findOrderId();
    }
    private void findOrderId(){
      Optional<Order> opt =repository.findById(32981L);
      Order order= opt.get();
      System.out.println(order);
    }

    private void prepareData() {

        List<Order> orderList = List.of(
                new Order(32981L, LocalDate.of(2026, 7, 15), 5900.0, OrderStatus.PENDING),
                new Order(32982L, LocalDate.of(2026, 7, 16), 7990.0, OrderStatus.PLACED),
                new Order(32983L, LocalDate.of(2026, 7, 17), 50.0, OrderStatus.CANCELLED),
                new Order(32984L, LocalDate.of(2026, 7, 18), 7090.0, OrderStatus.PLACED),
                new Order(32985L, LocalDate.of(2026, 7, 19), 1200.0, OrderStatus.PENDING),
                new Order(32986L, LocalDate.of(2026, 7, 19), 69310.0, OrderStatus.CANCELLED),
                new Order(32987L, LocalDate.of(2026, 7, 20), 1245.0, OrderStatus.PENDING),
                new Order(32988L, LocalDate.of(2026, 7, 21), 7990.0, OrderStatus.PLACED),
                new Order(32989L, LocalDate.of(2026, 7, 22), 530131.0, OrderStatus.PENDING),
                new Order(33090L, LocalDate.of(2026, 7, 23), 9087.0, OrderStatus.PLACED)
        );

        repository.saveAll(orderList);
    }
}
