package practice;
// Print the Fibonacci Series Print the first N terms of the Fibonacci series using a for loop.


public class Fibonacci {
	public static void main(String args[])
	{
		// 0 1 2 3  5 14 19 25 18 30
		
				int a=0;
				int b=1;
				
				for (int i= 1; i<=10; i++) {
					System.out.print("  " +a);
					b= a+b;
					a= b-a;
				}
			}

		}

	


