package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public final class ManyToManyFacade {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);

    public List<Employee> processEmployeeSearch(String letters) throws SearchProcessingException {
        LOGGER.info("Start searching Employee name containing: " + letters);
        List<Employee> matchEmployees = new ArrayList<>();
        boolean wasError = false;
        if (letters.isEmpty()) {
            LOGGER.error(SearchProcessingException.ERR_NO_TEXT);
            wasError = true;
            throw new SearchProcessingException(SearchProcessingException.ERR_NO_TEXT);
        }
        try {
            matchEmployees = employeeDao.retrieveEmployeesFindByLetters(letters);
            if (matchEmployees.size() == 0) {
                LOGGER.info("No Employee matching " + letters + " found in database");
                wasError = true;
                throw new SearchProcessingException(SearchProcessingException.ERR_EMPLOYEE_NOT_EXISTS);
            }
            LOGGER.info("Search successful");
            return matchEmployees;
        } finally {
            if (wasError) {
                LOGGER.info("Something has gone wrong");
            }
        }
    }

    public List<Company> processCompanySearch(String letters) throws SearchProcessingException {
        LOGGER.info("Start searching Company name containing: " + letters);
        List<Company> matchingCompany = new ArrayList<>();
        boolean wasError = false;
        if (letters.isEmpty()) {
            LOGGER.error(SearchProcessingException.ERR_NO_TEXT);
            wasError = true;
            throw new SearchProcessingException(SearchProcessingException.ERR_NO_TEXT);
        }
        try {
            matchingCompany = companyDao.retrieveCompanyContainingLetters(letters);
            if (matchingCompany.size() == 0) {
                LOGGER.error("No Company matching " + letters + " found in database");
                wasError = true;
                throw new SearchProcessingException(SearchProcessingException.ERR_COMPANY_NOT_EXISTS);
            }
            LOGGER.info("Search successful");
            return matchingCompany;
        } finally {
            if (wasError) {
                LOGGER.info("Something has gone wrong");
            }
        }
    }

}
