package week6;

public class DNAStrand {
	
	String dna;
	char[] dnaArr;
	
	public DNAStrand(String dna) {
		this.dna = dna;
		this.dnaArr = this.dna.toCharArray();
	}
	
	public boolean isValidDNA() {
		if (dna.length() == 0) {
			return false;
		}
		else {
			String valid = "ACGT";
			
			for (char base : dnaArr) {
				if (!valid.contains(Character.toString(base))) {
					return false;
				}
			}
		}
		return true;
	}
	
	public String complementWC() {
		String compWC = "";
		if (isValidDNA()) {
			for (char base : dnaArr) {
				switch (base) {
					case 'A': compWC += 'T'; break;
					case 'C': compWC += 'G'; break;
					case 'G': compWC += 'C'; break;
					case 'T': compWC += 'A'; break;
				}
			}
		}
		return compWC;
	}
	
	public String palindromeWC() {
		String compWC = complementWC();
		String paliWC = "";
		int l = compWC.length();
		
		for (int i = 0; i < l; i++) {
			paliWC += compWC.charAt((l - 1) - i);
		}
		return paliWC;
	}
	
	public boolean containsSequence(String seq) {
		for (int i = 0; i <= (dna.length() - seq.length()); i++) {
			if (dna.substring(i, i + seq.length()).equals(seq)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return dna;
	}
	
}
