import java.util.*;

class binarysearch{
	public static void main(String[] arg)
	{
		int a[]={2,5,7,9,12,14,16,17,19,20,24,28};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter search item: ");

		int item=sc.nextInt();

		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi){
			if(a[mi] == item){
				System.out.println("element is "+mi+"index of");
				break;
			}
			else if(a[mi]<item){
				li=mi+1;
			}
			else{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi){
			System.out.println("element not found");
		}

	}
}