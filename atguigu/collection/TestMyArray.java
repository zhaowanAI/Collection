package com.atguigu.collection;

import java.util.Date;

public class TestMyArray {

	public static void main(String[] args) {
		MyArray m = new MyArray();
//		m�������װ���ݣ����Ա������ݣ�����ɾ�����ݣ����Բ�������...
		
		for(int i=1; i<=12; i++){
			m.add(i);
//			m.add(new Date());
		}
		
		System.out.println("Ԫ�صĸ�����"+m.size());
		System.out.println("����ĳ��ȣ�"+m.getLength());
		Object[] all = m.getAll();
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
		
		m.remove(5);
		System.out.println("Ԫ�صĸ�����"+m.size());
		System.out.println("����ĳ��ȣ�"+m.getLength());
		Object[] all2 = m.getAll();
		for (int i = 0; i < all2.length; i++) {
			System.out.println(all2[i]);
		}
		
//		System.out.println(all[0].getClass());
	}

}
