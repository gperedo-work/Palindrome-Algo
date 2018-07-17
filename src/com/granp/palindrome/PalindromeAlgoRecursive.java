package com.granp.palindrome;

public class PalindromeAlgoRecursive {
	
	String val;
	
	public PalindromeAlgoRecursive() {}
	
	public PalindromeAlgoRecursive(String val) {
		this.val = val;
	}
	
	private boolean isPalindrome(String s) {
	    int length = s.length();
	    if (length < 2) return true;
	    else return s.charAt(0) != s.charAt(length - 1) ? false :
	            isPalindrome(s.substring(1, length - 1));
	}
	
	public void printPalindromeRec() {
		System.out.println("Palindrome Recursive: "+isPalindrome(val));
	}
}
