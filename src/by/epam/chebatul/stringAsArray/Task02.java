package by.epam.chebatul.stringAsArray;

/*
 Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task02 {

	public static void main(String[] args) {
		
		String str = "I see this word, hear this word, feel this word everywhere.";
		String letter = changeWordToLetter(str);
		System.out.println(str);
		System.out.println(letter);

	}
	
	public static String changeWordToLetter(String str) {
		 StringBuilder strBuilder = new StringBuilder();
	     String newStr;
	     for (int i = 0; i < str.length(); i++) {
	         if (i + 3 < str.length() && str.charAt(i) == 'w'
	                                  && str.charAt(i + 1) == 'o'
	                                  && str.charAt(i + 2) == 'r'
	                                  && str.charAt(i + 3) == 'd') {
	             strBuilder.append("letter"); // Swap word
	             i += 3;
	         } else {
	             strBuilder.append(str.charAt(i));
	         }
	     }
	     newStr = strBuilder.toString();
	     return newStr;		
	}

}