package chapter8;
//The password must be at least eight characters long, contain an uppercase letter, contain a special character, not contain the username and not be the same as the old password.

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your username: ");
        String username = scanner.next();

        System.out.println("Type your new password: ");
        String password = scanner.next();

        System.out.println("Type your old password: ");
        String oldPassword = scanner.next();

        scanner.close();

        if (isValidPassword(username, password, oldPassword)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }


    }

    public static boolean isValidPassword(String username, String password, String oldPassword) {
        if (password.length() < 8) {
            return false;
        }
        if (password.contains(username)) {
            return false;
        }
        if (password.equals(oldPassword)) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasSpecialCharacter = false;

        char ch;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
        }

        for (char cha : password.toCharArray()) {
            // Check if the character is not a letter or a digit
            if (!Character.isLetterOrDigit(cha)) {
                hasSpecialCharacter = true; // Special character found
            }


        }
        return hasUpperCase && hasSpecialCharacter;

    }
}


