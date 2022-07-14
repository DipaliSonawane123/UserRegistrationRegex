package com.regex;

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
 * Should clear all the email samples provided separately
 */

public class UserInputValidationUtil {
    @FunctionalInterface
    public interface Validate {
        // Declaring an Abstract method
        boolean validate(String input);
    }
    
    //method validateFirstName to validate first name using regex using lambda function
    //method return - Validate type

    public static Validate validateFirstName() {
        return firstName -> firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    // method validateLastName to validate last name using regex using lambda function
     // Validate type
    public static Validate validateLastName() {
        return lastName -> lastName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    //Method validateEmail to validate email using regex using lambda function
     //return - Validate type
    public static Validate validateEmail() {
        return email -> email.matches("^[a-zA-Z-9]+([._+-]?[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})?$");
    }

    //method validateMobileNumber to validate mobile number using regex using lambda function
     //return - Validate type
    public static Validate validateMobileNumber() {
        return mobileNumber -> mobileNumber.matches("^[0-9]{2}[\\s][0-9]{10}$");
    }

    
     // method validatePassword to validate password using regex using lambda function
     //return - Validate type
    
    public static Validate validatePassword() {
        return password -> password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*" +
                "[\\@\\#\\^\\!\\$\\%\\&\\?][a-zA-Z0-9]*$");
    }
}