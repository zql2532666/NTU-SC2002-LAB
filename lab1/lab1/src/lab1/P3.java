package lab1;
import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		double CONVERSION_RATE = 1.82;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter starting value: ");
		int start = sc.nextInt();
		
		System.out.print("Enter ending value: ");
		int end = sc.nextInt();
		
		System.out.print("Enter increment value: ");
		int increment = sc.nextInt();
		
		if (start > end) {
			System.out.println("Error input!");
			return;
		}
		
		System.out.println("US$\tS$");
		System.out.println("------------");
		
		// using for loop
		for (int i = start; i <= end; i += increment) {
			System.out.println(i + "\t" + CONVERSION_RATE * i);
		}
		System.out.println();
		
		// using while
		System.out.println("US$\tS$");
		System.out.println("------------");
		int curr = start;
		while (curr <= end) {
			System.out.println(curr + "\t" + CONVERSION_RATE * curr);
			curr += increment;
		}
		System.out.println();
		
		// using do/while
		System.out.println("US$\tS$");
		System.out.println("------------");
		int curr2 = start;
		do {
			System.out.println(curr2 + "\t" + CONVERSION_RATE * curr2);
			curr2 += increment;
		}while(curr2 <= end);
		
		
	}
}
