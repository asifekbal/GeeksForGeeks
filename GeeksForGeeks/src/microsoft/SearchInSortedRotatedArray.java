package microsoft;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int key1 = 3;
		int arr2[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int key2 = 30;
		int arr3[] = { 30, 40, 50, 10, 20 };
		int key3 = 10;
		int index = -1;
		index = findIndexInSortedRotatedArray(arr1, key1);
		System.out.println("Found at Index " + index);
		index = findIndexInSortedRotatedArray(arr2, key2);
		System.out.println("Found at Index " + index);
		index = findIndexInSortedRotatedArray(arr3, key3);
		System.out.println("Found at Index " + index);

	}

	private static int findIndexInSortedRotatedArray(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int index = binarySearchInSortedRotatedArray(arr, key, low, high);
		return index;
	}

	private static int binarySearchInSortedRotatedArray(int[] arr, int key, int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == key) {
			return mid;
		}
		if (arr[low] <= arr[mid]) {
			if (key < arr[mid] && key >= arr[low]) {
				return binarySearchInSortedRotatedArray(arr, key, low, mid - 1);
			} else {
				return binarySearchInSortedRotatedArray(arr, key, mid + 1, high);
			}
		} else {
			if (key > arr[mid] && key <= arr[high]) {
				return binarySearchInSortedRotatedArray(arr, key, mid + 1, high);
			} else {
				return binarySearchInSortedRotatedArray(arr, key, low, mid - 1);
			}
		}
	}

}
