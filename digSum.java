// Finding the sum of squares of the digits of a number

import java.util.Scanner;

class sum
{
 int sum=0,r,n;

 void input()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("enter the number");
   n=s.nextInt();
  }

  void compute()
  {
    while(n>0)
    {
    	r=n%10;
    	sum+=r*r;
    	n=n/10;
    }
   System.out.println("sum of square of digits is: " + sum);
  }
}

class digSum
{
 public static void main(String args[])
 {
   sum ss=new sum();
   ss.input();
   ss.compute();
 }
}