package com.cognizant.ormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	//private static CountryService countryService;
	private static EmployeeService eService;
	private static DepartmentService dService;
	private static SkillService sService;

	public static void main(String[] args) throws CountryNotFoundException {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		//countryService = context.getBean(CountryService.class);
		eService = context.getBean(EmployeeService.class);
		dService = context.getBean(DepartmentService.class);
		sService = context.getBean(SkillService.class);
		//Country country = context.getBean(Country.class);
//		testGetAllCountries();
//		getAllCountriesTest();
//		testAddCountry(country);
//		testUpdateCountry();
//		testDeleteCountry();
//		testSearchByPlaceHolder();
//		testNameStartWith();
//		testSortCountry();
//		testAddEmployee();
//		testGetEmployee();
//		testUpdateEmployee();
//		testGetDepartment();
//		testAddSkillToEmployee();
//		testGetSkills();
//		testGetAllPermanentEmployees();
//		testGetAverageSalary();
//		testGetAllEmployees();
	}

//	private static void testGetAllCountries() {
//		LOGGER.info("start");
//		List<Country> countries = countryService.getAllCountries();
//		LOGGER.debug("countries={}", countries);
//		LOGGER.info("end");
//	}
//
//	private static void getAllCountriesTest() throws CountryNotFoundException {
//		LOGGER.info("start");
//		Country country = countryService.findCountryByCode("IN");
//		LOGGER.debug("Country:{}", country);
//		LOGGER.info("end");
//	}
//
//	private static void testAddCountry(Country country) {
//		LOGGER.info("start");
//		country.setCode("LK");
//		country.setName("Sri Lanka");
//		countryService.addCountry(country);
//		LOGGER.info("end");
//	}
//
//	private static void testUpdateCountry() {
//		LOGGER.info("start");
//		countryService.updateCountry("US", "United States");
//		LOGGER.info("end");
//	}
//
//	private static void testDeleteCountry() {
//		LOGGER.info("start");
//		countryService.deleteCountry("LK");
//		LOGGER.info("end");
//	}
//	
//	private static void testSearchByPlaceHolder() {
//		
//		LOGGER.info("start");
//		List<Country> countries = countryService.searchByPlaceHolder("di");
//		LOGGER.debug("countries={}", countries);
//		LOGGER.info("end");
//	}
//	
//	private static void testNameStartWith() {
//		LOGGER.info("start");
//		List<Country> countries = countryService.searchByStartingLetter("I");
//		LOGGER.debug("countries={}", countries);
//		LOGGER.info("end");
//	}
//	
//	private static void testSortCountry() {
//		LOGGER.info("start");
//		List<Country> countries = countryService.searchByStartingLetter("Ind");
//		LOGGER.debug("countries={}", countries);
//		LOGGER.info("end");
//	}
//	private static Date parseDate(String date)
//	{
//		try {
//			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			return null;
//		}
//	}
//	private static void testAddEmployee()
//	{
//		LOGGER.info("start");
//		Employee employee = new Employee("Jack", 25000.00, true, parseDate("1999-01-19"));
//		Department department = new Department("Analyst and Trainee");
//		employee.setDepartment(department);
//		eService.save(employee);
//		LOGGER.info("end");
//	}
//	private static void testGetEmployee()
//	{
//		LOGGER.info("start");
//		int employeeId = 1;
//		Employee employee = eService.get(employeeId);
//		LOGGER.debug("Employee={}", employee);
//		LOGGER.debug("Department={}", employee.getDepartment());
//		LOGGER.info("end");
//	}
//	private static void testUpdateEmployee()
//	{
//		LOGGER.info("start");
//		int employeeId = 1;
//		Employee employee = eService.get(employeeId);
//		employee.setDepartment(new Department("Trainer"));
//		eService.save(employee);
//		LOGGER.debug("Employee={}", employee);
//		LOGGER.debug("Department={}", employee.getDepartment());
//		LOGGER.info("end");
//	}
//	private static void testGetDepartment()
//	{
//		LOGGER.info("start");
//		int departmentId = 4;
//		Department department = dService.get(departmentId);
//		LOGGER.debug("Department={}", department);
//		LOGGER.debug("Employee={}", department.getEmployees());
//		LOGGER.info("end");
//	}
//	private static void testAddSkillToEmployee()
//	{
//		LOGGER.info("start");
//		int employeeId = 1;
//		Employee employee = eService.get(employeeId);
//		Set<Skill> skills = new HashSet<>();
//		Skill skill = new Skill("JAVA");
//		Skill skill2 = new Skill("MySQL");
//		skills.add(skill);
//		skills.add(skill2);
//		sService.save(skill);
//		sService.save(skill2);
//		employee.setSkills(skills);
//		eService.save(employee);
//		LOGGER.info("end");
//	}
//	private static void testGetSkills()
//	{
//		LOGGER.info("start");
//		int employeeId = 1;
//		Employee employee = eService.get(employeeId);
//		LOGGER.debug("Skills={}", employee.getSkills());
//		LOGGER.info("end");
//	}
//	public static void testGetAllPermanentEmployees() 
//	{
//		LOGGER.info("Start");
//		List<Employee> employees = eService.getAllPermanentEmployees();
//		LOGGER.debug("Permanent Employees:{}", employees);
//		employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkills()));
//		LOGGER.info("End");
//	}
//	public static void testGetAverageSalary()
//	{
//		LOGGER.info("Start");
//		int deptId = 4;
//		double avgSalary = eService.getAverageSalary(deptId);
//		LOGGER.debug("Average Salary", avgSalary);
//		LOGGER.info("End");
//	}
//	public static void testGetAllEmployees()
//	{
//		LOGGER.info("Start");
//		List<Employee> employees = eService.getAllEmployeesNative();
//		LOGGER.debug("Employees:{}", employees);
//		LOGGER.info("End");
//	}
}
