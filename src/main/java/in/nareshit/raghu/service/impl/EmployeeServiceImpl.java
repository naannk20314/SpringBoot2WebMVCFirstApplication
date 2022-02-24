package in.nareshit.raghu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.nareshit.raghu.EmployeeRepository;
import in.nareshit.raghu.entity.Employee;
import in.nareshit.raghu.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {
	
	
	@Autowired
	private EmployeeRepository repo;
		
	public Integer saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp).getEmpId();
	}

	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
	public Employee getoneemployee(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	

	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	
	public void UpdateEmployee(Employee emp) {
		// TODO Auto-generated method stub

		repo.save(emp);
	}


	@Override
	public Employee getOneEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Employee getoneemployee1(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee getOneEmployee1(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
