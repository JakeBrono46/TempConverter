import java.util.*;

public class TempConverter {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter temperature: ");
		double degrees = console.nextDouble();
		String temp = console.next();
		System.out.println();
		
		if(temp.equals("F")) {
			
			//Convert Fahrenheit to Celcius
			degrees = ((degrees - 32) * 5) / 9;
			System.out.printf("Temp in C: %.2f", degrees);
			
		}else {
			
			//Convert Celcius to Fahrenheit
			degrees = ((degrees * 9) / 5) + 32;
			System.out.printf("Temp in F: %.2f", degrees);
		}
	}

}
