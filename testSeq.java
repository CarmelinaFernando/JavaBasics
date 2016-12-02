// Printing a sequence

class sequence
{
  int i,j;
  
  void display()
  {
	for(i=1;i<6;i++)
	{
	  for(j=1;j<i;j++)
	   {
		System.out.print("*");
		
	   }
           System.out.println();
	}
  }
}

class testSeq
{
  public static void main(String args[])
   {
	sequence s=new sequence();
	s.display();
   }
}
