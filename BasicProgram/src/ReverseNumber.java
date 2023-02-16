
public class ReverseNumber {

	public static void main(String[] args) {
		
		int n= 12345;
		int x = 0;
		int a = 0;
		
		while(n>0) {
			a= n % 10;	//5, 4
			n = n/10;	//1234, 123
			x = x + a;	//5, 54, 
			
			if(n>0) {
				x = x * 10;	//50, 540
			}
		}
		System.out.print(x);
}

}
