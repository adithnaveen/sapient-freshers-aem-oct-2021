package com.naveen.ds;

import java.util.Arrays;

public class QuickSortExample {
	public static void main(String[] args) {
		int arr[] = {45,342,23,55,77,22,10}; 
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("Sorted List ");
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	// low = 0 high = 8 
	private static void quickSort(int arr[], int low, int high) {
		if(low < high) {
			int pivot = positionPartition(arr, low, high); 
			
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}
	
	private static int positionPartition (int arr[], int low, int high) {
		int pivot =arr[high]; 
		int i = low -1; 
		
		for(int j = low; j<high; j++) {
			if(arr[j] <= pivot) {
				i++; 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			}
		}
		
		
		int temp = arr[i+1];
		arr[i+1] = arr[high]; 
		arr[high]= temp; 
		return (i+1);
		
	}
	
	
}
