package main.java.accounting;

import java.util.Map;

public class LibraryAccounting {

    public static void searchByDate(Map<String, String> book, String date) {
        if (book.containsKey(date)) {
            System.out.println("At this day you read:");
            System.out.println(book.get(date));
        } else {
            System.out.println("You don't take a book in this date or incorrect date");
        }
    }
}
