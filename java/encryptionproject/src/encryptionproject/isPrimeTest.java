package encryptionproject;

import java.util.ArrayList;
import java.util.List;

public class isPrimeTest {
	
	public static int num = 38509;
	static List<Integer> factors = new ArrayList<Integer>();
	static List<Integer> Prime = new ArrayList<Integer>();
	static List<Integer> notPrime = new ArrayList<Integer>();
	public static void findFactors() {
		
		for(int a = 1;a <= num; a++) {
			if(num % a == 0)	{
				factors.add(a);
				
			}
			
		}
		System.out.println(factors);
	}

	
	
	
	
	
	
	public static void isPrime() {
		int num;
		for(int a = 0;a <factors.size();a++) {
			num = factors.get(a);
			for(int i = 2;i <= num;i++) {
				if((num % i == 0)&&(num != i)) {
					notPrime.add(num);
					break;
				
				}
				else {
					Prime.add(num);
					break;
				}
			}
		}
		System.out.println(notPrime);
		System.out.println(Prime);
	}
	
	
	
	
	public static void main(String[] args) {
		findFactors();
		isPrime();
		
		
		

	}

}
