package encryptionproject;

public class findFactors {
	
	public static int num = 12;
	public static int[] factors = {0,1,2,3,4,5,6,7,8,9,10,11,12};
	
	public static void findFactors() {
		
		for(int a = 1;a <= num; a++) {
			if(num % a == 0)	{
				//factors[a] = a;
				System.out.println(factors[a]);
			}
			//System.out.print(factors[a]);
		}
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		//System.out.print("hi");
		findFactors();

	}

}
