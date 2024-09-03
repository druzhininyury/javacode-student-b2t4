package ru.javacode.student;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Filter<String> filter = string -> string.toUpperCase();
        String[] arrayIn = {"one", "two", "three"};
        String[] arrayOut = Filterer.filter(arrayIn, filter);

        System.out.println(Arrays.toString(arrayOut));

    }

}
