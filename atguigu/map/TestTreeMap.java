package com.atguigu.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map��ʵ����
 * 1����ϣ��
 * 	HashMap��Hashtable
 * 2��TreeMap
 * 		��Ϊ����key��Ҫôʵ��java.lang.Comparable�ӿ�
 * 		Ҫô�ڴ���TreeMapʱ��ָ��һ��java.util.Comparator�Ķ���
 * 3��LinkedHashMap����HashMap�Ļ����ϣ�ά����һ����ӵ�˳��
 *    ���Ч�ʵͣ�����Ч�ʸ�
 * 
 * 4�������Map��Properties������Hashtable������
 *    �����ڣ�key��value����String
 *    һ��������ϵͳ�б������ò�����ֵ��������=����ֵ
 */
public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap map = new TreeMap(new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Data d1= (Data) o1;
				Data d2= (Data) o2;
				return d1.getNum() - d2.getNum();
			}
			
		});
		
		map.put(new Data(1), "�й��1");
		map.put(new Data(2), "�й��2");
		
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
		}
	}
}
