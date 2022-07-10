package com.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserInputValidationUtilTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidFirstName("Dipali");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidFirstName("Pr");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenFirstName_WithSplChar_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidFirstName("Pr@gna");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenFirstName_WithNumber_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidFirstName("Pr12na");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidLastName("Kasthuri");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidLastName("Ka");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WithSplChar_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidLastName("K@sthuri");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WithNumber_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidLastName("K23thu6i");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidEmail("kpragna.25@gmail.com");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidEmail("Kpragna..675.gmail.com");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidMobileNumber("91 9087654321");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidMobileNumber("908765-4321908");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result =userInputValidationUtil.isValidPassword("P@ssw0rd");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WithoutCapitalLetter_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidPassword("hgsuyds5ndj@");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidPassword("bsdj@HhcsBB");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WithoutSplChar_ShouldReturnFalse() {
        UserInputValidationUtil userInputValidationUtil = new UserInputValidationUtil();
        boolean result = userInputValidationUtil.isValidFirstName("Pvhs5665vhj");
        Assertions.assertFalse( result);
    }
}


