package microsoft;

//Maximum difference between two elements such that larger element appears after the smaller number
public class MaxDifferenceBetweenTwoElements {

	public static void main(String[] args) {
		int arr1[] = { 2, 3, 10, 6, 4, 8, 1 };
		int arr2[] = { 7, 9, 5, 6, 3, 2 };
		int diff = findMaxDifference(arr1);
		System.out.println("Maximum Difference is " + diff);
	}

	private static int findMaxDifference(int[] arr) {
		int diff = Integer.MIN_VALUE;
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				diff = arr[i] - min > diff ? arr[i] - min : diff;
			} else {
				min = arr[i];
			}
		}
		return diff;
	}
}
