package chapter3;

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String[] args) {
        //Object to enter enough change to equal exactly $1

        //Ask for pennies, nickels, dimes and quarters
        System.out.println("How many pennies?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickels?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters?");
        int quarters = scanner.nextInt();

        //Count the value
        int nickelsValue = nickels*5;
        int dimesValue = dimes*10;
        int quartersValue = quarters*25;
        int totalValue = pennies+nickelsValue+dimesValue+quartersValue;
        int difference;

        //If it's exactly $1 they win. If more than 1 tell them exactly how much are they over. If it's less tell exactly how much they're short of.
        if (totalValue==100){
            System.out.println("Congrats! You win!");
        }
        else if(totalValue<100){
            difference = 100-totalValue;
            System.out.println("Sorry! You're "+difference + " pennies short.");
        }
        else if(totalValue>100){
            difference = totalValue-100;
            System.out.println("Sorry! You're "+ difference + " pennies over.");
        }


    }
}
