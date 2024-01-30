package com.example.emiCalculator.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoanTest {

    @Test
    public void testIsValidLoanWithValidData() {
        Loan loan = new Loan(29, 5, 10000);

        boolean isValid = loan.isLoanValid();

        assertTrue(isValid);
    }

    @Test
    public void testIsValidLoanWithInvalidData() {
        Loan loan = new Loan(-20, 5, 10000);

        boolean isValid = loan.isLoanValid();

        assertFalse(isValid);
    }

    @Test
    public void testIsValidLoanWithNegativeRate() {
        Loan loan = new Loan(10, -5, 10000);

        boolean isValid = loan.isLoanValid();

        assertFalse(isValid);
    }

    @Test
    public void testIsValidLoanWithZeroT() {
        Loan loan = new Loan(10, 5, 0);

        boolean isValid = loan.isLoanValid();

        assertFalse(isValid);
    }
}
