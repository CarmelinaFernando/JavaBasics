// Implementing encapsulation and inheritance

import java.util.Scanner;

class employee
{
  String name;
  float sal;
  employee(String name,float sal)
  {
	this.name=name;
	this.sal=sal;
  }

  void display()
  {
	System.out.println(" Name: "+ name);
	System.out.println(" Salary: "+ sal);
  }

}

class manager extends employee
{
  String dep;
  
  manager(String name,float sal,String dep)
  {

    super(name,sal);
    this.dep=dep;
  }

 void display()
  {
	System.out.println(" Name: "+ name);
	System.out.println(" Salary: "+ sal);
        System.out.println(" Department: "+dep);
  }
}

class testing
{
  public static void main(String args[])
  {

	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your name,salary and department");
	String name=s.next();
	float sal=s.nextFloat();
	String dep=s.next();
        manager m=new manager(name,sal,dep);
	m.display();
	
  }
}

	
	