package com.regex;
;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
     * As a User need to enter a valid FirstName
     * First name starts with Cap and has minimum 3 characters
     * As a User need to enter a valid Lastname
     * Last name starts with Cap and has minimum 3 characters
     * User need to enter a valid email
     * User need to follow pre-defined mobile format
     *   User need to follow pre-defined password rules
       * 1.minimum 8 characters
       * 2.Should have at least one upper case
     */

    public class UserRegistration {
        public static void main(String[] args) throws IOException {

            UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Select 1.firstname 2. lastname 3. email 4.Mobile no 5.password 6. exit");
            String a =bufferedReader.readLine();
            switch(a){
                case "1":
                System.out.println("******* FIRSTNAME VALIDATION *******");
                //Taking input from user and storing it in firstName
                System.out.println("Enter first name: ");
                String firstName = bufferedReader.readLine();
                System.out.println(userInputValidationUtil.isValidFirstName(firstName)? "Valid" : "InValid");
              break;

                case "2":
                System.out.println("******* LASTNAME VALIDATION *******");
                // Taking input from user and storing it in lastName
                System.out.println("Enter last name: ");
                String lastName = bufferedReader.readLine();
                System.out.println(userInputValidationUtil.isValidLastName(lastName) ? "Valid" : "InValid");
                break;
                case "3":
                System.out.println("******* EMAIL VALIDATION *******");
                //Taking input from user and storing it in email
                System.out.println("Enter email: ");
                String email = bufferedReader.readLine();
                System.out.println(userInputValidationUtil.isValidEmail(email) ? "Valid" : "InValid");
                break;
                case "4":
                System.out.println("******* MOBILE FORMAT VALIDATION *******");
                //Taking input from user and storing it in mobileNumber
                System.out.println("Enter Mobile Number: ");
                String mobileNumber = bufferedReader.readLine();
                System.out.println(userInputValidationUtil.isValidMobileNumber(mobileNumber) ? "Valid" : "InValid");
                break;
                case "5":
                System.out.println("******* PASSWORD VALIDATION *******");
                 //11.Taking input from user and storing it in password
                System.out.println("Please Enter Password: ");
                String password = bufferedReader.readLine();
                System.out.println(userInputValidationUtil.isValidPassword(password) ? "Valid" : "InValid");
                break;
                default:
                    System.out.println("Sucessfully validate");


        }
    }
    }