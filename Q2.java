// Printing "hello world" 5 times using do-while

class hello
{
  void display()
  {
  int n=1;
    do
    {
	System.out.println("hello world");
        n++;
    }while(n<=5);

}
}
class Q2 
{
 public static void main(String []args)
  {
	hello o=new hello();
        o.display();
       
     }
}