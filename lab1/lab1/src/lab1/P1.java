package lab1;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
        char c = sc.next().charAt(0);
        
        switch (c) {
        	case 'A':
        	case 'a':
        		System.out.printf("Action movie fan\n");
        		break;
        	case 'C':
        	case 'c':
        		System.out.printf("Comedy movie fan\n");
        		break;
        	case 'D':
        	case 'd':
        		System.out.printf("Drama movie fan\n");
        		break;
        	default:
        		System.out.printf("Invalid choice\n");
        }
        
	}
}
