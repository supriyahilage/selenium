package com.pro.wings;

import java.util.Arrays;
import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		 String s1="abdd";
		 String s2="dcba";
		 
		 char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result =Arrays.equals(a, b);
		if(result==true) {
        System.out.println("String are anagram");
		}
		else {
			System.out.println("String are not anagram");
		}
		}
				
		 }
		 