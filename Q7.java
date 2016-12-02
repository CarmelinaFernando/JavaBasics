//Implementing s=ut+(1/2*a*t*t)

import java.util.*;
class exp
{
	float s,u,a,t;
	void cal(float u, float a, float t)
	{
	s=u*t+(0.5f*a*t*t);
        System.out.println("s="+s);
	}
 
}
class Q7 
{
 public static void main(String []args)
  {
	Scanner s= new Scanner(System.in);
 
	exp o=new exp();
	System.out.println("enter the value of  u , a ,t"); 
       
	float u=s.nextFloat();
	float a=s.nextFloat();
	float t=s.nextFloat();
	o.cal(u,a,t);
       
     }
}