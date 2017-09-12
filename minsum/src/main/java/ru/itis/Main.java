package ru.itis;

import java.util.Scanner;

public class Main {

    private static int[] a;

    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        int n = sc.nextInt();

        a = new int[n];

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        MinAbsSum.countMinAbsSum(a);

    }

}
