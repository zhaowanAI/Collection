package com.atguigu.my;

import java.util.Arrays;

public class TestMyArrayList {

	public static void main(String[] args) {
		MyArrayList m = new MyArrayList();
		for(int i=1; i<15; i++){
			m.add(i);
		}
		
		Object[] array = m.toArray();
		System.out.println(Arrays.toString(array));
		

		System.out.println(m.contains(1));
		System.out.println(m.get(1));
		System.out.println(m.indexOf(1));
		System.out.println(m.lastIndexOf(1));
		
		System.out.println(m.size());
//		m.set(0, 15);
		
//		m.add(0, 20);
		
		m.remove(0);
		m.remove(10);
		
		Object[] array2 = m.toArray();
		System.out.println(Arrays.toString(array2));
		
	}

}
