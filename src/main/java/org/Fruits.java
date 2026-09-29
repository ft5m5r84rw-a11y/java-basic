package org;

import java.util.List;

public class Fruits {

    public static void main(String[] args) {
        List<String> fruits = List.of(
                "Яблоко",
                "Банан",
                "Апельсин",
                "Груша",
                "Мандарин"
        );

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i+1 + ". " + fruits.get(i));
        }

    }
}
