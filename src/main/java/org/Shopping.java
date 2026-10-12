package org;

import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        List<Double> prices = List.of(
                259.5,
                1999.9,
                837.3,
                129.1,
                77.7
        );
        double budget = 1000.00;
        int i = 0;
        int bought = 0;
        double totals = 0; // сколько денег потратили
        while (i < prices.size() && totals + prices.get(i) <= budget) {
            totals += prices.get(i);
            bought++;
            i++;
        }

        System.out.println("Куплено: " + bought + " товара на сумму " + totals);
        System.out.println("Остаток бюджета: " + (budget - totals));
        System.out.println("Не куплено: " + (prices.size() - bought) + " товаров");

    }
}