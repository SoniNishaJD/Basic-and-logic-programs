
public class NumberPattern {

	public static void main(String[] args) {
		int n=5;
		//number001(n);	//1-left triangle
		//number002(n);
		number003(n);
		
	}
	public static void number001(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("1");
			}
			System.out.println();
		}
		
	}
	
	public static void number002(int n) {
		int i,j,number=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		
	}
	
	public static void number003(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
}
