package microsoft;

import java.util.HashSet;
import java.util.Set;

//Remove duplicates from a given string
public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		// String output = removeDuplicatesMethod1(str);
		String output = removeDuplicatesMethod2(str);
		System.out.println(output);
	}

	private static String removeDuplicatesMethod2(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (output.indexOf(str.charAt(i)) < 0) {
				output += str.charAt(i);
			}
		}
		return output;
	}

	private static String removeDuplicatesMethod1(String str) {
		Set<Character> set = new HashSet<>();
		// LinkedHashSet can also be use and we can then print directly from LHS because
		// it maintains insertion order
		char[] charArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (!set.contains(charArray[i])) {
				set.add(charArray[i]);
				sb.append(charArray[i]);
			}
		}
		return sb.toString();
	}

}
