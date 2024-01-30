package com.example.emiCalculator.controller;

import com.example.emiCalculator.model.Loan;
import com.example.emiCalculator.service.EmiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmiController {

    private EmiService emiService;

    public EmiController(EmiService emiService){
        this.emiService = emiService;
    }

    @PostMapping("/calculateEmi")
    public ResponseEntity calculateEmi(@RequestBody Loan loan){
        if (!loan.isLoanValid()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid loan data");
        }
        double emi = this.emiService.calculateEmi(loan);
        return ResponseEntity.status(HttpStatus.OK).body(emi);
    }
}
