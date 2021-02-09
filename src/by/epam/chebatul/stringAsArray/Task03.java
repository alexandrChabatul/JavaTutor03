package by.epam.chebatul.stringAsArray;

/*
 В строке найти количество цифр.
 */

public class Task03 {

	public static void main(String[] args) {

		String str = "1 человек, 12 елок 3 медведя, 123364 шишки";

		int count;
		count = findNumberCount(str);
		System.out.println(str);
		System.out.println("В строке " + count + " цифр.");

	}

	public static int findNumberCount(String str) {

		char[] nums = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (char a : nums) {
				if (str.charAt(i) == a) {
					count++;
				}
			}
		}
		return count;
	}

}
