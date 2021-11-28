package com.company;

import java.util.Arrays;
import java.util.List;

public class KCities_better01 {

    static List<String> cities = Arrays.asList("seoul", "tokyo", "sydney", "london");

    public static void main(String[] args) {
        // declarative style
        System.out.println("Found Tokyo? : " + cities.contains("tokyo"));
    }
}
