package by.epam.chebatul.stringAndStringBuilder;

/*
 Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
 */

public class Task01 {

	public static void main(String[] args) {

		String str = "      Дан текст   (строка). Найдите наибольшее количество подряд идущих пробелов в нем";
		System.out.println(str);
		System.out.println("Максимум пробелов подряд - " + findMaxSmaceNum(str));

	}

	public static int findMaxSmaceNum(String str) {

		int max = 0;
		int tempCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				tempCount++;
			} else {
				max = Math.max(max, tempCount);
				tempCount = 0;
			}

		}
		return max;
	}

}
