package ru.neoflex.holidaypaycalc.model;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
  public String calculate(String holidayDaysCount, String middleSalary) {
    double workDaysCount = 21;

    if (holidayDaysCount == null || middleSalary == null){
      return "Для рассчетов необходимы оба параметра!";
    }
    if (holidayDaysCount.equals("") || middleSalary.equals("")){
      return "Да, такая проверка тоже есть =)";
    }
    double dMiddleSalary = Double.parseDouble(middleSalary.replace(',', '.'));
    double dHolidayDaysCount = Double.parseDouble(holidayDaysCount);

    if (dMiddleSalary <= 0 || dHolidayDaysCount <= 0) {
      return "Введите числа больше ноля!";
    }

    double weekendSalary = (dMiddleSalary / workDaysCount) * dHolidayDaysCount;
    return String.format("%.2f", weekendSalary);
  }
}
