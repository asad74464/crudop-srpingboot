package com.developer.crud.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.developer.crud.entity.EmployeeEntity;
import com.developer.crud.repository.EmployeeRepository;
import com.developer.crud.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
    }

	@Override
	public List<EmployeeEntity> findAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

}
