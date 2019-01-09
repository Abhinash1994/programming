import java.util.*;
class recursionfact{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number = ");
		int a=sc.nextInt();
  int i,fact=1;    
  fact = factorial(a);   
  System.out.println("Factorial  is: "+fact);    
 }  
}  