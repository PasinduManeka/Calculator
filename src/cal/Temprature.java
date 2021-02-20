package cal;

import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		double celcius, farenheit;
		
		System.out.print("Enter cecius value:");
		celcius = scan.nextDouble();

		farenheit = (celcius*(9/5))+32;
		
		System.out.println("Farenheit : "+farenheit+"F");

	}

}
