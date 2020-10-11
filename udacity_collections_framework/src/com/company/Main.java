package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

    // Array Example
        int[] myArray = new int[100];
        myArray[0] = 100;
        myArray[1] = 100;
        System.out.println(myArray[3]);
        System.out.println(myArray[0] + myArray[1]);

	// ArrayList Example
        ArrayList<Integer> grades = new ArrayList<>();
    // Add example
        grades.add(100);
        grades.add(97);
        grades.add(80);
    //  General operation example
        System.out.println(grades.get(0)); // Get element at index
        System.out.println(grades.size()); // Get size of list
        grades.remove(0); // Remove element at index 0
        grades.clear(); // Clear all elements

    // Loops & Collections Code
        grades.add(50);
        grades.add(78);
        grades.add(90);
        for (int i : grades) {
            System.out.println(i);
        }

    // Stacks
        Stack<String> newsFeed = new Stack<>();
        newsFeed.push(" Morning News");
        newsFeed.push(" Afternoon News");
        newsFeed.push(" Evening News");
        String breakingNews = newsFeed.pop();
        System.out.println(breakingNews);
        System.out.println(newsFeed.peek());
        System.out.println(newsFeed.empty());

    // Queues and Deque
        Queue<String> orders = new LinkedList<>();
        orders.add("Order 1");
        orders.add("Order 2");
        orders.add("Order 3");
        System.out.println(orders);
        System.out.println(orders.poll());
        System.out.println(orders.poll());
        System.out.println(orders.poll());

        Deque<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.addFirst(4);
        numbers.addLast(9);
        System.out.println(numbers);

    // HashMap
        HashMap<String, Book> allBooks = new HashMap<>();
        Book taleOfTwoCities = new Book();
        allBooks.put("123456", taleOfTwoCities);

        System.out.println(allBooks.get("123456"));

    }


}

// Helper code to understand HashMap
class Library {
    ArrayList<Book> allBooks;
}

class Book {
    String title;
    String author;
    int numOfPages;
    int publishedYear;
    int edition;
    String ISBN;

    // Slow approach for searching
    Book findBookByISBN(String isbn) {
        for (Book book: new Library().allBooks) {
            if (book.ISBN.equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}