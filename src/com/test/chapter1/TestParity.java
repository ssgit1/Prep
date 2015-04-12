package com.test.chapter1;

/**
 * Created by ss on 2/16/15.
 */
public class TestParity {
    public static short parity(long number) {
        short parity = 0;
        while (number > 0) {
            parity ^= number & 1;
            number = number >> 1;
        }
        return parity;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.println("Parity of " + i + " = " +  parity(i));
        }
    }
}
