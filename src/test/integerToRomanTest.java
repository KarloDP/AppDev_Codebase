package test;

import org.junit.Test;

import Gumayagay_Kenneth.integerToRoman;

public class integerToRomanTest {
    public static void main(String[] args) {
        integerToRoman converter = new integerToRoman();

        int[] testNumbers = {3, 9, 58, 1994, 2024};

        System.out.println("Integer to Roman Numeral Conversion:");
        for (int num : testNumbers) {
            System.out.println(num + " -> " + converter.intToRoman(num));
        }
    }
}