package com.assignment_2.two;
import java.util.Scanner;


 
class Prudhvi
{
  
private String sentence;
  
 
public Prudhvi (String sentence)
  {
	
this.sentence = sentence;
  
}
  
 
public void arrangeLetters ()
  {
	
if (isValidInput ())
	  {
		
String[]words = sentence.split (" ");
	  
for (String word:words)
		  {
			
String sortedWord = sortLetters (word);
			
System.out.print (sortedWord + " ");
		  
}
	  
}
	else
	  {
		
System.out.println (sentence + " is an invalid input");
	  
}
  
}
  
 
private boolean isValidInput ()
  {
	
return sentence.matches ("^[a-z ]+$");
  
}
  
 
private String sortLetters (String word)
  {
	
char[] charArray = word.toCharArray ();
	
java.util.Arrays.sort (charArray);
	
return new String (charArray);
  
}

}


 
public class Answer3
{
  
public static void main (String[]args)
  {
	
Scanner scanner = new Scanner (System.in);
	
 
System.out.println ("Enter the sentence");
	
String inputSentence = scanner.nextLine ();
	
 
SentenceProcessor sentenceProcessor =
	  new SentenceProcessor (inputSentence);
	
Prudhvi prudhvi = new Prudhvi(null);
prudhvi.arrangeLetters();

} 
} 
