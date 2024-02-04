package com.assignment_2.two;

import java.util.Scanner;


class BookingAutomation
{
  
private String customerName;
  
private int numAdults;
  
private int numChildren;
  
private int numDays;
  
 
public BookingAutomation (String input)
  {
	
String[]details = input.split (":");
	
this.customerName = details[0];
	
this.numAdults = Integer.parseInt (details[1]);
	
this.numChildren = Integer.parseInt (details[2]);
	
this.numDays = Integer.parseInt (details[3]);
  
} 
 
public void validateInput ()
  {
	
if (numAdults < 0)
	  {
		
System.out.println ("Invalid input for number of adults");
	  
}
	else if (numChildren < 0)
	  {
		
System.out.println ("Invalid input for number of children");
	  
}
	else if (numDays <= 0)
	  {
		
System.out.println ("Invalid input for number of days");
	  
}
	else
	  {
		
calculateBookingPrice ();
	  
}
  
}
  
 
private void calculateBookingPrice ()
  {
	
int totalCost = (numAdults * 1000 + numChildren * 650) * numDays;
	
System.out.println (customerName +
						 " your booking is confirmed and the total cost is " +
						 totalCost);

} 
} 
 
public class Answer_1

{
  
public static void main (String[]args)
  {
	
Scanner scanner = new Scanner (System.in);
	
 
System.out.println ("Enter the customer details");
	
String userInput = scanner.nextLine ();
	
 
BookingAutomation booking = new BookingAutomation (userInput);
	
booking.validateInput ();

} 
} 
