package in.ashokit.app.repository;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MyRepository {
   private SimpleJdbcCall simpleJdbcCall;

   public MyRepository(SimpleJdbcCall simpleJdbcCall){
       this.simpleJdbcCall= simpleJdbcCall;


   }
   public  Double fetchBonus(int id ) {
       simpleJdbcCall.withFunctionName("bonus_function");
       Map<String, Object> input = new HashMap<>();
       input.put("id", id);
       Map<String, Object> output = simpleJdbcCall.execute(input);
       Object obj = output.get("return");
 return  (Double)  obj;

   }
}



