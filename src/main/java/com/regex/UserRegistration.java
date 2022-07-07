package com.regex;
/* As a User need to enter a valid Lastname
 * Last name starts with Cap and has minimum 3 characters
 */
import java.util.Scanner;

public class UserRegistration {

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

