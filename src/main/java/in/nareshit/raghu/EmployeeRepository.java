package in.nareshit.raghu;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
