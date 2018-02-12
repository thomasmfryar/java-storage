package encryptionproject;

import java.util.ArrayList;
import java.util.List;

public class findFactors {
	
	
	public static ArrayList<Integer> findFactors(int num ) {
		
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for(int a = 1;a <= num; a++) {
			if(num % a == 0)	{
				factors.add(a);
				
			}
			
		}
		return factors;
		//isNotPrime(factors);
	}
//I Am having trouble connecting the two methods together the command to do what i want
	
	
	public static ArrayList<Integer> isNotPrime(ArrayList<Integer> fList) {
	
		ArrayList<Integer> notPrime = new ArrayList<Integer>();
			
		for(int a = 0;a <fList.size();a++) {
			
			//int num = factors.get(a);
			
			for(int i = 2;i <= fList.get(a);i++) {
				
				if((fList.get(a) % i == 0)&&(fList.get(a) != i)) {
					notPrime.add(fList.get(a));
					break;
					
				}
			
			}
		}
		return notPrime;
	}

	
	
	
	
	
	public static void main(String[] args) {
		System.out.print(findFactors(4));
		

	}

}
