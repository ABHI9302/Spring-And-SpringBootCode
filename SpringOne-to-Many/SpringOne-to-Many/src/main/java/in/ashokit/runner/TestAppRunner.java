package in.ashokit.runner;

import in.ashokit.model.Customer;
import in.ashokit.model.Order;
import in.ashokit.repository.CustomerRepository;
import in.ashokit.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class TestAppRunner implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        saveCustomerWithOrders();
        saveOrderWithCustomer();
    }
    private void saveOrderWithCustomer() {
        Customer customer = new Customer();
        customer.setId(10102L); customer.setName("Wilson");

        Order order = new Order();
        order.setId(53892L);  order.setOrderDate(LocalDate.of(2026, 07, 23));
        order.setStatus("Delivered"); order.setCustomer(customer);


        customer.setOrderList(List.of(order));

        orderRepository.save(order);

    }

    private void saveCustomerWithOrders() {
        // create a customer instance
        Customer customer = new Customer();
        customer.setId(10101L);  customer.setName("Thomas");

        // create order instance (1)
        Order order1 = new Order();
        order1.setId(27763L); order1.setOrderDate(LocalDate.of(2026,07,27));
        order1.setStatus("Placed"); order1.setCustomer(customer);

        // create order instance (2)
        Order order2 = new Order();
        order2.setId(30934L); order2.setOrderDate(LocalDate.of(2026,07,25));
        order2.setStatus("Delivered"); order2.setCustomer(customer);

        List<Order> orderList = List.of(order1, order2);
        customer.setOrderList(orderList);

        customerRepository.save(customer);
    }
}