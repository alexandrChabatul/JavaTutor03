package by.epam.chebatul.stringAsArray;

/*
 В строке найти количество чисел.
 */

public class Task04 {

	public static void main(String[] args) {
		
		String str = "sasd 12 f 123123 gg 56.78, 5666 6, 5. 1.";
		System.out.println(str);
		System.out.println(countNum(str));
		
		

	}

	public static boolean isDigit(char ch) {

		boolean result = false;
		char[] nums = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		for (char a : nums) {
			if (ch == a) {
				result = true;
			}
		}
		return result;
	}

	public static int countNum(String str) {
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (isDigit(str.charAt(i))) {
				if (i == str.length() - 1 || !isDigit(str.charAt(i + 1))) {
					if (!(i < str.length() - 2 && str.charAt(i + 1) == '.')) {
						counter++;
					} else if (i == str.length() - 2 && str.charAt(i + 1) == '.'
							|| !isDigit(str.charAt(i + 2))) {
						counter++;
					}
				}
			}
		}
		return counter;
	}

}