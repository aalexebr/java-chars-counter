package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("give me a string;");
		String userStr = in.nextLine();
		
		in.close();
		
		Map <Character, Integer> strMap = new HashMap <>();
		
		for(Character c : userStr.toCharArray()) {
			
			if(strMap.containsKey(c)) {
				Integer value = strMap.get(c);
				strMap.put(c, (value+1));
			}
			else {
				strMap.put(c, 1);
			}
		}
		
		System.out.println(strMap);
		
		for(Character c2 : strMap.keySet()) {
			int x = strMap.get(c2);
			System.out.println("key:"+c2+" "+"value:"+x);
		}
	}
}
