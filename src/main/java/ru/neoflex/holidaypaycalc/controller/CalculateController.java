package ru.neoflex.holidaypaycalc.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.holidaypaycalc.model.Calculator;
import ru.neoflex.holidaypaycalc.model.entity.WeekendSalary;

@RestController
public class CalculateController {

  private final Calculator calculator;

  public CalculateController(Calculator calculator){
    this.calculator = calculator;
  }

  @GetMapping("/calculate")
  public WeekendSalary calculateController(@RequestParam String daysOfWeekend, String middleSalary){
    String weekendSalary = calculator.calculate(daysOfWeekend, middleSalary);
    return new WeekendSalary(weekendSalary);
  }

}
