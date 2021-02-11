import java.util.*;
class amplicable_no
{
	public static void main(String[] args)
	{
		Scanner sr=new Scanner(System.in);
		int n1,n2,sum=0,sum1=0;
		System.out.println("Enter the two no.");
		n1=sr.nextInt();
		n2=sr.nextInt();
		for(int i=1;i<n1;i++)
		{
			if(n1%i==0)
			{
				sum+=i;
			}	
		}
		for(int j=1;j<n2;j++)
		{
			if(n2%j==0)
			{
				sum1+=j;
			}	
		}
		if(n1==sum1 && n2==sum)
		{
			System.out.println("The no.'s are Amicable");
		}
		else
		{
			System.out.println("The no.'s are not Amicable");	
		}
	}
}