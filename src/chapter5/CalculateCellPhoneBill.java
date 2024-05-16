package chapter5;


import java.util.Scanner;

//Calculate the final total of phone bill
//Input plan fee and number of overage minutes
//Charge 0.25 for every minute they were over their plan and 15% tax on subtotal
//Separate methods to calculate tax, overage fee and final total
//Print result
public class CalculateCellPhoneBill {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        double planFee = getPlanFee();

        double overageMinutes = getOverageMinutes();


        scanner.close();

        double overageFee = getOverageFee(overageMinutes);

        double total = getTotal(planFee, overageFee);


    }

    public static double getPlanFee(){
        System.out.println("Enter your plan fee:");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static double getOverageMinutes(){
        System.out.println("Enter number of overage minutes:");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes;
    }

    public static double getOverageFee(double overageMinutes){
        double overageFee = overageMinutes*0.25;
        return overageFee;
    }

    public static double getTotal(double planFee, double overageFee){
        double subtotal = planFee+overageFee;
        double total = subtotal+(subtotal*0.15);
        System.out.println("The total phone bill is $"+ String.format("%.2f", total));
        return total;
    }

}
