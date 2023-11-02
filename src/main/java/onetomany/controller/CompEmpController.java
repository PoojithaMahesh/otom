package onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany.dao.CompanyDao;
import onetomany.dao.EmployeeDao;
import onetomany.dto.Company;
import onetomany.dto.Employee;

public class CompEmpController {

	public static void main(String[] args) {
		
//	Company company=new Company();
//	company.setId(1);
//	company.setName("TYSS");
//	company.setGst("TYSS@123");
//	
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.saveCompany(company);
		
//	Employee employee1=new Employee();
//	employee1.setId(1001);
//	employee1.setName("aman");
//	employee1.setAddress("Bangalore");
//	
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.saveEmployee(1, employee1);
//		
//		Company company=new Company();
//		company.setName("TstYantra");
//		company.setGst("TYSS@123");	
//		
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.updateCompany(1,company);
//	
//	Employee employee1=new Employee();
//	employee1.setName("ManishaM");
//	employee1.setAddress("Bangalore");
//	EmployeeDao dao=new EmployeeDao();
//	dao.updateEmployee(103, employee1);
		
//		find
//		EmployeeDao employeeDao=new EmployeeDao();
//		employeeDao.findEmployee(101);
	
		CompanyDao companyDao=new CompanyDao();
//		
        companyDao.deleteCompany(1);
		
//		EmployeeDao employeeDao=new EmployeeDao();
//		employeeDao.deleteEMployeeById(101);
		
	}
}
