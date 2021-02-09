package by.epam.chebatul.stringAndStringBuilder;

/*
  Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task05 {

	public static void main(String[] args) {
		String str = "A string is an ordered sequence of characters."
				+ " In Java, a string is the primary carrier of textual information.";
		System.out.println(str);
		System.out.println("Буква 'a' встречается " + findAllEntryOfChar(str, 'a') + " раз.");

	}

	public static int findAllEntryOfChar(String str, char ch) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				counter++;
			}
		}
		return counter;
	}

}
