import java.util.*;

class linearsearch{
	public static void main(String[] arg)
	{
		int a[]={10,3,6,23,44};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter search item: ");

		int item=sc.nextInt();

		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==item){
				System.out.println("search element : "+i+"indexof");
			}
		}

	}
}