package com.example.emiCalculator.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoanEmiTest {

    @Test
    public void testCalculateEmiWithValidDataReturnsCorrectEmi() {
        double p = 12;
        double r = 5;
        double n = 10000;
        Loan loan = new Loan(p, r, n);

        double emi = loan.calculateEmi();

        assertEquals(92.48, emi, 0.01);
    }

}
