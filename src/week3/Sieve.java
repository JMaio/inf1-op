package week3;

public class Sieve {

	public static void main(String[] args) {

		int[] primes = new int[100000000];
		
		primes[0] = 2;
		System.out.println(2);
		
		int cand = 3;
		
		for (int n = 1; n < primes.length; n++) {
			
			int c = 0;
			
			for (int i = 0; i < n; i++) {
					
				if (cand % primes[i] == 0) {
					c += 1;
				}
				
			}
			
			if (c == 0) {
				primes[n] = cand;
				System.out.println(cand);
			} else {
				n -= 1;
			}
			
			cand += 2;
					
			
		}
		
	}

}
