package ru.netology.stats;

public class StatsService {

  // Сумму всех продаж
  public long countSumOfSales(long[] salesOnMonths) {
    long sum = 0;
    for (long month : salesOnMonths) {
      sum += month;
    }
    return sum;
  }

  // Средняя сумма продаж в месяц
  public long countAverageSum(long[] salesOnMonths) {
    long sum = 0;
    long lenght = salesOnMonths.length;
    for (long month : salesOnMonths) {
      sum += month;
    }
    return sum / lenght;
  }

  // Номер месяца, в котором был пик продаж
  public long monthOfMaxSales(long[] salesOnMonths) {
    long numberOfMonthSale = salesOnMonths[0];
    long indexOfMonth = 0;

    for(int i = 0; i < salesOnMonths.length; i++) {
      if (salesOnMonths[i] >= numberOfMonthSale) {
        numberOfMonthSale = salesOnMonths[i];
        indexOfMonth = i + 1;
      }
    }
    return indexOfMonth;
  }

  // Номер месяца, в котором был минимум продаж
  public long monthOfMinSales(long[] salesOnMonths) {
    long numberOfMonthSales = salesOnMonths[0];
    long indexOfMonth = 0;
    for (int i = 0; i < salesOnMonths.length; i++) {
       if (salesOnMonths[i] <= numberOfMonthSales) {
        numberOfMonthSales = salesOnMonths[i];
        indexOfMonth = i + 1;
      }
    }
    return indexOfMonth;
  }

  // Кол-во месяцев, в которых продажи были ниже среднего
  public long monthsUnderAverage(long[] salesOnMonths) {
    long average = countAverageSum(salesOnMonths);
    long newMonths = 0;
    for (long month : salesOnMonths) {
      if (month < average) {
        newMonths++;
      }
    }
    return newMonths;
  }

  // Кол-во месяцев, в которых продажи были ниже среднего
  public long monthsOverAverage(long[] salesOnMonths) {
    long average = countAverageSum(salesOnMonths);
    long newMonths = 0;
    for (long month : salesOnMonths) {
      if (month < average) {
        newMonths++;
      }
    }
    return newMonths;
  }
}