package com.regex;
/* As a User need to enter a valid Lastname
 * Last name starts with Cap and has minimum 3 characters
 */
import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println(userInputValidationUtil.isValidFirstName(firstName) ? "Valid" : "In Valid");
        System.out.println("Enter last name: ");
        String lastName = scanner.next();

        scanner.close();

        System.out.println(userInputValidationUtil.isValidLastName(lastName) ? "Valid" : "In Valid");
    }
}