import java.util.Scanner;
import javax.swing.JOptionPane;

public class Rain 
{

	public static void main(String[] args)
	{
		
		int answer = JOptionPane.showConfirmDialog( null, "Is it currently raining? ");
		boolean dry = (answer == JOptionPane.NO_OPTION);
		if (dry)
		{
			int answer1 = JOptionPane.showConfirmDialog( null, "Does it look like it might rain? ");
			boolean mightRain = (answer1 == JOptionPane.YES_OPTION);
			
			if (mightRain)
			{
				JOptionPane.showMessageDialog (null, "You should bring an umbrella. ");		
			}
			else
			{ 
				JOptionPane.showMessageDialog (null, "You should be fine without one. ");	
			}
		}
		else
		{ 
			JOptionPane.showMessageDialog (null, "You need an umbrella and you should put it up. ");	
		}
	}
	

}
