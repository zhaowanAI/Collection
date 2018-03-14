package com.atguigu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

/*
 * Collection��
 * ���еļ�����java.util��
 * 
 * 	Collection ��νṹ �еĸ��ӿڡ�
 * 	˵����JDK1.5֮��Collection��һ�����ӿڣ�java.lang.Iterable����ʾ�ɵ����ģ���ʹ��foreachѭ��
 * 
 * Collection ��ʾһ�������Щ����Ҳ��Ϊ collection ��Ԫ�ء�
 * һЩ collection �������ظ���Ԫ�أ�����һЩ������
 * һЩ collection ������ģ�����һЩ��������ġ�
 * JDK ���ṩ�˽ӿڵ��κ�ֱ�� ʵ�֣����ṩ��������ӽӿڣ��� Set �� List��ʵ�֡�
 * �˽ӿ�ͨ���������� collection��������Ҫ����ձ��Եĵط�������Щ collection�� 
 * 
 * ������
 * 1�����
 * ��1�����һ��Ԫ��
 * add(Object)
 * addAll(Collection c):��c�е�Ԫ��һһ����ӵ���ǰ������
 * 
 * 2���Ƿ�Ϊ�ռ���
 * isEmpty()
 * 
 * 3���Ƿ����ĳ��Ԫ��
 * contains(Object)
 * containsAll(Collection c)���жϵ�ǰ�����Ƿ��������c�е�ÿһ��Ԫ��
 * 
 * 4��ɾ��
 * remove(Object)
 * removeAll(Collection c)���ӵ�ǰ�����аѺ�c��һ����Ԫ��һһɾ����c����Ӱ��
 * 
 * 5�����
 * clear()
 * 
 * 6��retainAll(Collection c) :ȡ�������ŵ���ǰ�����У�c����Ӱ��
 */
public class TestCollectionMethod {
	@Test
	public void testCollection4(){
		Collection coll1 = new ArrayList();
		coll1.add(1);
		coll1.add(2);
		coll1.add(5);
		
		Collection coll2 = new ArrayList();
		coll2.add(1);
		coll2.add(2);
		coll2.add(3);
		
		coll1.retainAll(coll2);
		System.out.println("coll1��Ԫ�ظ�����" + coll1.size());
		System.out.println("coll2��Ԫ�ظ�����" + coll2.size());
		Object[] array = coll1.toArray();
		System.out.println(Arrays.toString(array));
	}
	
	@Test
	public void testCollection3(){
		Collection coll1 = new ArrayList();
		coll1.add(1);
		coll1.add(2);
		
		Collection coll2 = new ArrayList();
		coll2.add(1);
		coll2.add(2);
		coll2.add(3);
		
//		boolean flag = coll2.containsAll(coll1);
//		System.out.println(flag);
		
		coll2.removeAll(coll1);
		System.out.println("coll1��Ԫ�ظ�����" + coll1.size());
		System.out.println("coll2��Ԫ�ظ�����" + coll2.size());
	}
	
	@Test
	public void testCollection2(){
		Collection coll1 = new ArrayList();
		coll1.add(1);
		coll1.add(2);
		
		Collection coll2 = new ArrayList();
		coll2.add(1);
		coll2.add(2);
		coll2.add(3);
		
		coll1.addAll(coll2);//�Ѽ���coll2�е�����Ԫ�ض���ӵ�coll1
//		coll1.add(coll2);//��coll2����һ�����壬һ������
		
		System.out.println("����1��"+coll1.size());
		System.out.println("����2��"+coll2.size());
		
		Object[] array = coll1.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testCollection(){
		Collection coll = new ArrayList();
		
		System.out.println("�Ƿ�Ϊ�ռ��ϣ�" + coll.isEmpty());
		
		coll.add("����");
		coll.add("����");
		
/*		System.out.println("Ԫ�صĸ�����" + coll.size());
		System.out.println("�Ƿ�Ϊ�ռ��ϣ�" + coll.isEmpty());
		
		System.out.println("�Ƿ����������" + coll.contains("����"));
		System.out.println("�Ƿ�������壺" + coll.contains("����"));
		
		//ɾ����
		coll.remove("����");
		System.out.println("Ԫ�صĸ�����" + coll.size());
		
		coll.clear();
		System.out.println("�Ƿ�Ϊ�ռ��ϣ�" + coll.isEmpty());*/
		
		Object[] array = coll.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}
}
