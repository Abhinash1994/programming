import java.util.*;

class fibonancy{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int n=0;
		int n1=1;
		System.out.print(+n+" "+n1);
		for(int i=0;i<=a;i++){
			int n3=n+n1;
			System.out.print(" "+n3);
			n=n1;
			n1=n3;
		} 
	}
}