package com.atguigu.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

/*
 * Collection��
 * 	List������ģ����ظ���
 *  Set������ģ������ظ���
 *  
 * List�� 
 *  ����� collection��Ҳ��Ϊ���У���
 *  �˽ӿڵ��û����Զ��б���ÿ��Ԫ�صĲ���λ�ý��о�ȷ�ؿ��ơ�
 *  �û����Ը���Ԫ�ص��������������б��е�λ�ã�����Ԫ�أ��������б��е�Ԫ�ء�
 *  
 *  ������
 *  Collection�ӿ����еģ�������
 *  Collection�ӿ���û�еģ�������һЩ��index��صķ���
 *  
 *  1�����
 *  add(Object)
 *  addAll(Collection)
 *  add(index,Object)
 *  addAll(index,Collection)
 *  
 *  2��ɾ��
 *  remove(Object)
 *  remove(index)
 *  removeAll(Collection c)
 *  
 *  3����ȡ
 *  get(index)
 *  
 *  4����������
 *  indexOf(Object)
 *  lastIndexOf(Object)
 *  ���û�з���-1
 *  
 *  5���滻
 *  set(index,Object)
 *  
 *  6��subList(int,int)
 *  
 *  7��Listϵ�еļ��ϵ�ר�е�����
 *  ListIterator�Ǽ̳���Iterator�ӿ�
 *  
 *  ListIterator listIterator()
 *  ListIterator listIterator(index)
 *  
 *  ��Iterator��ͬ��
 *  ��1����������
 *  ��2�����Ի�ȡ����λ��
 *  ��3������ͬʱ�����޸ģ���ӣ�ɾ��
 *  
 *  Iteratorֻ�ܴ�ǰ����ֻ��ɾ�����޷���ȡ������Ϣ
 *  
 */
public class TestList {
	@Test
	public void testList8(){
		List list = new ArrayList();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		ListIterator iter = list.listIterator(2);
		
		while(iter.hasPrevious()){
			System.out.println(iter.previousIndex());
			System.out.println(iter.previous());
		}
		
	}
	
	@Test
	public void testList7(){
		List list = new ArrayList();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		ListIterator iter = list.listIterator();
		while(iter.hasNext()){
			System.out.println(iter.nextIndex());
			System.out.println(iter.next());
		}
		System.out.println("---------------------------");
		while(iter.hasPrevious()){
			System.out.println(iter.previousIndex());
			System.out.println(iter.previous());
		}
	}
	
	@Test
	public void testList6(){
		List list = new ArrayList();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		List subList = list.subList(0, 2);//[from,to)
		System.out.println(subList.size());
		
		subList.add("�ﴺ");//subList����ArrayList,����һ��SubList�����ͣ�Ҳ��List��ʵ����
	}
	
	@Test
	public void testList5(){
		List list = new ArrayList();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		list.set(0, "�ﴺ");
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testList4(){
		List list = new ArrayList();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		int indexOf = list.indexOf("����");
		int indexOf2 = list.lastIndexOf("����");
		System.out.println(indexOf);
		System.out.println(indexOf2);
		
		System.out.println(list.indexOf("С��"));
		
	}
	
	@Test
	public void testList3(){
		List list = new ArrayList();
		
		list.add("����");
		list.add(0, "����");
		list.add(0, "����");
		list.add(0, "����");
		
		System.out.println(list.get(1));
		
	}
	@Test
	public void testList2(){
		List list = new ArrayList();
		
		list.add("����");
		list.add(0, "����");
		list.add(0, "����");
		list.add(0, "����");
		
		list.remove(1);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
	}
	
	@Test
	public void testList(){
		List list = new ArrayList();
		
		list.add("����");
		list.add(0, "����");
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
