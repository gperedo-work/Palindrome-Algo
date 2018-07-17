package com.granp.palindrome;

public class PalindromeAlgo {

	public static boolean isPalindrome(String str) {
	    return str.equals(new StringBuffer().append(str).reverse().toString());
	}
}
