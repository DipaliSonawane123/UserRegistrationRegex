package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * As a User need to enter a valid FirstName
 * First name starts with Cap and has minimum 3 characters
 * As a User need to enter a valid Lastname
 * Last name starts with Cap and has minimum 3 characters
 * User need to enter a valid email
 * User need to follow pre-defined mobile format
 * User need to follow pre-defined password rules
    * 1.minimum 8 characters
    * 2.Should have at least one upper case
    * 3.Should have at least one numeric character
    * 4.Has exactly one special character
 */

public class UserInputValidationUtil {
    // Creating isValidFirstName to method validate the first name given by user using regex
    public static boolean isValidFirstName(String firstName) {
        String firstNameRegex =  "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }

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

        return matcher.matches();
    }

     //Creating isValidMobileNumber method to validate the mobile format given by user using regex
    public static boolean isValidMobileNumber(String mobileNumber) {
        String mobileNumberRegex = "^[0-9]{2}[\\s][0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

     //Creating isValidPassword method to validate the password given by user using regex

    public static boolean isValidPassword(String password) {
        System.out.println(password);

        String passwordRegex ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_+=-]).{8,}$";

        Pattern pattern = Pattern.compile(passwordRegex);

        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}


