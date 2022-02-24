package in.nareshit.raghu.service;




import java.util.List;

import in.nareshit.raghu.entity.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee emp);
	
	
	List<Employee> getAllEmployees();
	
	
	Employee getoneemployee1(Integer id);
	
	void deleteEmployee(Integer id);
	
	void UpdateEmployee(Employee emp);


	Employee getOneEmployee1(Integer id);


	void updateEmployee(Employee employee);


	Employee getOneEmployee(Integer id);


	Employee getoneemployee(Integer id);
	
	
}
