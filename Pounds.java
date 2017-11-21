import java.util.Scanner;
public class Pounds {

	public static void main(String[] args) 
	{
	
		final int SHILLINGS_IN_POUND = 20;
		final int PENNIES_IN_SHILLING = 12;
		final int PENNIES_IN_POUND = 100;
		final int OLDPENNY_TO_NEWPENNY = 67;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of old pounds: ");
		int old_Pounds = input.nextInt();
		System.out.print("Enter the amount of old shillings: ");
		int old_Shillings = input.nextInt();
		System.out.print("Enter the amount of old pennies: ");
		int old_Pennies = input.nextInt();
		
		int pounds_To_Shillings = old_Pounds * SHILLINGS_IN_POUND;
		int shillings_To_Pennies = (pounds_To_Shillings + old_Shillings) * PENNIES_IN_SHILLING;
		int new_Pennies = (shillings_To_Pennies + old_Pennies) * OLDPENNY_TO_NEWPENNY;
		
		int new_Pound = new_Pennies / PENNIES_IN_POUND;
		int new_Remainder = new_Pennies % PENNIES_IN_POUND; 
		//double new_Pound = (double) new_Pennies/PENNIES_IN_POUND;

		
		System.out.print ( old_Pounds + " old pounds and "+ old_Shillings + " old shillings and " + old_Pennies + " old pennies = £" + new_Pound + "." + new_Remainder ); 
		
		
	}

}
