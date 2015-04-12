package com.test.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ss on 2/8/15.
 */
public class PrimeNumber {

    public static boolean isGreaterThan2(int number) {
        return number > 2;
    }

    public static int processData(int data) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return data * data;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Prime Numbers:");
        list.parallelStream()
                .filter(PrimeNumber::isGreaterThan2)
                .map(PrimeNumber::processData)
                .forEach(System.out::println);
    }
}
