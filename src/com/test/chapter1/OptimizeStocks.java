package com.test.chapter1;

import java.util.Arrays;

/**
 * Created by ss on 2/19/15.
 */
public class OptimizeStocks {

    public static void findBestPoints(int[] prices) {
        int min = 0;
        int buy = 0;
        int max = 0;
        int sell = 0;
        int diff = 0;
        boolean first = true;
        int i = -1;
        for (int p : prices) {
            i++;
            if (first) {
                min = p;
                max = p;
                first = false;
                continue;
            }
            if (p < min) {
                min = p;
                max = p;
            }
            else if (p > max) {
                max = p;
                if (max - min > diff) {
                    buy = min;
                    sell = max;
                    diff = max - min;
                }
            }
        }
        System.out.println("Buy: " + buy + ", Sell: " + sell + " => Diff: " + diff);
    }

    public static void main(String[] args) {

        int[] prices = new int[] {7, 8, 15, 8, 3, 10, 2, 7, 8};
        System.out.println("Input: " + Arrays.toString(prices));
        findBestPoints(prices);

    }
}
