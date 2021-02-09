package by.epam.chebatul.stringAndStringBuilder;

/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
 */

public class Task09 {

	public static void main(String[] args) {

		String str = "GHJHJHJG ываываыва jjjjjGh";
		System.out.println(str);
		System.out.println("Прописные буквы - " + countUpperRegistrOfEnglishLetter(str));
		System.out.println("Строчные буквы - " + countLowerRegistrOfEnglishLetter(str));

	}

	public static int countUpperRegistrOfEnglishLetter(String str) {

		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				int tempUni = str.charAt(i);
				if (tempUni >= 65 && tempUni <= 90) {
					counter++;
				}
			}
		}
		return counter;
	}

	public static int countLowerRegistrOfEnglishLetter(String str) {

		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				int tempUni = str.charAt(i);
				if (tempUni >= 97 && tempUni <= 122) {
					counter++;
				}
			}
		}
		return counter;
	}

}