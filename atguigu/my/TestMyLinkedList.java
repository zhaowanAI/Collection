package com.atguigu.my;

import java.util.Arrays;

public class TestMyLinkedList {
	public static void main(String[] args) {
		MyLinkedList m = new MyLinkedList();
		
		for(int i=1; i<15; i++){
			m.add(i);
		}
		
	
		
//		m.add(0, 15);
//		m.addFirst(16);
//		m.addLast(17);
		
//		m.remove(1);
		m.remove(new Integer(3));
//		System.out.println(m.getFirst());
//		System.out.println(m.getLast());
//		
//		System.out.println(m.get(1));
		Object[] array = m.toArray();
		System.out.println(Arrays.toString(array));
		
	}
}
