package in.ashokit.App.runner;

import in.ashokit.App.model.Employee;
import in.ashokit.App.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    EmployeeRepository repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Employee> employeeList = repo.fetchEmployees();

        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}