package encryptionproject;

import java.util.ArrayList;
import java.util.List;

public class finalFactorFinder {
	
	public static int num = 6;
	static List<Integer> factors = new ArrayList<Integer>();
	
	public static void findFactors() {
		
		for(int a = 1;a <= num; a++) {
			if(num % a == 0)	{
				factors.add(a);
				
			}
			
		}
		System.out.println(factors);
	}

	public static void main(String[] args) {
		findFactors();
		
	}

}
