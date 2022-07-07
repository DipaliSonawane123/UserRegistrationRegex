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
     */

    public class UserRegistration {
        public static void main(String[] args) throws IOException {

<<<<<<< HEAD
    public static void main(String[] args) {
        UserInputValidationUtil registration=new UserInputValidationUtil(); // object of UserInputValidationUtil constructor
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("Enter choice.............\n "
                    +"1)UserName\n"   //uc1
                    +"2)LastName\n"
                    +"3)Email\n"
                    +"0) exit");

            int choice=sc.nextInt();

            switch(choice) {

                //for uc1 calling validateUsername method in this case
                case 1:
                    registration.validateUserName();
                    break;

                 // for uc2 calling validateLastname method in this case
                case 2:
                    registration.validateLastName();
                    break;

                 // for uc3 calling validateEmail method in this case
                case 3:
                    registration.validateEmail();
                    break;

                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }

    }

=======
            UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("******* FIRSTNAME VALIDATION *******");
                //Taking input from user and storing it in firstName
                System.out.println("Enter first name: ");
                String firstName = bufferedReader.readLine();
                System.out.println(userInputValidationUtil.isValidFirstName(firstName)? "Valid" : "InValid");

                System.out.println("******* LASTNAME VALIDATION *******");
                // Taking input from user and storing it in lastName
                System.out.println("Enter last name: ");
                String lastName = bufferedReader.readLine();
                System.out.println(userInputValidationUtil.isValidLastName(lastName) ? "Valid" : "InValid");


                System.out.println("******* EMAIL VALIDATION *******");
                //Taking input from user and storing it in email
                System.out.println("Enter email: ");
                String email = bufferedReader.readLine();
                System.out.println(userInputValidationUtil.isValidEmail(email) ? "Valid" : "InValid");


                System.out.println("******* MOBILE FORMAT VALIDATION *******");
                //Taking input from user and storing it in mobileNumber
                System.out.println("Enter Mobile Number: ");
                String mobileNumber = bufferedReader.readLine();
                System.out.println(userInputValidationUtil.isValidMobileNumber(mobileNumber) ? "Valid" : "InValid");


        }
    }
>>>>>>> UC4_MobileNoValidation
