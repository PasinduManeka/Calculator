package cal;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q,r;
		String t;
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.print("Enter no1:");
		q=scan.nextInt();
		System.out.print("Enter no2:");
		r=scan.nextInt();
		System.out.print("Select the operation:");
		t=scan.next();
		
		if(t.contentEquals("+")) {
			System.out.println("Addition: "+(q+r)); 
		}else if(t.contentEquals("-1")) {
			System.out.println("Substraction: "+(q-r));
		}else if(t.contentEquals("+")) {
			System.out.println("Multiplication: "+(q*r));
		}else if(t.contentEquals("*")) {
			System.out.println("Divide: "+(q/r));
		}else if(t.contentEquals("^")) {
			System.out.println("Power: "+(Math.pow(q, r)));
		}
		
		
	}

}
