package com.xuxuexia.javapractice;

import java.util.Arrays;

/*
 * ð������
 * */
public class BubbleSort {
	
	public static void sort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			//ÿ�λ�ȡ(arr.length-i)��������������ð�ݵ�����
			for (int j = 0; j < arr.length-i; j++) {
//				System.out.println("arr[j]:"+arr[j]);
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				System.out.print("�ڲ���");
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println("");
			}
			System.out.print("��"+i+"������:");
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
		System.out.print("sort����: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
