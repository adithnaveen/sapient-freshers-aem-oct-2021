package com.naveen.ds;

import lombok.extern.slf4j.Slf4j;


public class MergeSortExample {

	public static void main(String[] args) {
		int arr[] = {34,2,35,11,44,77,99,31,76}; 
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("Sorted Array");
		display(arr);
	}
	
	private static void display(int [] arr) {
		for(int i=0; i<arr.length ;i++) {
			System.out.print ("\t " + arr[i]);
		}
		System.out.println();
	}
	
	private static void mergeSort(int [] arr, int low, int high) {
		if(low < high) {
			int mid = (low + high)/2; 
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			
			merge(arr, low, mid, high);
			
		}
	}
	
	
	private static void merge(int [] arr, int low, int mid, int high) {
		int n1 = mid - low + 1; 
		int n2 = high - mid; 
		
		int [] lowerArr = new int [n1]; 
		int [] rightArr = new int [n2]; 
		
		// copy the elements of the array to lowerArr and rightArry 
		for(int i=0; i<n1; i++) {
			lowerArr[i] = arr[low + i]; 
		}
		
		for(int j=0; j<n2; j++) {
			rightArr [j] = arr [mid+1+j];
		}
		
		int i=0;
		int j=0; 
		int k = low; 
		
		// pick the smaller value from the each list of the array 
		// and replace the position of the arr with index k 

		while(i<n1 && j<n2) {
			if(lowerArr[i] < rightArr[j]) {
				arr[k] = lowerArr [i++]; 
			}else {
				arr[k] = rightArr[j++]; 
			}
			k++; 
		}
		
		// when the elements of one of the array(child) is running 
		// out of the elements then copy the elements 
		
		for(; i<n1; i++) {
			arr[k++] = lowerArr[i]; 
		}
		
		// another way 
		while(j<n2) {
			arr[k++]  = rightArr[j++]; 
		}
		
	}
	
}
