package by.epam.chebatul.stringAndStringBuilder;

/*
  С помощью функции копирования и операции конкатенации составить из 
  частей слова “информатика” слово “торт”.
 */

public class Task04 {

	public static void main(String[] args) {

		String input = "информатика";
		System.out.println(input);
		System.out.println(makeWord(input));

	}

	public static String makeWord(String input) {
		String output = new String();
		output += input.charAt(input.indexOf('т'));
		output += input.substring(3, 5);
		output += input.charAt(input.indexOf('т'));
		return output;
	}

}
