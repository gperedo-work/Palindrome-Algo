package com.granp.palindrome;

public class PalindromeMain {
	
	public static void main(String[] args) {
		
		
		
		//simple way
		PalindromeAlgo pal = new PalindromeAlgo();
		boolean isPal = pal.isPalindrome("902");
		System.out.println("pal: "+isPal);
		
		//recursive
		PalindromeAlgoRecursive isPalRecur = new PalindromeAlgoRecursive("902");
		isPalRecur.printPalindromeRec();
		
	}
}
