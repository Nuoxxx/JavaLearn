package com.xuxuexia.javapractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/*
 * �����⣺����һ���������Ҳ�Ϊ�����飬���س��ִ������N�����֣����ճ��ִ����Ӷൽ�ٵ�˳�򷵻أ�
 * ����δʵ�ֹ���
 * */
public class Arr_N {
	/*��ȡ�����г��ִ����������ּ������ֳ��ֵĴ���*/
	public static void sort_max(int[] array,int N){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  
		  
        for (int i = 0; i < array.length; i++) {  
            if (map.containsKey(array[i])) {  
                int temp = map.get(array[i]);    
                map.put(array[i], temp + 1);  
            } else {  
                map.put(array[i], 1);  
            }  
        }
        Collection<Integer> count = map.values();
        // �ҳ�map��value���������֣�Ҳ�������������ֳ������Ĵ���  
        int maxCount = Collections.max(count);  
  
        int maxNumber = 0;  
  
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  
            // �õ�valueΪmaxCount��key��Ҳ���������г��ִ�����������  
            if (maxCount == entry.getValue()) {  
                maxNumber = entry.getKey();  
            }  
        }  
  
        System.out.println("���ִ�����������Ϊ��" + maxNumber);  
        System.out.println("������һ������" + maxCount + "��");  
	}
	
	/*
	 * �����⣺����һ���������Ҳ�Ϊ�����飬���س��ִ������N�����֣����ճ��ִ����Ӷൽ�ٵ�˳�򷵻أ�
	 * */
	public static void sort_n(int[] array,int N){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  
		  
        for (int i = 0; i < array.length; i++) {  
            if (map.containsKey(array[i])) {  
                int temp = map.get(array[i]);    
                map.put(array[i], temp + 1);  
            } else {  
                map.put(array[i], 1);  
            }  
        }
        Collection<Integer> count = map.values();
        // �ҳ�map��value���������֣�Ҳ�������������ֳ������Ĵ���  
        int maxCount = Collections.max(count);  
        //��ȡmap��values�ĸ���
        int a[] = new int[count.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {              
                a[i++] = entry.getValue();        
        }
        System.out.println("a[]");
        for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
        
        Arrays.sort(a);
        int newArr[] = new int[N];
        
  
        int maxNumber = 0;  
  
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  
            // �õ�valueΪmaxCount��key��Ҳ���������г��ִ�����������  
            if (maxCount == entry.getValue()) {  
                maxNumber = entry.getKey();  
            }  
        }  
  
        System.out.println("���ִ�����������Ϊ��" + maxNumber);  
        System.out.println("������һ������" + maxCount + "��");  
	}
	
	public static void sort_arr(int[] array,int N){
		Arrays.sort(array);
		int b[][] = new int[array.length][array.length];
//		int c[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (useLoop(b[0], array[i])) {
				System.out.println("����");
				//��Ҫ���Ѿ����ڵ���������һ
				for (int j = 0; j < i; j++) {
					
				}
				b[1][i]++;
			}else{
				b[0][i] = array[i];
				b[1][i] = 1;
			}
		}
		System.out.println("��ӡb[][]����");
		for (int i = 0; i < 2; i++) {
			System.out.println("----"+i+"-----------");
			for (int j = 0; j < array.length; j++) {				
				System.out.print(b[i][j]+" ");
			}
		}
	}
	
    //ʹ��List
	public static boolean useList(int[] arr,int targetValue){
	    return Arrays.asList(arr).contains(targetValue);
	}
	
	//ʹ��ѭ���ж�
	public static boolean useLoop(int[] arr,int targetValue){
	    for(int i:arr){
	        if(i ==targetValue)
	            return true;
	        }  
	        return false;
	    }

	public static void main(String[] args) {
		int[] array = { 2, 1, 2, 3, 4, 5, 2, 2, 2, 2 };  
		Arr_N.sort_arr(array, 3);
	}

}


