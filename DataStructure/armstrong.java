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



 <tr ng-repeat="x in quartlyData">

          <td>{{x.parlorName}}</td>
          <td>{{x.quarterDate | date : 'sort'}}</td>
          <td >{{x.supportTypes[0].usageThisMonth}}</td>
          <td >{{x.supportTypes[1].usageThisMonth}}</td>
          <td >{{x.supportTypes[2].usageThisMonth}}</td>
            <td >{{x.supportTypes[0].usageThisMonth+x.supportTypes[1].usageThisMonth+x.supportTypes[2].usageThisMonth}}</td> 
        <td >{{x.supportTypes[1].totalUsageAllowed*3}}</td>
         <td ></td>
          <td ></td>