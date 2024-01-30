package com.example.emiCalculator.service;

import com.example.emiCalculator.model.Loan;
import org.springframework.stereotype.Service;

@Service
public class EmiService {

     public double calculateEmi(Loan loan) {
        return loan.calculateEmi();
     }
}
