package br.com.isaccanedo;

import java.util.Random;

public class Main {

    static Random rand = new Random();
    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[pRand(20)];
        System.out.println(
                "Comprimento de a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer(pRand(500));
            System.out.println(
                    "a[" + i + "] = " + a[i]);

        }
    }
}
