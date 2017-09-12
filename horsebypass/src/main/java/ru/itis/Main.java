package ru.itis;

import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        HorseBypass bypass = new HorseBypass(i,j);
        bypass.horseByPass();
    }



}
