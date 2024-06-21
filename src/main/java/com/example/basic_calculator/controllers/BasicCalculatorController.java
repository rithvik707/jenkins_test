package com.example.basic_calculator.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic_calculator.services.BasicCalculatorService;

@RestController
@RequestMapping("/api")
public class BasicCalculatorController {

    private final BasicCalculatorService basicCalculatorService;

    public BasicCalculatorController(BasicCalculatorService basicCalculatorService) {
        this.basicCalculatorService = basicCalculatorService;
    }

    @PostMapping("/add")
    public int add(@RequestParam int firstNum, @RequestParam int secondNum) {
        return basicCalculatorService.add(firstNum, secondNum);
    }

    @PostMapping("/subtract")
    public int subtract(@RequestParam int firstNum, @RequestParam int secondNum) {
        return basicCalculatorService.subtract(firstNum, secondNum);
    }



}