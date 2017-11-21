import java.util.Scanner;
import java.util.Random;

public class Cipher {

	public static void main(String[] args) {
		String[] alphabetArr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z", " " };
		String[] cipherArr = { "" };

		System.out.print("Enter the phrase you would like to encrypt: ");
		Scanner phraseScanner = new Scanner(System.in);
		String input = phraseScanner.nextLine();
		input = input.toLowerCase();
		char[] phraseArr = input.toCharArray();
		encrypt(phraseArr, alphabetArr, cipherArr);
	}

	public static String[] createCipher(String[] alphabetArr) 
	{
		String[] cipherArr = new String[alphabetArr.length];
		System.arraycopy(alphabetArr, 0, cipherArr, 0, alphabetArr.length);
		Random rn = new Random();

		for (int index = 0; index < cipherArr.length; index++) 
		{
			int randomPosition = rn.nextInt(cipherArr.length);
			String temp = cipherArr[index];
			cipherArr[index] = cipherArr[randomPosition];
			cipherArr[randomPosition] = temp;
		}
		return cipherArr;
	}

	public static String[] encrypt(char[] phraseArr, String[] alphabetArr, String[] cipher) 
	{
		System.out.print("The Cipher is : ");
		cipher = createCipher(alphabetArr);
		printArray(cipher);
		
		char[] encryptedChar = { '\0' };
		String[] encryptedArray = { "" };
		
		String phraseLetters = "";
		String originalPhrase = "";
		String encryptedPhrase = "";
		int alphabetLength = 27;

		for (int index = 0; index < phraseArr.length; index++) 
		{
			char characterChar = phraseArr[index];
			String characterStr = String.valueOf(characterChar);

			for (int index2 = 0; index2 < alphabetLength; index2++) 
			{
				String currentLetter = alphabetArr[index2];
				if (characterStr.equals(currentLetter)) 
				{
					String cipherLetter = cipher[index2];
					encryptedPhrase += cipherLetter;
					
					encryptedArray = new String[] { encryptedPhrase };						//converting String into String[]
					encryptedChar = encryptedPhrase.toCharArray();							//converting String[] into char[]
					phraseLetters = crypt(encryptedChar, index2);							//crypt each individual character
					originalPhrase = originalPhrase + phraseLetters;
				}
			}
		}

		System.out.print("\nThe phrase encrytped is : ");
		for (char output : encryptedChar) 
		{
			System.out.print(output);
		}
		System.out.print("\nThe decrypted phrase is : " + originalPhrase);
		return encryptedArray;
	}

	public static String crypt(char[] encryptedArray, int position) 
	{
		//I am unsure if I was allowed to add an extra input to this function,
		//so there's is one line of duplication with the alphabetArr declaration 
		
		String[] alphabetArr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z", " " };
		String originalPhrase = "";
		originalPhrase = originalPhrase + alphabetArr[position];
		return originalPhrase;
	}

	public static void printArray(String[] array) 
	{
		for (int index = 0; index < array.length; index++) 
		{
			if (array.length - index == 1) {
				System.out.print(array[index] + ".\n");
			} else
				System.out.print(array[index] + ", ");
		}

	}
}
