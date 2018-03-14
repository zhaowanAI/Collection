package com.atguigu.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/*
 * Map���ϣ�
 * �洢�ļ�ֵ�ԣ�key,value)
 * key�����������������ͣ�valueҲ����������������
 * 
 * ���ϰ���Collection��Map���е�Ԫ�ض��Ƕ�������ǻ����������ͣ�Ҳ��Ҫ�Զ�װ��ġ�
 * 
 * key��������Ψһ�ģ�key�������ظ���
 * value�����ظ�
 * 
 * Map�ķ�����
 * 1�����
 * put(key,value)
 * 
 * 2����ȡ��ֵ����
 * size()
 * 
 * 3���Ƿ����
 * containsKey(key)
 * containsValue(value)
 * 
 * 4������key��ȡvalue
 * value get(key)
 * 
 * 5������keyɾ��һ�Լ�ֵ��
 * 
 * 6��������������ֵ��
 * ��1���������е�key
 * ��2���������е�value
 * ��3��������ֵ�� ��Entry��Node��
 * Entry��Map���ڲ��ӿ�����
 * Node��Entry��ʵ���࣬����HashMap�ȵ��ڲ���
 * 
 * 
 * ���䣺Collection
 * (1)ת����
 * (2)foreach
 * (3)Iterator
 * 
 * 
 * ʵ���� ��
 * HashMap����ϣ��
 * 
 */
public class TestMap {
	@Test
	public void testMap4(){
		Map map = new HashMap();
		
		map.put(1, "����");
		map.put(1, "������");//������
		map.put(2, "����");
		map.put(3, "�ﴺ");
		map.put(4, "С��");
		
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			Map.Entry entry = (Map.Entry) object;
			/*
			 * Entry��ʵ���ࣺNode
			 * class Node{
			 * 	Object key;
			 *  Object value;
			 *  Node next;
			 * }
			 */
			System.out.println(entry.getKey()+ "->" + entry.getValue());
		}
		
		
	}
	
	@Test
	public void testMap3(){
		Map map = new HashMap();
		
		map.put(1, "����");
		map.put(1, "������");//������
		map.put(2, "����");
		map.put(3, "�ﴺ");
		map.put(4, "С��");
		
		//�������е�value
		Collection values = map.values();//��Ϊvalue�����ظ�
		for (Object value : values) {
			System.out.println(value);
		}
	}
	
	@Test
	public void testMap2(){
		Map map = new HashMap();
		
		map.put(1, "����");
		map.put(1, "������");//������
		map.put(2, "����");
		map.put(3, "�ﴺ");
		map.put(4, "С��");
		
		//�������е�key
		Set keySet = map.keySet();//��Ϊ���е�key�����ظ�
		for (Object key : keySet) {
			System.out.println(key + "-->" + map.get(key));
		}
		
	}
	@Test
	public void testMap(){
		Map map = new HashMap();
		
		map.put(1, "����");
		map.put(1, "������");//������
		map.put(2, "����");
		map.put(3, "�ﴺ");
		map.put(4, "С��");
		
		/*System.out.println(map.size());
		
		System.out.println(map.containsKey(5));
		System.out.println(map.containsKey(2));
		
		System.out.println(map.containsValue("����"));//false
		System.out.println(map.containsValue("����"));//true
*/		
		System.out.println(map.get(1));
		
		map.remove(2);
		System.out.println(map.size());
		
		
	}

}
