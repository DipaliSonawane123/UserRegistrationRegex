package com.regex;
<<<<<<< HEAD
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
=======

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * As a User need to enter a valid FirstName
 * First name starts with Cap and has minimum 3 characters
 * As a User need to enter a valid Lastname
 * Last name starts with Cap and has minimum 3 characters
 * User need to enter a valid email
 * User need to follow pre-defined mobile format
 */

public class UserInputValidationUtil {
    // Creating isValidFirstName to method validate the first name given by user using regex
    public static boolean isValidFirstName(String firstName) {
        String firstNameRegex =  "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);
>>>>>>> UC4_MobileNoValidation

        Matcher matcher = p.matcher(userName);

        boolean result = matcher.matches();

        if (result) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }

<<<<<<< HEAD
    //method to check LastName Valid or Invalid
    public void validateLastName() {

        System.out.println("Enter LastName");
        String lastName = sc.next();

        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
=======
    //Creating isValidLastName method  to validate the last name given by user using regex
    public static boolean isValidLastName(String lastName) {
        String lastNameRegex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

      // Creating isValidEmail method  to validate the email given by user using regex

    public static boolean isValidEmail(String email) {

        String emailRegex = "^[a-z]{3}[a-zA-Z.]{0,}+@+bl.co+[a-z.]{0,}$";

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);
>>>>>>> UC4_MobileNoValidation

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

     //Creating isValidMobileNumber method to validate the mobile format given by user using regex
    public static boolean isValidMobileNumber(String mobileNumber) {
        String mobileNumberRegex = "^[0-9]{2}[\\s][0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
}

