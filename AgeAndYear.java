import javax.swing.JOptionPane;
import java.util.Calendar;

public class AgeAndYear {

	public static final int MAX_AGE = 123;
	public static final int MIN_AGE = 0;

	public static void main(String[] args) {
		int age = 0;

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);

		int minYear = (year - MAX_AGE);
		int maxYear = (year + MAX_AGE);

		for (age = MIN_AGE; age < (MAX_AGE); age++) {
			int SquareAge = age * age;
			if (((SquareAge - age) > (minYear)) && ((SquareAge + age) < maxYear))

				JOptionPane.showMessageDialog(null, "The age is " + age + " and the year is " + SquareAge + ".");
		}
	}
}
