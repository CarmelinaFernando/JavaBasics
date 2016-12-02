// Average rating of 5 costumers for a mobile

import java.util.*;

class rating
{
  String a[]=new String[5];
  int b[]=new int[5];
  int i,sum=0;
  float avg;
  Scanner s=new Scanner(System.in);

  void input()
  {
	System.out.println("...........Mobile Rating........\n");
	for(i=0;i<5;i++)
	{
	  System.out.println("enter your name and rating");
	  a[i]=s.next();
	  b[i]=s.nextInt();
 	}
  }	   

  void display()
  {
	for(i=0;i<5;i++)
	{
	  System.out.println(" Name: "+a[i]);
	  System.out.println(" Rating: "+b[i]);
	  
	}
	for(i=0;i<5;i++)
	 {
	   sum+=b[i];
	 }
	avg=sum/5.0f;
	System.out.println(" \n Average Rating: "+ avg);
   }
}


class testrate
{
  public static void main(String args[])
   {
       rating r=new rating();
	r.input();
	r.display();
    }
}
