package chapter2;

import java.util.Scanner;

public class CupsOfCoffee {

    public static void main(String arg[]){

        System.out.println("Write a season");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Write an adjective");
        String adjective = scanner.next();

        System.out.println("Write number of coffees");
        int coffees = scanner.nextInt();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + coffees + " cups of coffee.");



    }
}
