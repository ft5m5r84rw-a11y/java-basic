package org;

import java.util.List;
import java.util.Locale;

public class Prices {
    public static void main(String[] args) {
        List<Double> prices = List.of(
                259.5,
                1999.9,
                837.3,
                129.1,
                77.7
        );
        double budget = 3500.00;

        double total = 0;
        for (double price : prices) {
            total += price;
        }
        System.out.printf(Locale.US, "Сумма всех товаров: %.2f%n", total);

        // вывести, хватает ли бюджета
        System.out.println("Бюджет: " + budget);
        if (total > budget) {
            System.out.println("Бюджета не хватает. " + " Не хватает " + (total - budget));
        } else {
            System.out.printf(Locale.US, "Бюджета хватает. Остаток: %.2f%n", budget - total);
        }


    }
}
