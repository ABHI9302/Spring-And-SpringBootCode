package in.ashokit.app.runner;

import in.ashokit.app.model.Employee;
import in.ashokit.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApprunner  implements ApplicationRunner {
    @Autowired
    EmployeeRepository repository;
    @Override
    public void run(ApplicationArguments args) throws  Exception{
        saveEmployee();
        
    }

    private void saveEmployee() {
        Employee employee= new Employee();
        employee.setId(7102L);
        employee.setName("Abhishek");
        employee.setSal(8000.0);
        employee. setDepartment("Reserearch");
        repository. save(employee);




            }
}
