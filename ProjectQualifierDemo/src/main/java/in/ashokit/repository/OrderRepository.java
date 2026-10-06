package in.ashokit.repository;
import  in.ashokit.model.Order;
import org.springframework.stereotype.Repository;
@Repository
public class OrderRepository {
    public boolean saveOreder(Order order){
        System.out.println("The order is insert Data base, order id "+order.getId());
        return  true;

    }
}


