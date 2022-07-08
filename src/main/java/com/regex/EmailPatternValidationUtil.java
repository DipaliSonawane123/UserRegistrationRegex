package com.regex;
/*
 * Validate Email Address with regex
 * 1.Validate first mandatory part i.e; abc
 * 2.Ensure @ and validate the mandatory second part i.e; bridgelabz
 * 3.Ensure "." after bridgelabz and validate the mandatory third part i.e; co
 * 4.Now validate optional part i.e; xyz in abc.xyz@bridgelabz.co
 * and make sure only following are valid special characters _,+,-,. preceding to xyz
 * 5.Finally, validate the expression with supporting optional parts i.e;
 * TLD only 2 characters
 */
import java.util.regex.Pattern;

public class EmailPatternValidationUtil {

    public boolean isValidEmail(String email) {

         //Regex to check first mandatory part i.e; abc, @, bridgelabz, ".", co and xyz and .in

        String emailRegex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@" +
                "([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}" +
                "(?:(\\.([A-Za-z]{2})))?$";


        Pattern pattern = Pattern.compile(emailRegex);

        if (email == null)
            return false;

        return pattern.matcher(email).matches();
    }
}
