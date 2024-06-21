package com.example.basic_calculator.services;

import org.springframework.stereotype.Service;

@Service
public class BasicCalculatorService {
    
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}
