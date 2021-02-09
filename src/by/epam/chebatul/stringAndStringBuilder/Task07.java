package by.epam.chebatul.stringAndStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef"
 */

public class Task07 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = new String();
		try {
			System.out.print("Input the string: ");
			str = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(str);
		System.out.println(deleteSpaseAndRepeat(str));

	}

	public static String deleteSpaseAndRepeat(String str) {

		StringBuilder builder = new StringBuilder(str);

		for (int i = 0; i < builder.length(); i++) {
			if (builder.charAt(i) == ' ') {
				builder.deleteCharAt(i);
				i--;

			}
			for (int j = i + 1; j < builder.length(); j++) {
				if (builder.charAt(j) == builder.charAt(i)) {
					builder.deleteCharAt(j);
					j--;
				}
			}
		}
		return builder.toString();
	}

}