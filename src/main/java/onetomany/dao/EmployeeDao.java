package onetomany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany.dto.Company;
import onetomany.dto.Employee;

public class EmployeeDao {

	public void saveEmployee(int companyId,Employee employee) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		first ill check whether this company is present or not
		Company dbCompany=entityManager.find(Company.class, companyId);
		if(dbCompany!=null) {
//			that company is present and i can join to that company
			
			employee.setCompany(dbCompany);
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
//			im adding employee details to the database
			entityManager.persist(employee);
//			i just want to update the company details by adding this emps
//			im taking employees details with this company
			List<Employee> employees=dbCompany.getEmployees();
//			for this existing employees im going to add this emp
			employees.add(employee);
//			update the employeesdetails for a company
			dbCompany.setEmployees(employees);
			
		
			entityTransaction.commit();
		}else {
//			That company is not present
			System.out.println("Sorry Company is not present");
		}
	}
	
	public void updateEmployee(int id,Employee employee) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			employee.setId(id);
			employee.setCompany(dbEmployee.getCompany());
			entityManager.merge(employee);
			entityTransaction.commit();
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	public void findEmployee(int id ) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
			System.out.println(dbEmployee);
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	
	
	
	
	
	
}
