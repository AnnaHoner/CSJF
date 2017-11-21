import java.util.Scanner;

public class Stastics {
	public static void main(String[] args) {
		boolean finished = false;
		double oldAverage = 0;
		double oldVariance = 0;
		int count = 0;
		
		System.out.print("Enter your number (or type 'exit'): " );

		while (!finished)
		{
			Scanner numberScanner = new Scanner( System.in );
			if (numberScanner.hasNextDouble())
			{
				count++;
				int countMinusOne = count - 1;
				double number = numberScanner.nextDouble(); 
				
				double averageNumber = oldAverage + ((number - oldAverage)/count);
				double variance = ((oldVariance * (countMinusOne)) + (number - oldAverage) *(number - averageNumber))/count;
		
				oldVariance = variance;
				oldAverage = averageNumber;
				System.out.print("So far the average is " + averageNumber + " and the variance is " + variance + "." +
						"\nEnter your number (or type 'exit'): ");
				
			}
			else if (numberScanner.hasNext("exit") || (numberScanner.hasNext("quit")) || (numberScanner.hasNext("Exit")) 
					||(numberScanner.hasNext("Quit")))
			{
				System.out.println( "Goodbye. ");
				finished = true;
				numberScanner.close();
			} 
			else System.out.print("Not a valid number. Please enter a number (or type 'exit'): "); 
		}
	}
}
