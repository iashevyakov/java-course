package ru.itis;

public class MinAbsSum {


    public static void countMinAbsSum(int[] a) {

        int sum, k, minsum = 0;


        int n = a.length;

        int[] sums = new int[(int) Math.pow(2, n - 1)];

        for (int elem : a) {
            minsum += elem;
        }

        for (int i = 0; i < Math.pow(2, n - 1); i++) {
            sum = a[0];
            k = i;
            for (int j = n - 1; j >= 1; j--) {

                if (k % 2 == 1) {
                    sum += a[j];
                } else {
                    sum -= a[j];
                }

                k /= 2;
            }
            if (Math.abs(sum) <= Math.abs(minsum)) {
                minsum = sum;
            }
            sums[i] = sum;

        }

        showResult(a, minsum, sums);
    }

    public static void showResult(int[] a, int minsum, int[] sums) {
        int n = a.length;
        System.out.println(Math.abs(minsum));

        for (int m = 0; m < Math.pow(2, n - 1); m++) {
            if (sums[m] == minsum) {
                System.out.print(a[0]);
                int c = m;
                for (int i = n - 1; i >= 1; i--) {
                    if (c % 2 == 1) {
                        System.out.print("+" + a[i]);
                    } else {
                        System.out.print("-" + a[i]);
                    }
                    c /= 2;
                }
            }
            System.out.println("");
        }
    }
}
