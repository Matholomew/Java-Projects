/*Matthew Jeffery
 * 27/07/2016
 * */
package pwords;

public class Words {

	private String message;
	private String word1;
	private String word2;
	private String word3;
	private String word4;
	
	public Words(String message) 
	{
	this.message = message;
	int first = message.indexOf("*");
	int sec =	message.indexOf("*");		//find where all the stars are
	int third = message.indexOf("*");
	int four = message.indexOf("*");

	word1 = message;
	word2 = message;
	word3 = message;		//find each word
	word4 = message;
	
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public String exWords()
	{
		//return the 4 words
		String wordsEx = message;
		wordsEx.indexOf("*");
		return wordsEx;
	}
	
	public String reverseWords()
	{
		//return the original message
		  StringBuilder input1 = new StringBuilder();
		  input1.append(message);
		  input1=input1.reverse(); 
		
		  return input1.toString();
	}
	
	public String toString()
	{
		return message.toString();
	}
}
