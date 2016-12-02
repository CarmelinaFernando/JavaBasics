// Printing even numbers using do-while

class num
{
  void display()
  {
  int n=2;
    do
    {
	System.out.print(n+"\t");
	n+=2;
    }while(n<=100);

}
}
class Q3
{
 public static void main(String []args)
  {
	num o=new num();
        o.display();
       
     }
}