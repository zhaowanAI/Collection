package com.atguigu.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import org.junit.Test;

/*
 * List:ʵ����
 * ��1��ArrayList����̬����
 * 		����ṹ������
 * 		�̲߳���ȫ��
 * 		JDK1.2
 * 		��֧��Enumration����
 * 		��ʼ��������0����һ����Ϊ10��֮�����ݵ��㷨�ǣ�ԭ����1.5��
 * 		
 * ��2��Vector����̬����
 * 		����ṹ������
 * 		�̰߳�ȫ��
 * 		JDK1.0
 * 		֧�־ɰ汾�ĵ�����Enumration
 * 		��ʼ������ֱ��Ϊ10��֮������ݵ��㷨�ǣ�ԭ����2�����û������Զ������ݵ�����
 * 
 * ��3��LinkedList������
 * 		����ṹ������
 * 		�Ͷ�̬������������ɾ��������ʱЧ�ʱȽϸ�
 * 	
 * 	��̬�����ڲ����ɾ��ʱ��Ƶ��ƶ�Ԫ��
 *  �����ڲ����ɾ��ʱ��Ч�ʱȽϸ�
 *  
 *  Ҫ��
 *  1������API�еķ���
 *  Collection��List�ӿڵķ���
 *  ��������ϣ�foreach��Iterator)
 *  
 *  2�����ּ��ϵ��ص�
 *  
 *  3�����Ҫ�󣺿�Դ������Լ�ģ���дһ����̬���������
 *  �㷨�ṹ���ֶ�ʵ��һ����̬���飬����
 * 
 * 
 */
public class TestListImpl {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testLinkedList(){
		LinkedList list = new LinkedList();
		list.add("����");//first = "����"  last = "����"
		list.add("����");//first = "����"  first.next ="����"  last="����"
		list.add("����");
		
		list.add(0, "����");
		
		list.remove("����");
		list.remove(1);
	}
	
	@Test
	public void testVector(){
		Vector vector= new Vector();
		for(int i=1; i<= 20; i++){
			vector.add(i);
		}
	}
	
	@Test
	public void testArrayList(){
		ArrayList list = new ArrayList();//�����ʼ��Ϊ����Ϊ0������
		
//		list.add("����");//�������10��size=1
		for(int i=1; i<= 20; i++){
			list.add(i);
		}
		
		System.out.println(list.size());
		
	}
}
