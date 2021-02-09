package by.epam.chebatul.stringAsArray;

import java.util.Arrays;

/*
  Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task01 {

	public static void main(String[] args) {

		String[] names = { "camelCase", "javaTutor", "leaningJava" };
		
		String[] snakeCaseNames;
		
		snakeCaseNames = camelCaseToSnake_Case(names);
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(snakeCaseNames));

	}

	public static String[] camelCaseToSnake_Case(String[] camelCase) {

		String[] snakeCase = new String[camelCase.length];

		for (int i = 0; i < snakeCase.length; i++) {

			StringBuffer strBuffer = new StringBuffer();

			for (int j = 0; j < camelCase[i].length(); j++) {
				char tempChar = camelCase[i].toCharArray()[j];
				if (Character.isUpperCase(tempChar)) {
					strBuffer.append("_");
					strBuffer.append(Character.toLowerCase(tempChar));
				} else {
					strBuffer.append(tempChar);
				}
			}
			snakeCase[i] = strBuffer.toString();
		}
		return snakeCase;
	}

}