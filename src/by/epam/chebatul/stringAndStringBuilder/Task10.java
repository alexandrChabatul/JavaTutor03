package by.epam.chebatul.stringAndStringBuilder;

/*
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X
 */

public class Task10 {

	public static void main(String[] args) {
		
		String test = "One. Two! Three? Four.";
		System.out.println(test);
		System.out.println("Предлжений - "+ sentenceCount(test));
		

	}
	
	public static int sentenceCount(String str) {
		String [] senStrings = str.split(". | \\! | \\?");
		for (String s : senStrings) {
			System.out.println(s);
		}	
		return senStrings.length;
	}

}