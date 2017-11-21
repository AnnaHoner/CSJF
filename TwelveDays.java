public class TwelveDays {

	public static void main(String[] args) {
		int finalDay = 12;
		String dayName = "";
		int dayNum = 1;
		
		for (dayNum = 1; dayNum <= finalDay; dayNum++) {
			System.out.print("On the ");
			switch (dayNum) {
			case 1:
				dayName = "first";
				break;
			case 2:
				dayName = "second";
				break;
			case 3:
				dayName = "third";
				break;
			case 4:
				dayName = "fourth";
				break;
			case 5:
				dayName = "fifth";
				break;
			case 6:
				dayName = "sixth";
				break;
			case 7:
				dayName = "seventh";
				break;
			case 8:
				dayName = "eight";
				break;
			case 9:
				dayName = "ninth";
				break;
			case 10:
				dayName = "tenth";
				break;
			case 11:
				dayName = "eleventh";
				break;
			case 12:
				dayName = "twelfth";
				break;
			}

			System.out.print(dayName + " day of Christmas,\nMy true love sent to me,\n");

			switch (dayNum) {
			case 12:
				System.out.print("Twelve Drummers Drumming,\n");
			case 11:
				System.out.print("Eleven Pipers Piping,\n");
			case 10:
				System.out.print("Ten Lords a Leaping,\n");
			case 9:
				System.out.print("Nine Ladies Dancing,\n");
			case 8:
				System.out.print("Eight Maids a Milking,\n");
			case 7:
				System.out.print("Seven Swans a Swimming,\n");
			case 6:
				System.out.print("Six Geese a Laying,\n");
			case 5:
				System.out.print("Five Golden Rings,\n");
			case 4:
				System.out.print("Four Calling Birds,\n");
			case 3:
				System.out.print("Three French Hens,\n");
			case 2:
				System.out.print("Two Turtle Doves, and\n");
			default:
				System.out.print("A Partridge in a Pear Tree.\n\n");
				break;
			}
		}
	}

}
