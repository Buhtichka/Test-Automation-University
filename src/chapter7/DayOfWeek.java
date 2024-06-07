package chapter7;

//Make an array that holds its actual values of the days of the week, and then have the user input a number corresponding to some day of the week.
// And assume that the week starts on Monday.
//
//Your program should output the String that represents the day of the week that corresponds to the number that the user input.
// For example, if the user inputs the number 1, your program should print “Monday”.

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Initialize the array with the days of the week
        String[] daysOfWeek = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number for the day of the week
        System.out.println("Enter a number (1 for Sunday, 2 for Monday, ..., 7 for Saturday):");
        int dayNumber = scanner.nextInt();

        // Check if the input number is valid
        if (dayNumber >= 1 && dayNumber <= 7) {
            // Access and print the corresponding day
            System.out.println("The day of the week is: " + daysOfWeek[dayNumber - 1]);
        } else {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        // Close the scanner
        scanner.close();
    }
    }


