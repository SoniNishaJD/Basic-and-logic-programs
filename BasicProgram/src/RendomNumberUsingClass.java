import java.util.Random;

public class RendomNumberUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Random random = new Random();
			int x= random.nextInt(50);
			int y= random.nextInt(100);
			
			System.out.println("Randomly generated integer values:");
			System.out.println(x);
			System.out.println(y);
	}

}
