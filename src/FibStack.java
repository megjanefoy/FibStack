import java.util.Scanner;
import java.util.Stack;
/**************************************************************
 Author's Panther ID: 3276301
 Purpose: This program takes in a user number 1 to 90, inclusive
	      and creates a Stack list of the Fibonacci sequence. It 
	   	  then returns the correlating Fibonacci number.
 Certification: I hereby certify that this work is my own
   		  and none of it is the work of any other person.
**************************************************************/
public class FibStack {
	
	/* This method takes in a user number 1 to 90, inclusive
	 * and creates a Stack list of the Fibonacci sequence. It 
	 * then returns the correlating Fibonacci number.
	 * 
	 * @param n  ,the number to find the correlating Fibonacci.
	 * @return   ,the corresponding Fibonacci number.
	 */
	public static long fib(int n){
		Stack<Integer> fibStack = new Stack<>();  //Stack for Fibonacci sequence
		long fibNum = 0;
		int temp1 = 0;
		int temp2 = 0;
		fibStack.push(1);
		fibStack.push(1);
		for(int i = 3; i <= n; ++i){              //loops n times
			temp1 = fibStack.pop();
			temp2 = fibStack.peek();
			fibStack.push(temp1);
			fibStack.push(temp1+temp2);           //adds Fibonacci number to Stack
		}
		fibNum = fibStack.peek();
		return fibNum;                            //returns Fibonacci(n)
	}
	
	/*
	 * Main Method
	 * 
	 */
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int userNum = 0;
		long result = 0;
		System.out.print("Enter a Number 1 to 90, Inclusive: ");
		if(scnr.hasNextInt()){	                  //obtains user's number
			userNum = scnr.nextInt();
			if (userNum < 1 || userNum > 90) {    //checks for range 1-90, inclusive
				System.out.println("INVALID NUMBER, Please Enter a Number 1 to 90, Inclusive.");
			}
			else {
				result = fib(userNum);           //obtains Fibonaccia(n)
				System.out.println("The Fibonacci number for " + userNum + " is: " + result);
			}
		}
	}
}
