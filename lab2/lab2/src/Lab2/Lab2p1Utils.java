package Lab2;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Lab2p1Utils {
    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static void mulTest() {
        int res = 0;
        for (int i = 0; i < 5; i++) {
            int a = rand.nextInt(10);
            int b = rand.nextInt(10);
            int ans;

            System.out.print(String.format("How much is %d times %d? ", a, b));
            ans = sc.nextInt();
            if (ans == a * b)
                res++;
        }
        System.out.println(res + " answers out of 5 are correct.\n");
    }

    public static int divide(int m, int n) {
        int res = 0;
        while (m >= n) {
            m = m - n;
            res++;
        }
        return res;
    }

    public static int modulus(int m, int n) {
        return m - (divide(m, n) * n);
    }

    public static int countDigits(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0)
            return 1;

        int res = 0;
        while (n != 0) {
            n = n / 10;
            res++;
        }
        return res;
    }

    public static int position(int n, int digit) {
        int length = countDigits(n);
        for (int i = 1; i <= length; i++) {
            int curr = n % 10;
            if (curr == digit)
                return i;
            n = n / 10;
        }
        return -1;
    }

    public static long extractOddDigits(long n) {
        if (n < 0) {
            return -2;
        }

        long res = 0;
        int i = 0;
        boolean hasOdd = false;
        while (n != 0) {
            long curr = n % 10;
            if (curr % 2 != 0) {
                hasOdd = true;
                res += (long) curr * Math.pow(10, i);
                i++;
            }
            n = n / 10;
        }
        if (!hasOdd) return -1;
        return res;
    }

}
