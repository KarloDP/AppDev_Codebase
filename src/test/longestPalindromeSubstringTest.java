package test;

import org.junit.Test;
import Gumayagay_Kenneth.longestPalindromeSubstring;

public class longestPalindromeSubstringTest {
    public static void main(String[] args) {
        longestPalindromeSubstring finder = new longestPalindromeSubstring();

        // Example test cases
        String[] tests = {
                "babad",
                "cbbd",
                "a",
                "ac",
                "forgeeksskeegfor",
                "abccba",
                "racecar",
                "banana"
        };

        System.out.println("Testing longestPalindrome() method:");
        for (String s : tests) {
            System.out.println("Input: \"" + s + "\" → Longest Palindrome: \"" + finder.longestPalindrome(s) + "\"");
        }
    }
}

