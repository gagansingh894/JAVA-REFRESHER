package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListDataStructure {

    ListDataStructure() {

        ArrayList<Employee> employeeList = new ArrayList<>();
        // Add to list
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Marry", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        // Print all elements
        employeeList.forEach(employee -> System.out.println(employee));

        // Get element at nth place
        System.out.println(employeeList.get(1));

        // Check if list is empty
        System.out.println(employeeList.isEmpty());

        // Replace item at nth item
        employeeList.set(1, new Employee("Gagan", "Singh", 786));
        employeeList.forEach(System.out::println);

        // Get size of list
        System.out.println(employeeList.size());

        // Convert to array of size equal to list Size
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }

        // Check if element instance are same type
        System.out.println(employeeList.contains(new Employee("Gagan", "Singh", 786)));

        // Remove element from List
        employeeList.remove(3);
     }
}
