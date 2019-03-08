package microsoft;

import java.util.Arrays;
import java.util.Scanner;

//Find next greater number with same set of digits

public class NextGreaterNumber {

	public static void main(String[] args) {
		// input
		Scanner scr = new Scanner(System.in);
		String str = scr.next();
		char[] arr = str.toCharArray();
		int len = str.length();
		int index = -1;
		// find index of digit from right
		for (int i = len - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			System.out.println("Not Possible");
			return;
		}
		// find index2 left of index
		int index2 = index + 1;
		for (int i = index + 2; i < len; i++) {
			if (arr[i] < arr[index2]) {
				index2 = i;
			}
		}
		// swap
		char temp = arr[index];
		arr[index] = arr[index2];
		arr[index2] = temp;

		// sort right if index
		Arrays.sort(arr, index + 1, len);
		System.out.println(String.valueOf(arr));
	}
}

//1 2 3 4 5 7 6