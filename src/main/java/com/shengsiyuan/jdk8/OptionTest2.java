package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by sundalei on 17-2-21.
 */
public class OptionTest2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setName("company1");

        List<Employee> employees = Arrays.asList(employee, employee2);
        //company.setEmployees(employees);

        Optional<Company> optional = Optional.ofNullable(company);
        List<Employee> list = optional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList());
        System.out.println(list);
    }
}
