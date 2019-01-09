import java.util.*;

class armstrong{
	public static void main(String arg[])
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		while(a>0){
					int b=a%10;
					sum+=(b*b*b);
					a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("yes,armstrong is"+sum);
		}
		else{
			System.out.println("not armstrong is"+sum);
		}
	}
}