package com.example.test;

import static org.junit.Assert.assertTrue; // Mengimpor metode assertTrue dari pustaka JUnit
import org.junit.Test; // Mengimpor anotasi @Test dari pustaka JUnit

public class EmailValidatorTest {
    @Test //  @Test marks the method as JUnit test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        String validEmail = "anisa@gmail.com"; //valid email

        assertTrue(EmailValidator.isTrue(validEmail)); //calls the method "assertTrue" to check if the validation process is correct
    }
}
