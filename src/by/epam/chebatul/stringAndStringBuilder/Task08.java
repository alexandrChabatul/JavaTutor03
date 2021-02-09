package by.epam.chebatul.stringAndStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
 */

public class Task08 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = new String();
		try {
			System.out.print("Введите строку слов: ");
			str = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(str);
		System.out.println("Самое длинное слово - " + findLongestWord(str));

	}

	public static String findLongestWord(String str) {
		int maxLen = 0;
		String maxLenWord = "";
		String[] tempStr = str.split(" ");
		for (int i = 0; i < tempStr.length; i++) {
			if (tempStr[i].length() > maxLen) {
				maxLen = tempStr[i].length();
				maxLenWord = tempStr[i];
			}
		}
		return maxLenWord;
	}

}
