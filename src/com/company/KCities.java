package com.company;

import java.util.Arrays;
import java.util.List;

public class KCities {

    static List<String> cities = Arrays.asList("seoul", "tokyo", "sydney", "london");

    public static void main(String[] args) {
        boolean found = false;

        for (String city : cities) {
            System.out.println(city);

            if (city.equals("tokyo")) {
                found = true;
                break;
            }
        }
        System.out.println("Found Tokyo? : " + found);
    }
}
