package in.ashokit.repository;

import in.ashokit.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public boolean saveOrder(Order order) {
        System.out.println("The order is inserted into the Database, order id " + order.getId());
        return true;
    }

}
