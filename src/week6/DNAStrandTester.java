package week6;

public class DNAStrandTester {

	public static void main(String[] args) {
		DNAStrand dna1 = new DNAStrand("ACGTGTATCGATCAG");
		DNAStrand dna2 = new DNAStrand("TACGACTAGCA");
		DNAStrand dna3 = new DNAStrand("AACGTAACA");
		
		System.out.println(dna3.containsSequence("CCCC"));
		System.out.println(dna3.containsSequence("ACA"));
		
		summarise(dna1);
		summarise(dna2);
		summarise(dna3);
	}

	public static void summarise(DNAStrand dna) {
	    System.out.println("Original DNA Sequence: " + dna);
	    if (dna.isValidDNA()) {
	        System.out.println("Is valid");
	        System.out.println("Complement: " + dna.complementWC());
	        System.out.println("WC Palindrome: " + dna.palindromeWC());
	    } 
	    else {
	        System.out.println("Not Valid DNA");
	    }
	}
}
