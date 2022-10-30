package org.xavier.designpatterns.DecoratorPattern.CoffeCase;

import java.util.*;

public abstract class AbstractBeverage {
    String description = "default description for beverage";

    public int romanInt(String s) {
        HashMap<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        int res = 0, sLen = s.length();

        //iterate over the string
        for (int cursor = 0; cursor < sLen - 1; cursor++) {
            Character currentLetter = s.charAt(cursor), nextLetter = s.charAt(cursor + 1);

        }

        return 0;
    }
    public abstract double cost();
}
