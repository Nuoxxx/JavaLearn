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
 * 面试题：传入一个正整数且不为空数组，返回出现次数最多N个数字（按照出现次数从多到少的顺序返回）
 * 程序未实现功能
 * */
public class Arr_N {
	/*获取数组中出现次数最多的数字及该数字出现的次数*/
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
        // 找出map的value中最大的数字，也就是数组中数字出现最多的次数  
        int maxCount = Collections.max(count);  
  
        int maxNumber = 0;  
  
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  
            // 得到value为maxCount的key，也就是数组中出现次数最多的数字  
            if (maxCount == entry.getValue()) {  
                maxNumber = entry.getKey();  
            }  
        }  
  
        System.out.println("出现次数最多的数字为：" + maxNumber);  
        System.out.println("该数字一共出现" + maxCount + "次");  
	}
	
	/*
	 * 面试题：传入一个正整数且不为空数组，返回出现次数最多N个数字（按照出现次数从多到少的顺序返回）
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
        // 找出map的value中最大的数字，也就是数组中数字出现最多的次数  
        int maxCount = Collections.max(count);  
        //获取map中values的个数
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
            // 得到value为maxCount的key，也就是数组中出现次数最多的数字  
            if (maxCount == entry.getValue()) {  
                maxNumber = entry.getKey();  
            }  
        }  
  
        System.out.println("出现次数最多的数字为：" + maxNumber);  
        System.out.println("该数字一共出现" + maxCount + "次");  
	}
	
	public static void sort_arr(int[] array,int N){
		Arrays.sort(array);
		int b[][] = new int[array.length][array.length];
//		int c[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (useLoop(b[0], array[i])) {
				System.out.println("包括");
				//需要让已经存在的数次数加一
				for (int j = 0; j < i; j++) {
					
				}
				b[1][i]++;
			}else{
				b[0][i] = array[i];
				b[1][i] = 1;
			}
		}
		System.out.println("打印b[][]数组");
		for (int i = 0; i < 2; i++) {
			System.out.println("----"+i+"-----------");
			for (int j = 0; j < array.length; j++) {				
				System.out.print(b[i][j]+" ");
			}
		}
	}
	
    //使用List
	public static boolean useList(int[] arr,int targetValue){
	    return Arrays.asList(arr).contains(targetValue);
	}
	
	//使用循环判断
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


