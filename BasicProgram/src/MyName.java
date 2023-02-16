
public class MyName {
	
	public static void main(String[] args) {
		
	      MyName pattern = new MyName();
	      pattern.text();
		}

		public void text() {
			int r=5;
			int c=8; 
			String str = "NISHA";
			String word="";
			for(int i=0; i<r; i++) {
				for(int k=0; k<str.length();k++)
				{
					     
					     if(str.charAt(k)=='N') {	word = NN[i];}
					else if(str.charAt(k)=='I') {	word = II[i];}
					else if(str.charAt(k)=='S') {	word = SS[i];}
					else if(str.charAt(k)=='H') {	word = HH[i];}
					else if(str.charAt(k)=='A') {	word = AA[i];}
					
					else {continue;}
					for(int j=0; j<c; j++) {
					    if(word.charAt(j) == '1') {
						System.out.print("*");}
					    else {
					    	System.out.print(" ");
					    }
					
					}
				}
				System.out.println();
			}

		}
		String AA[] = { "00011000", "00100100", "01000010", "01111110", "01000010" };
		String HH[] = { "10000001", "10000001", "11111111", "10000001", "10000001" };
		String II[] = { "11111111", "00011000", "00011000", "00011000", "11111111" };
	    String NN[] = { "10000001", "10110001", "10011001", "10001101", "10000001" };
		String SS[] = { "01111111", "11000000", "01111110", "00000011", "11111110" };
		
}
