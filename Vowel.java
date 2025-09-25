package com.p1;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = s.nextLine();
        int count = 0;

        for(int i = 0; i < a.length(); i++) {
            char ch = Character.toLowerCase(a.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}