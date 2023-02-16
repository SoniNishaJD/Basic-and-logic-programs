
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 153;
			int temp = n;
			int a = 0;
			
			while(n>0) {
				int r = n % 10;
				a = (a) + (r * r * r);
				n = n / 10;
			}
			
			if(temp == a) {
				System.out.println("Yes, it is armstrong number");
			}else {
				System.out.println("it is not armstrong number");
			}
	}

}
