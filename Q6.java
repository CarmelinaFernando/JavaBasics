// Implementing v=u+at

import java.util.*;
class exp
{
	float v,u,a,t;
	void cal(float u, float a, float t)
	{
	v=u+a*t;
        System.out.println("v="+v);
	}
 
}
class Q6
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