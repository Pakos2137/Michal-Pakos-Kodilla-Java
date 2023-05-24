package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.CompanyFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyFacade companyFacade;

    @Test
    void CompanyFacade() {

        Employee pakos = new Employee("Michal","Pakos");
        Employee dominik = new Employee("Dominik","Dednarski");
        Employee monika = new Employee("Monicka","Ivankova");

        Company mSale = new Company("MSale");
        Company pakosCorp = new Company("PakosCorp");

        mSale.getEmployees().add(pakos);
        mSale.getEmployees().add(monika);

        pakosCorp.getEmployees().add(pakos);
        pakosCorp.getEmployees().add(dominik);

        pakos.getCompanies().add(pakosCorp);
        dominik.getCompanies().add(pakosCorp);

        pakos.getCompanies().add(mSale);
        monika.getCompanies().add(mSale);

        companyDao.deleteAll();

        companyDao.save(mSale);
        companyDao.save(pakosCorp);

        List<Employee> employeeList = companyFacade.getEmployeeByName("ako");
        List<Company> companyList = companyFacade.getCompanyByName("sal");

        assertEquals(1,employeeList.size());
        assertEquals(1,companyList.size());


        companyDao.deleteAll();

    }
}