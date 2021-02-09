package by.epam.chebatul.stringAndStringBuilder;

/*
 Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task06 {

	public static void main(String[] args) {

		String str = "This is our string.";
		System.out.println(str);
		System.out.println(duplicateAllChars(str));

	}

	public static String duplicateAllChars(String str) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			builder.append(str.charAt(i));
			builder.append(str.charAt(i));
		}
		return builder.toString();
	}

}