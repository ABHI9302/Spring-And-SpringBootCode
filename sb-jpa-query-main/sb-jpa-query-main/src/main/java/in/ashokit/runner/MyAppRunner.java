package in.ashokit.runner;

import in.ashokit.model.Order;
import in.ashokit.model.OrderStatus;
import in.ashokit.repository.OrderRepository;
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
    OrderRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        prepareData();

        // find order by id
//        findOrderById();

        // find orders by status
//        findOrdersByStatus();

        // find all orders
//        findAllOrders();

        // find orders with amount > 3000
        findOrdersByAmount();

    }

    private void findOrdersByAmount() {
        List<Order> byAmountGreaterThan = repository.findByAmountGreaterThan(3000.0);
        byAmountGreaterThan.forEach(System.out::println);
    }

    private void findAllOrders() {
        List<Order> all = repository.findAll();
        all.forEach(System.out::println);
    }

    private void findOrdersByStatus() {
        List<Order> orders = repository.findByStatus(OrderStatus.DELIVERED);
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    private void findOrderById() {
        Optional<Order> opt = repository.findById(31674L);
        Order order = opt.get();
        System.out.println(order);
    }

    private void prepareData() {
        List<Order> orderList = List.of(
                new Order(32981L, LocalDate.of(2026, 07, 15),5900.0, OrderStatus.PENDING),
                new Order(31674L, LocalDate.of(2026, 07, 13),3200.0, OrderStatus.PLACED),
                new Order(40374L, LocalDate.of(2026, 07, 16),4300.0, OrderStatus.PENDING),
                new Order(41892L, LocalDate.of(2026, 07, 14),2800.0, OrderStatus.CANCELLED),
                new Order(22560L, LocalDate.of(2026, 07, 12),1800.0, OrderStatus.DELIVERED),
                new Order(26788L, LocalDate.of(2026, 07, 11),5800.0, OrderStatus.DELIVERED)
        );
        repository.saveAll(orderList);
    }
}
