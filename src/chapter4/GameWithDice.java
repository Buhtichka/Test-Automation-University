package chapter4;

import java.util.Random;

public class GameWithDice {
    public static void main(String[] args) {

        //Roll the dice - generate random number from 1 to 6

        int currentSpace = 0;
        int leftSpaces = 20;
        int maxRolls = 5;
        Random random = new Random();

        //After each roll tell the user which game space they are on and how many more spaces they have to go to win
        for(int i=0; i<=maxRolls; i++){

            int roll = i+1;

            int die = random.nextInt(6) + 1;

            currentSpace = currentSpace + die;
            leftSpaces = 20-currentSpace;

            System.out.println("Roll #" + roll + " You've rolled a " + die);

            if(leftSpaces == 0){
                System.out.println("Congrats! You win!");
                break;
            }
            else if(leftSpaces<0){
                System.out.println("Sorry, you lose.");
                break;
            }
            else if(i==maxRolls && currentSpace < 20){
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " + leftSpaces + " spaces. You lose!");

            }
            else {
                System.out.println("You are now on space " + currentSpace + " and have " + leftSpaces + " more to go.");
            }

        }

        //Repeat this additional 4 times - 5 times total

        //If user gets to 20 before 5 rolls end the game - they've won

        //If they're greater than or less than 20 spaces exactly, they lose

        //Message like "You advanced to space 22" is a bug
    }
}
