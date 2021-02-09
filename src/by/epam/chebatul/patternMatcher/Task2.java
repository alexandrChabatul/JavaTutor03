package by.epam.chebatul.patternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.
 */

public class Task2 {

	public static void main(String[] args) {
		 String xmlDoc = "<notes>\n" +
                 "    <note id = \"1\">\n" +
                 "        <to>Вася</to>\n" +
                 "        <from>Света</from>\n" +
                 "        <heading>Напоминание</heading>\n" +
                 "        <body>Позвони мне завтра!</body>\n" +
                 "    </note>\n" +
                 "    <note id = \"2\">\n" +
                 "        <to>Петя</to>\n" +
                 "        <from>Маша</from>\n" +
                 "        <heading>Важное напоминание</heading>\n" +
                 "        <body/>\n" +
                 "    </note>\n" +
                 " </notes> \n";
		 
		 System.out.println(xmlAnalyzer(xmlDoc));

       

	}
	
	  private static String xmlAnalyzer(String xml) {
		    StringBuilder strBuilder = new StringBuilder();
	        Pattern Open = Pattern.compile("<\\w.+?>");
	        Pattern Close = Pattern.compile("</\\w+>");
	        Pattern Body = Pattern.compile(">.+<");
	        Pattern Empty = Pattern.compile("<\\w.+?/>");
		  
		 
		  String [] lines = xml.split("\n\\s*");
		  
		  for (String line : lines) {
	            Matcher mOpen = Open.matcher(line);
	            Matcher mClose = Close.matcher(line);
	            Matcher mBody = Body.matcher(line);
	            Matcher mEmpty = Empty.matcher(line);
	            if (mEmpty.find()) {
	                strBuilder.append(mEmpty.group());
	                strBuilder.append(" - тег без тела\n");
	            }
	            else if (mOpen.find()) {
	                strBuilder.append(mOpen.group());
	                strBuilder.append(" - открывающий тег\n");
	            }
	            if (mBody.find()) {
	                strBuilder.append(mBody.group().substring(1,mBody.group().length()-1));
	                strBuilder.append(" - содержимое тега\n");
	            }
	            if (mClose.find()) {
	                strBuilder.append(mClose.group());
	                strBuilder.append(" - закрывающий тег\n");
	            }

	        }
	        return strBuilder.toString();		  
		  
	    }

}