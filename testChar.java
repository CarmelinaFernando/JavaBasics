// Finding the number of characters in a string and displaying it 

import java.util.Scanner;
import java.lang.*;

class nChar
{
  String str;
  int count=0,i;
  void input()
   {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a string");
	str=s.next();
	for(i=0;i<str.length();i++)
	{
	  count++;
	}
        System.out.println("number of characters= "+count);
   }
}

class testChar
{
  public static void main(String args[])
  {
	nChar c=new nChar();
	c.input();
   }
}
