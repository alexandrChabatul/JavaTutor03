package by.epam.chebatul.patternMatcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.
 */

public class Task1 {

	public static void main(String[] args) {
		String str = "Первый абзац слов. Был. Здесь точно когда-то.\n" + "Второй словесный. Абзац.\n"
				+ "Трейтий самый большой в мире абзац. Абзац! Из!\n" + "Четвертый? Абзац! Из. Предложений.\n"
				+ "Пятый. Заключительный абзац ааа! Тестовый ааааа!";

		start(str);

	}

	public static void start(String str) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String input = "";

		while (!input.equals("exit")) {
			System.out.println("Веберите действие: \n" + "1 - сортировка абзацев по к-ву предложений;\n"
					+ "2 - сортировка слов в предложениях по длине;\n"
					+ "3 - сортировка лексем по убыванию количества совпадений введенного символа;\n"
					+ "exit - для выхода.");
			input = sc.next();

			if (input.equals("1")) {
				System.out.println(paragraphSort(str));
			}
			if (input.equals("2")) {
				System.out.println(wordsSort(str));
			}
			if (input.equals("3")) {
				System.out.println(sortByLexems(str));
			}
			if (input.equals("exit")) {
				System.out.println("exit");
			}

		}
	}

	public static String paragraphSort(String str) {
		String[] paragraphs = str.split("\n");
		int[] parLength = new int[paragraphs.length];
		int maxLen = 0;

		for (int i = 0; i < paragraphs.length; i++) {
			String[] sentence = splitSentences(paragraphs[i]);
			parLength[i] = sentence.length;
			maxLen = Math.max(maxLen, parLength[i]);
		}
		StringBuilder build = new StringBuilder();

		for (int i = 0; i <= maxLen; i++) {
			for (int j = 0; j < parLength.length; j++) {
				if (i == parLength[j]) {
					build.append(paragraphs[j] + "\n");
				}
			}
		}
		return build.toString();

	}

	public static String wordsSort(String str) {
		String[] paragraphs = str.split("\n");

		StringBuilder build = new StringBuilder();

		for (String par : paragraphs) {
			String[] sentence = splitSentences(par);
			for (int i = 0; i < sentence.length; i++) {
				String[] word = splitWords(sentence[i]);

				for (int j = word.length - 1; j >= 0; j--) {
					for (int k = 0; k < j; k++) {
						if (word[k].length() > word[k + 1].length()) {
							String temp = word[k];
							word[k] = word[k + 1];
							word[k + 1] = temp;
						}
					}
				}
				for (int j = 0; j < word.length; j++) {
					build.append(word[j] + "\s");
				}
				build.append(". ");
			}
			build.append("\n");
		}
		return build.toString();

	}

	public static String sortByLexems(String str) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input = new String();

		try {
			System.out.print("Введите строку: ");
			input = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Pattern pattern = Pattern.compile(input);

		String[] paragraphs = str.split("\n");

		StringBuilder build = new StringBuilder();

		for (String par : paragraphs) {
			String[] sentence = splitSentences(par);
			for (String sen : sentence) {
				String[] word = splitWords(sen);

				for (int j = word.length - 1; j >= 0; j--) {
					for (int i = 0; i < j; i++) {
						int count1 = 0;
						int count2 = 0;
						Matcher matcher1 = pattern.matcher(word[i]);
						Matcher matcher2 = pattern.matcher(word[i + 1]);
						while (matcher1.find()) {
							count1++;
						}
						while (matcher2.find()) {
							count2++;
						}
						if (count1 < count2) {
							String temp = word[i];
							word[i] = word[i + 1];
							word[i + 1] = temp;
						} else if (count1 == count2) {
							String[] temp = { word[i], word[i + 1] };
							Arrays.sort(temp);
							word[i] = temp[0];
							word[i + 1] = temp[1];
						}
					}
				}
				for (String w : word) {
					build.append(w + " ");
				}
				build.append(". ");
			}
			build.append("\n");
		}
		return build.toString();

	}

	private static String[] splitSentences(String text) {
		Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
		return pattern.split(text);
	}

	private static String[] splitWords(String sentence) {
		Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
		return pattern.split(sentence);
	}

}
