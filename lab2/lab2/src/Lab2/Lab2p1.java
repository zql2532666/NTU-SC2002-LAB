package Lab2;

import java.util.Scanner;
import Lab2.Lab2p1Utils;

public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: miltiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            int m, n;

            switch (choice) {
                case 1:
                    Lab2p1Utils.mulTest();
                    break;

                case 2:
                    System.out.print("\nEnter m and n: ");
                    m = sc.nextInt();
                    n = sc.nextInt();
                    System.out.println(m + " / " + n + " = " + Lab2p1Utils.divide(m, n) + "\n");
                    break;

                case 3:
                    System.out.print("\nEnter m and n: ");
                    m = sc.nextInt();
                    n = sc.nextInt();
                    System.out.println(m + " % " + n + " = " + Lab2p1Utils.modulus(m, n) + "\n");
                    break;

                case 4:
                    System.out.print("\nEnter n: ");
                    n = sc.nextInt();
                    int res = Lab2p1Utils.countDigits(n);
                    System.out.println("n: " + n + " - count = " + (res == -1 ? "Error input !!" : res) + "\n");
                    break;
                case 5:
                    System.out.print("\nEnter n and digit: ");
                    n = sc.nextInt();
                    int digit = sc.nextInt();
                    System.out.println("position = " + Lab2p1Utils.position(n, digit));
                    break;
                case 6:
                    System.out.print("\nEnter n: ");
                    n = sc.nextInt();
                    long res2 = Lab2p1Utils.extractOddDigits(n);
                    System.out.println("oddDigits = " + (res2 == -2 ? "Error input !!" : res2) + "\n");
                    break;

                case 7:
                    System.out.println("Program terminating ….");
                    return;
            }

            sc.nextLine();
            System.out.print("Press enter key to continue...\n");
            sc.nextLine();

        } while (choice < 7);
    }
}
