package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    Facade facade;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    @AfterEach
    public void cleanDatabase() {
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }

    @Test
    public void testFindCompaniesByAnyLetters() {
        //Given
        Company weirdCompany = new Company("WEIRD COMPANY");
        Company normalCompany = new Company("NORMAL COMPANY");

        //When
        companyDao.save(weirdCompany);
        companyDao.save(normalCompany);
        List<Company> companies = facade.findCompany(companyDao,"E");

        //Then
        assertEquals(1,companies.size());
    }

    @Test
    public void testFindEmployeeByAnyLetters() {
        //Given
        Employee employee1 = new Employee("JOHN", "SMITH");
        Employee employee2 = new Employee("INDIA", "BLACK");
        Employee employee3 = new Employee("CAROL", "KAMINSKY");

        //When
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        List<Employee> emploies = facade.findEmployee(employeeDao,"I");

        //Then
        assertEquals(2,emploies.size());
        assertEquals(1,facade.findEmployee(employeeDao,"IT").size());
    }
}
