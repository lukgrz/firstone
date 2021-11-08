
package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

        private static Logger LOGGER = LoggerFactory.getLogger(Facade.class);

        public List<Company> findCompany(CompanyDao companyDao, String anyLetters) {
                List<Company> theList = companyDao.findByLetters(anyLetters);
                if (theList.size()>0) {
                        LOGGER.info("Founded companies" + theList); ;
                } else {
                        LOGGER.info("No companies match to the phrase");
                }
                return theList;
        }

        public List<Employee> findEmployee(EmployeeDao employeeDao, String anyLetters) {
                List<Employee> theList = employeeDao.findByLetters(anyLetters);
                if (theList.size()>0) {
                        LOGGER.info("Founded employees" + theList); ;
                } else {
                        LOGGER.info("No employess match to the phrase");
                }
                return theList;
        }
}
