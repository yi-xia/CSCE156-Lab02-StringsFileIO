package unl.cse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DNA {

	public static void main(String args[]) {

		String fileName = "data/H1N1nucleotide.txt";
		Scanner s = null;
		try {
			s = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String dna = "";

		while(s.hasNext()) {
			dna += s.next().trim();
		}
		s.close();

		String subsequence = null;

		int count = 0; 
		//TODO: write code to cound the occurrences of each of A, G, C and T in the sequence

		//TODO: write code to count the number of times subsequence appears in the dna string

		System.out.println(subsequence + " appears " + count + " times");
		
	}
	
}
