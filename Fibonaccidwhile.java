package practice;

public class Fibonaccidwhile {
	public static void main(String args[])
	{
		int num = 19;
		int a = 1;
		int b = 2;
		
		do {
			System.out.println(a);
			int n= a+b;
			a=b;
			b=n;
			num --;
		}
		while(num > 0);
	}

}



