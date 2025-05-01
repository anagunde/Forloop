Loop :-  
       Example :-                                                                                                      
     1) PrimeNumber :-

       package Loop;
// Check if a Number is prime  or composite for Loop and If- else

public class PrimeNumber {
	public static void main(String args[])	{
		int num = 55;
		for (int i = 1; i <= num;)	{
			if (num % i == 0){
				System.out.println("Prime ");
				break;	}
			else {
				System.out.println("Composite");
				break;
			}
		}
  }
		
	
