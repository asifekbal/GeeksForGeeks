package microsoft;

//Find the Minimum length Unsorted Subarray, sorting which makes the complete array sorted

public class MinimumLengthUnsortedSubArray {

	public static void main(String[] args) {
		int arr1[] = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		int arr2[] = { 0, 1, 15, 25, 6, 7, 30, 40, 50 };
		findMinimumLengthUnsortedSubArray(arr1);
		findMinimumLengthUnsortedSubArray(arr2);
	}

	private static void findMinimumLengthUnsortedSubArray(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int minIndex = 0;
		int maxIndex = 0;
		boolean flag = true;
		for (int i = 1; i < arr.length; i++) {
			if (flag && arr[i - 1] > arr[i]) {
				min = arr[i];
				minIndex = i;
				flag = false;
			} else if (!flag && arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		flag = true;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (flag && arr[i] > arr[i + 1]) {
				max = arr[i];
				maxIndex = i;
				flag = false;
			} else if (!flag && arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		for (int i = 0; i <= minIndex; i++) {
			if (arr[i] > min) {
				minIndex = i;
				break;
			}
		}
		for (int i = arr.length - 1; i >= maxIndex; i--) {
			if (arr[i] < max) {
				maxIndex = i;
				break;
			}
		}
		System.out.println("SubArray need to be sorted from " + minIndex + " to " + maxIndex);
	}

}
