import java.util.*;

class polydrome{
	public static void main(String arg[])
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		while(a>0){
					int b=a%10;
					
					sum=sum*10+b;
					a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("yes,polydrome is"+sum);
		}
		else{
			System.out.println("not polydrome is"+sum);
		}
	}
}