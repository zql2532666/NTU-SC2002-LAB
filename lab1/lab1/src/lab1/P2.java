package lab1;
import java.util.Scanner;

public class P2 {
	public static void main(String[] arrgs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        
        System.out.print("Enter your merit points: ");
        int meritPoint = sc.nextInt();
        
        char grade = 'A';
        
        if (salary >= 500 && salary <= 649) {
        	grade = 'C';
        	if (salary >= 600 && meritPoint >= 10) {
        		grade = 'B';
        	}
        }
        
        else if (salary >= 600 && salary <= 799) {
        	if (!(salary >= 700 && meritPoint >= 20)) {
        		grade = 'B';
        	}
        }

        
        System.out.println("salary: $" + salary + ", merit: " + meritPoint + " - Grade " + grade + ';');
	}
}
