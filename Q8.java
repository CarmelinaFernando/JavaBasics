// Implementing v^2=u^2-(2*a*s)

import java.util.*;
import java.lang.*;
class exp
{
	double v,u,a,s;
	void cal(float u, float a, float s)
	{
	v=Math.sqrt(u*u-(2*a*s));
	
        System.out.println("v="+v);
	}
 
}
class Q8
{
 public static void main(String []args)
  {
	Scanner ss= new Scanner(System.in);
 
	exp o=new exp();
	System.out.println("enter the value of  u , a ,s"); 
       
	float u=ss.nextFloat();
	float a=ss.nextFloat();
	float s=ss.nextFloat();
	o.cal(u,a,s);
       
     }
}