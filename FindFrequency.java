package com.frequency;

public class FindFrequency {
	static void findFrequencyUtil(int arr[], int low,int high, int[] freq)
	{
		if (arr[low] == arr[high]) {

			freq[arr[low]] += high - low + 1;
		}
		else {

			int mid = (low + high) / 2;
			findFrequencyUtil(arr, low, mid, freq);
			findFrequencyUtil(arr, mid + 1, high, freq);
		}
	}

	static void findFrequency(int arr[], int n)
	{

		int[] freq = new int[arr[n - 1] + 1];
		findFrequencyUtil(arr, 0, n - 1, freq);
		for (int i = 0; i <= arr[n - 1]; i++)
			if (freq[i] != 0)
				System.out.println(i + " occurs " + freq[i] + " times");
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 1, 1, 2, 3, 3, 5,5, 8, 8, 8, 9, 9, 10 };
		int n = arr.length;

		findFrequency(arr, n);
	}

}
