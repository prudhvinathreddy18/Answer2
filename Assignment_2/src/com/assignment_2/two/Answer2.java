package com.assignment_2.two;

import java.util.Scanner;


class SentenceProcessor
{
  
private String sentence;
  
 
public SentenceProcessor (String sentence)
  {
	
this.sentence = sentence;
  
}
  
 
public void checkWordPresence (String word)
  {
	
if (sentence.contains (word))
	  {
		
System.out.println (word + " is present in the sentence");
	  
}
	else
	  {
		
System.out.println (word + " is not present in the sentence");
	  
}
  
}

}


 
public class Answer2
{
  
public static void main (String[]args)
  {
	
Scanner scanner = new Scanner (System.in);
	
 
System.out.println ("Enter the sentence");
	
String inputSentence = scanner.nextLine ();
	
 
System.out.println ("Enter the word");
	
String inputWord = scanner.nextLine ();
	
 
SentenceProcessor sentenceProcessor =
	  new SentenceProcessor (inputSentence);
	
sentenceProcessor.checkWordPresence (inputWord);

} 
} 
