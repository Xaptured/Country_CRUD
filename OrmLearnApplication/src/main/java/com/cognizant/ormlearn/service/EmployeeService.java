package com.cognizant.ormlearn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository eRepository;
	
	@Transactional
	public Employee get(int id)
	{
		return eRepository.findById(id).get();
	}
	
	@Transactional
	public void save(Employee employee)
	{
		eRepository.save(employee);
	}
	
	@Transactional
	public List<Employee> getAllPermanentEmployees()
	{
		return eRepository.getAllPermanentEmployees();
	}
	@Transactional
	public double getAverageSalary(int id)
	{
		return eRepository.getAverageSalary(id);
	}
	@Transactional
	public List<Employee> getAllEmployeesNative()
	{
		return eRepository.getAllEmployeesNative();
	}
}
