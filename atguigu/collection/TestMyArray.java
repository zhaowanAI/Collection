package com.atguigu.collection;

import java.util.Date;

public class TestMyArray {

	public static void main(String[] args) {
		MyArray m = new MyArray();
//		m对象可以装数据，可以遍历数据，可以删除数据，可以查找数据...
		
		for(int i=1; i<=12; i++){
			m.add(i);
//			m.add(new Date());
		}
		
		System.out.println("元素的个数："+m.size());
		System.out.println("数组的长度："+m.getLength());
		Object[] all = m.getAll();
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
		
		m.remove(5);
		System.out.println("元素的个数："+m.size());
		System.out.println("数组的长度："+m.getLength());
		Object[] all2 = m.getAll();
		for (int i = 0; i < all2.length; i++) {
			System.out.println(all2[i]);
		}
		
//		System.out.println(all[0].getClass());
	}

}
