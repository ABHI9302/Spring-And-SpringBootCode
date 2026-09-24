package in.ashokit.App.repository;

import in.ashokit.App.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> fetchEmployees() {

        RowMapper<Employee> mapper = (rs, index) -> {

            Employee e = new Employee();

            e.setEmpno(rs.getInt("EMPNO"));
            e.setEname(rs.getString("ENAME"));
            e.setSal(rs.getDouble("SAL"));
            e.setDepartment(rs.getString("DEPARTMENT"));

            return e;
        };

        String sql = "SELECT * FROM EMP";

        return jdbcTemplate.query(sql, mapper);
    }
}
