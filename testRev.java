// Reversing a String

import java.util.Scanner;

class revStr
{

  String str, rstr;
  int i;
  void reverse()
  {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a string");
	str=s.next();
	rstr="";
        for(i=str.length()-1;i>=0;--i)
	{
	  rstr+=str.charAt(i);
	}
        System.out.println("Reversed string is: "+rstr);
  }
}

class testRev
{
  public static void main(String args[])
   {
	revStr r=new revStr();
	r.reverse();
   }
}