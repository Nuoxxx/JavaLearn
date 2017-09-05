package com.xuxuexia.javapractice;

import java.util.Arrays;

/*
 * 冒泡排序
 * */
public class BubbleSort {
	
	public static void sort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			//每次获取(arr.length-i)中最大的数，将其冒泡到后面
			for (int j = 0; j < arr.length-i; j++) {
//				System.out.println("arr[j]:"+arr[j]);
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				System.out.print("内部：");
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println("");
			}
			System.out.print("第"+i+"次排序:");
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println("");
		}
	}
	
	
	

	public static void main(String[] args) {
		
		int a[] = {100,1,5,34,15,15,34,34,32,2,45};
		BubbleSort busort = new BubbleSort();
		busort.sort(a);
		Arrays.sort(a);
		System.out.print("sort方法: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
