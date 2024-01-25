package ru.naumkin.homeworks.homework15.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("name1", 20));
        employeeList.add(new Employee("name2", 21));
        employeeList.add(new Employee("name3", 33));
        employeeList.add(new Employee("name4", 18));
        employeeList.add(new Employee("name5", 66));
        employeeList.add(new Employee("name5", 17));
        System.out.println(employeeList);
        List<String> employeeNames = returnListOfEmployeeNames(employeeList);
        System.out.println(employeeNames);
        System.out.println("_______________________________________________");
        List<Employee> employeeListWithAge = returnListOfEmployeesStartingFromCertainAge(employeeList, 21);
        System.out.println(employeeList);
        System.out.println(employeeListWithAge);
        System.out.println("_______________________________________________");
        System.out.println(IsAverageAgeAboveCertainNumber(employeeList, 30));
        System.out.println("_______________________________________________");
        System.out.println(returnYoungestEmployee(employeeList));
    }

    public static List<String> returnListOfEmployeeNames(List<Employee> employeeList) {
        List<String> employeeNames = new ArrayList<>();
        for (Employee employee : employeeList) {
            employeeNames.add(employee.getName());
        }
        return employeeNames;
    }


    public static List<Employee> returnListOfEmployeesStartingFromCertainAge(List<Employee> employeeList, int minAge) {
        List<Employee> employeeListMinAge = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getAge() >= minAge) {
                employeeListMinAge.add(employee);
            }
        }
        return employeeListMinAge;
    }

    public static boolean IsAverageAgeAboveCertainNumber(List<Employee> employeeList, int minimumAverageAge) {
        int sumOfEmployeeAges = 0;
        int employeeMinimumAverageAge;
        for (Employee employee : employeeList) {
            sumOfEmployeeAges += employee.getAge();
        }
        employeeMinimumAverageAge = sumOfEmployeeAges / employeeList.size();
        return employeeMinimumAverageAge >= minimumAverageAge;
    }

    public static Employee returnYoungestEmployee(List<Employee> employeeList) {
        Employee minAgeEmployee = employeeList.get(0);
        for (Employee employee : employeeList) {
            if (employee.getAge() < minAgeEmployee.getAge()) {
                minAgeEmployee = employee;
            }
        }
        return minAgeEmployee;
    }

}
