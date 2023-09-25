package conditional_statements_questions;

import java.util.Scanner;

public class no_is_odd_or_even {

	public static void main(String[] args) {
	
		int n;
		System.out.println("enter your no");
		Scanner sc =new Scanner(System.in);
 	  n=sc.nextInt();
 	  if(n%2==0)
 	  {
 		 System.out.println("no is even");
 		 }
 	  else
 	  {
 		 System.out.println("no is odd");
  		
 	  }
 		}

}
