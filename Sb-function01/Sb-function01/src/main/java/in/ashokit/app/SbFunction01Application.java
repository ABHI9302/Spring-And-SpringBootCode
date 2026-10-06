package in.ashokit.app;

import jdk.jfr.BooleanFlag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;

@SpringBootApplication
public class SbFunction01Application {

	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(SbFunction01Application.class, args);
	}
	@Bean
	public SimpleJdbcCall simpleJdbcCall(){
		return  new SimpleJdbcCall(dataSource);

	}

}
