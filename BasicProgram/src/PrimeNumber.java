
public class PrimeNumber {

	int i, m = 0;
	int n=10;
	m=n/2;
	
	
	if(n==0||n==1)
	{
		System.out.println(n + " is not prime number ");
	}else
	{
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println(n + " is not prime number ");
				break;
			}
		}
		if (n % i != 0) {
			System.out.println(n + " is prime number ");
		}
	}
}}
