package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {

    public static String ERR_NO_TEXT = "Text for searching missing";
    public static String ERR_COMPANY_NOT_EXISTS = "Company does not exist";
    public static String ERR_EMPLOYEE_NOT_EXISTS = "Employee does not exist";

    public SearchProcessingException(String message) {
        super(message);
    }
}
