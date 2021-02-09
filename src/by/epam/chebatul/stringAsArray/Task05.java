package by.epam.chebatul.stringAsArray;

/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */

public class Task05 {

	public static void main(String[] args) {

		String str = "  I    see  this word, hear this word, feel this   word     everywhe   r   e .  ";
		System.out.println(str);
		String correctStr = deleteSpaceRepeat(str);
		System.out.println(str);
		System.out.println(correctStr);

	}

	public static boolean isSpace(char ch) {

		boolean result = false;
		if (ch == ' ') {
			result = true;
		}
		return result;
	}

	public static String deleteSpaceRepeat(String str) {

		StringBuilder strBuilder = new StringBuilder();

		String tempStr = str.trim();

		for (int i = 0; i < tempStr.length(); i++) {
			if (!isSpace(tempStr.charAt(i))) {
				strBuilder.append(tempStr.charAt(i));
			} else {
				if (!isSpace(tempStr.charAt(i + 1))) {
					strBuilder.append(' ');
				}
			}
		}
		return strBuilder.toString();
	}

}