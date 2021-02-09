package by.epam.chebatul.stringAndStringBuilder;

/*
 * Проверить, является ли заданное слово палиндромом.
 */

public class Task03 {

	public static void main(String[] args) {

		String word = "worow";
		System.out.println(word);
		System.out.println(isPalindrome(word));

	}

	public static boolean isPalindrome(String word) {
		return word.equals(getPalindrome(word));
	}

	public static String getPalindrome(String word) {
		StringBuilder builder = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) {
			builder.append(word.charAt(i));
		}
		return builder.toString();
	}

}
