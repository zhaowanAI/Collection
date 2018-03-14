package com.atguigu.collection.bianli;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/*
 * ���ϵı�����ʽ��
 * 1��ת�����飬������for��foreach
 * 2��ֱ�ӶԼ���ʹ��foreach����������ʱ��Ч�ʸߣ�������
 * 	JDK1.5֮������
 * 3������ר�õı�������������������ͬʱ����ɾ����
 * 
 * Collection����һ��������
 * 	Iterator iterator()
 * 
 * JDK1.2���룬Iterator�� collection ���е����ĵ���������������Enumration������
 * 
 * (1)hasNext()
 * (2)next()
 * (3)remove()
 * 
 * ���ۣ�һ�ߵ���һ��ɾ����������foreach���õ�����Iterator
 * 
 * �ڲ��ࣺ
 *  ����������ֻΪ�ⲿ�ļ��϶��������˰�������������������ڼ����У����ڲ������ʽ
 */
public class TestBianLi {
	@Test
	public void test6(){
		Collection coll = new ArrayList();
		coll.add(new Student("����"));
		coll.add(new Student("����"));
		coll.add(new Student("����"));
		
		Iterator iterator = coll.iterator();
		//��ArrayList��iterator()�����У�new Itr()
		//Itr����ArrayList�е�һ����Ա�ڲ��࣬���������ʵ����Iterator�ӿ�
	}
	
	
	@Test
	public void test5(){
		Collection coll = new ArrayList();
		coll.add(new Student("����"));
		coll.add(new Student("����"));
		coll.add(new Student("����"));
		coll.add(new Student("����"));
		
		System.out.println("ɾ��֮ǰ��" + coll.size());
		
	/*	for (Object object : coll) {
			Student stu = (Student) object;
			if("����".equals(stu.getName())){
				coll.remove(object);
			}
		}*/
		Iterator iterator = coll.iterator();
		while(iterator.hasNext()){
			Student stu = (Student) iterator.next();
			if("����".equals(stu.getName())){
				iterator.remove();//ɾ���ո�next���Ǹ�Ԫ��
			}
		}
		
		
		System.out.println("ɾ��֮��" + coll.size());
	}
	
	@Test
	public void test4(){
		Collection coll = new ArrayList();
		coll.add(new Student("����"));
		coll.add(new Student("����"));
		coll.add(new Student("����"));
		coll.add(new Student("����"));
		
		System.out.println("ɾ��֮ǰ��" + coll.size());
		
		//��������д��������������Ƴ�
		coll.remove(new Student("����"));//��Ҫ�õ�Ԫ�ص�equals����
		
		System.out.println("ɾ��֮��" + coll.size());
		
		for (Object object : coll) {
			System.out.println(object);
		}
	}
	
	@Test
	public void test3(){
		Collection coll = new ArrayList();
		coll.add(1);
		coll.add(2);
		coll.add(3);
		
		Iterator iterator = coll.iterator();
		while(iterator.hasNext()){
			Object next = iterator.next();
			System.out.println(next);
		}
	}
	
	@Test
	public void test1(){
		Collection coll = new ArrayList();
		coll.add(1);
		coll.add(2);
		coll.add(3);
		
		//�Ѽ���ת������
		Object[] array = coll.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test2(){
		Collection coll = new ArrayList();
		coll.add(1);
		coll.add(2);
		coll.add(3);
		
		//for(Ԫ�ص�����  Ԫ������������){}
		for (Object object : coll) {
			System.out.println(object);
		}
	}
	
	
}
class Student{
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}