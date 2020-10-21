package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        new ListDataStructure();

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marrySmith = new Employee("Marry", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.getHead());
        System.out.println(list.isEmpty());
        list.addFront(janeJones);
        list.addFront(johnDoe);
        list.addFront(marrySmith);
        list.addFront(mikeWilson);
        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        System.out.println(list.getHead().getEmployee());
    }
}
