package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map library = new LibraryFilled().library;

        System.out.println("Welcome to library! If you want to see all dates of your visiting - enter 'y', for searching - press any key");
        String yes = scan.nextLine();
        if (yes.equals("y")) {
            System.out.println("Dates: " + library.keySet());
            System.out.println("Books: " + library.values());
        }
        System.out.println("For searching a book, please, enter the date in format 'year-mm-dd'");
        String date = scan.nextLine();
        searchByDate(library, date);
        System.out.println("All the best! See you soon.");
    }

    public static class LibraryFilled {
        private Map<String, String> library;
        LibraryFilled() {
            library = new HashMap<>();
            library.put("2019-07-02", "Valeriy Ananiev - Slidy na dorozi");
            library.put("2019-07-03", "Stephen King - Happiness");
            library.put("2019-07-04", "Bert Bates and Kathy Sierra - Head First");
            library.put("2019-07-05", "Kevin Horstmann - Java 8");
            library.put("2019-07-06", "Martin Brest - Pihota");
            library.put("2019-07-07", "Taras Shevchenko - Kobzar");
        }

    }

    public static void searchByDate(Map<String, String> book, String date) {
        if (book.containsKey(date)) {
            System.out.println("At this day you read:");
            System.out.println(book.get(date));
        } else {
            System.out.println("You don't take a book in this date or incorrect date");
        }
    }


}