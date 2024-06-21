package com.example.basic_calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestExecution;

import com.example.basic_calculator.controllers.BasicCalculatorController;
import com.example.basic_calculator.services.BasicCalculatorService;

public class BasicCalculatorControllerTest {


    private BasicCalculatorService basicCalculatorService = new BasicCalculatorService();
    private BasicCalculatorController basicCalculatorController = new BasicCalculatorController(basicCalculatorService);

    @Test
    public void testAdd() {
        assertEquals(12, basicCalculatorController.add(8, 4));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, basicCalculatorController.subtract(8, 4));
    }
    
}
