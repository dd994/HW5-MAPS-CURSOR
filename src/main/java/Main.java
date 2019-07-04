package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static main.java.accounting.LibraryAccounting.searchByDate;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Map<String, String> library = new HashMap<>();
        library.put("2019-07-02", "Valeriy Ananiev - Slidy na dorozi");
        library.put("2019-07-03", "Stephen King - Happiness");
        library.put("2019-07-04", "Bert Bates and Kathy Sierra - Head First");
        library.put("2019-07-05", "Kevin Horstmann - Java 8");
        library.put("2019-07-06", "Martin Brest - Pihota");
        library.put("2019-07-07", "Taras Shevchenko - Kobzar");

        System.out.println("Welcome to library! For searching a book, please, enter the date in format 'year-mm-dd'");
        String date = scan.nextLine();
        searchByDate(library, date);
        System.out.println("If you want to see all dates of your visiting - enter 'y', if you want exit - press any key");
        String yes = scan.nextLine();
        if (yes.equals("y")) {
            System.out.println(library.keySet());
        } else {
            System.out.println("Have a nice day!");
        }

    }

}