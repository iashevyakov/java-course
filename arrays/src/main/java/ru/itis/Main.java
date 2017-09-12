package ru.itis;

import java.util.Scanner;

public class Main {
    private static Scanner sc;

    private static int m, n;

    private static int[][] a;

    private static int c = 1;


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        a = new int[m][n];
        run();
        show();
    }

    public static void run() {
        int i = 0;
        int j = 0;
        while (c-1 < m * n) {
            while (j < n && a[i][j] == 0) {
                a[i][j] = c;
                c++;
                j++;
            }
            j--;
            i++;
            while (i < m && a[i][j] == 0) {
                a[i][j] = c;
                c++;
                i++;
            }
            i--;
            j--;
            while (j >= 0 && a[i][j] == 0) {
                a[i][j] = c;
                c++;
                j--;
            }
            j++;
            i--;
            while (i >= 0 && a[i][j] == 0) {
                a[i][j] = c;
                c++;
                i--;
            }
            j++;
            i++;
        }
    }

    public static void show() {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(a[i][n - 1]);
        }

    }
}
