package encryptionproject;

import java.util.ArrayList;
import java.util.List;

public class test {
	
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

	public static void isPrime() {
		for(int i = 0;i < factors.size();i++) {
			//this is the start to checking if a number is prime or not.
			// I know part of the coding for that is wrong like it says
			// 2 is not prime but it is.
			if(factors.get(i) % 2 == 0) {
				System.out.println(factors.get(i) + " not prime");
			}
			else {
				System.out.println(factors.get(i) + " is prime");
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		findFactors();
		isPrime();
		
		
		

	}

}
