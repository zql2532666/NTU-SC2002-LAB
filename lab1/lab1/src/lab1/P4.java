package lab1;
import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height: ");
		int height = sc.nextInt();
		
		if (height <= 0) {
			System.out.println("Error input!");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= height; i++) {
			if (i % 2 == 0) 
				sb.insert(0, "BB");
			else
				sb.insert(0, "AA");
			
			System.out.println(sb.toString());
		}
	}
}
