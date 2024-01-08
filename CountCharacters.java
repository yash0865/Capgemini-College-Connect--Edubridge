//Java program to count frequency of characters in character array

package com.codingChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
	public static void main(String[] args) {
		char[] arr = new char[] {'a','f','c','d','a','c'};
		System.out.println(countChar(arr));
	}
	public static Map<Character, Integer> countChar(char[] arr){
		Map<Character, Integer> map = new HashMap<>();
		ArrayList<Character> list = new ArrayList<>();
		
		for(char c : arr) {
			list.add(c);
		}
		for(char c : arr) {
			map.put(c, Collections.frequency(list, c));
		}
		return map;
	}
}
