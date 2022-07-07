package com.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserInputValidationUtil {
    Scanner sc = new Scanner(System.in);

    // method to check username Valid or Invalid
    public void validateUserName() {

        System.out.println("Enter UserName");
        String userName = sc.next();
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";

        Pattern p = Pattern.compile(regex);

        Matcher matcher = p.matcher(userName);

        boolean result = matcher.matches();

        if (result) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }

    //method to check LastName Valid or Invalid
    public void validateLastName() {

        System.out.println("Enter LastName");
        String lastName = sc.next();

        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";

        Pattern p = Pattern.compile(regex);

        Matcher matcher = p.matcher(lastName);

        boolean result = matcher.matches();

        if (result) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }

    //method to check Email Valid or Invalid
    public void validateEmail() {
        System.out.println("Enter Email");
        String email = sc.next();

        /*.
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(email);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }
    }
}
