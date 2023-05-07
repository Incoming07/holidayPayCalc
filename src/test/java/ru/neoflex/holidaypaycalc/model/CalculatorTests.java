package ru.neoflex.holidaypaycalc.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTests {
  Calculator calculator = new Calculator();

  @Test
  public void zeroSalaryTest() {
    String result = calculator.calculate("1", "0");

    Assertions.assertEquals("Введите числа больше ноля!", result);
  }

  @Test
  public void zeroDaysTest() {
    String result = calculator.calculate("0", "1");

    Assertions.assertEquals("Введите числа больше ноля!", result);
  }

  @Test
  public void zeroAllTest() {
    String result = calculator.calculate("0", "0");

    Assertions.assertEquals("Введите числа больше ноля!", result);
  }

  @Test
  public void negativeTest() {
    String result = calculator.calculate("0", "-1");

    Assertions.assertEquals("Введите числа больше ноля!", result);
  }

  @Test
  public void weekendSalaryTest() {
    String result = calculator.calculate("10", "100000");

    Assertions.assertEquals("47619,05", result);
  }

  @Test
  public void weekendRandomSalaryTest() {
    String randomMiddleSalary = String.format("%.2f", Math.random() * 10000);
    String result = calculator.calculate("21", randomMiddleSalary);

    Assertions.assertEquals(randomMiddleSalary, result);
  }

  @Test
  public void commaTest() {
    String result = calculator.calculate("21", "1000,00");

    Assertions.assertEquals("1000,00", result);
  }

  @Test
  public void nullTest() {
    String result = calculator.calculate(null, "1000,00");

    Assertions.assertEquals("Для рассчетов необходимы оба параметра!", result);
  }

  @Test
  public void clearStringTest() {
    String result = calculator.calculate("", "1000,00");

    Assertions.assertEquals("Да, такая проверка тоже есть =)", result);
  }



}
