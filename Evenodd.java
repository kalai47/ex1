public class EvenOdd 
{

public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int num;
	System.out.println("enter the value of num");
    num=s.nextInt();
    s.close();
    if(num==0)
    {
    	System.out.println("the given num is ZERO");
    }
    else  if(num%2==0)
     {
    	 System.out.println("the given num is EVEN");
     }
     else
     {
    	 System.out.println("the given num is (not even)ODD");
     }
     
}

}
