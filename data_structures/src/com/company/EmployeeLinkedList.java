package com.company;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public EmployeeNode getHead() {
        return head;
    }

    public void addFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size ++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode removeFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;

    }

    public void printList() {
        EmployeeNode current = head;
        System.out.println("HEAD ->");
        while (current != null) {
            System.out.println(current.getEmployee());
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }


}
