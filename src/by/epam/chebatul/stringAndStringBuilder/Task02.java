package by.epam.chebatul.stringAndStringBuilder;

/*
 В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task02 {

	public static void main(String[] args) {

		String str = "A string is an ordered sequence of characters."
				+ " In Java, a string is the primary carrier of textual information.";
		String temp = replaceAtoAB(str);
        System.out.println(str);
        System.out.println(temp);
		
		
	}

	public static String replaceAtoAB(String str) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				builder.append("ab");
			} else {
				builder.append(str.charAt(i));
			}
		}
		return builder.toString();
	}

}