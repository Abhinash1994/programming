import java.util.*;

class starPrint{
	
	public static void main(String arg[])

	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");

			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}
	
				function createdAt(x) {
        					x= new Date(x);
        				    var y = x.getFullYear().toString();
        				    var m = (x.getMonth() + 1).toString();
        				    var d = x.getDate().toString();
        				    (d.length == 1) && (d = '0' + d);
        				    (m.length == 1) && (m = '0' + m);
        				    var yyyymmdd = y + " / " + m + " / " + d;
        				    return yyyymmdd;
				      }
 var paymentdate = createdAt($scope.paymentDate.value);