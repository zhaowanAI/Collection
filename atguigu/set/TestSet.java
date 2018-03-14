package com.atguigu.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/*
 * Set������ģ������ظ���
 * 
 * Set�ķ������Ǵ�Collection�̳еģ�û���Զ���ķ���
 * ������ʽ��foreach��Iterator
 * 
 * ʵ���ࣺ
 * HashSet��
 * 	�ײ�ʵ�֣�HashMap����ϣ��
 * 	�Ƿ����ظ�Ԫ�ص������ǣ�equals������hashcode�ܹ����ڼ���洢�ġ�Ͱ������λ��
 * 		JDK1.8֮ǰ������+����
 * 		JDK1.8֮������+����/��
 * TreeSet��
 * 	�ײ�ʵ�֣�TreeMap
 * 		ʹ��Ԫ�ص���Ȼ˳��Comparable��Ԫ�ؽ������򣬻��߸��ݴ��� set ʱ�ṩ�� Comparator �������򣬾���ȡ����ʹ�õĹ��췽���� 
 * LinkedHashSet��
 * 	��HashSet�Ļ����ϣ���ά����һ����ӵ�˳��
 *  ��HashSet�����ʱ��Ч�ʵ�
 *  ��HashSet������ʱ��Ч�ʸ�
 * 
 */
public class TestSet {
	class StudentComparator implements Comparator{
		public int compare(Object o1, Object o2){
			Student stu1 = (Student) o1;
			Student stu2 = (Student) o2;
			return stu1.getId() - stu2.getId();
		}
	}
	
	@Test
	public void testSet7(){
		/*Set set = new TreeSet(new Comparator(){
			public int compare(Object o1, Object o2){
				Student stu1 = (Student) o1;
				Student stu2 = (Student) o2;
				return stu1.getId() - stu2.getId();
			}
		});*/
		
		Set set = new TreeSet(new StudentComparator());
		set.add(new Student(1,"Irene"));
		set.add(new Student(2,"Lily"));
		set.add(new Student(3,"Lucy"));
		set.add(new Student(4,"Alice"));
		
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testSet6(){
		Set set = new TreeSet();
		set.add("Irene");
		set.add("Lily");
		set.add("Lucy");
		set.add("Alice");
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	
	@Test
	public void testSet5(){
		Set set = new TreeSet();
		set.add(5);
		set.add(1);
		set.add(8);
		set.add(2);
		set.add(1);//�ظ�
		
		System.out.println("Ԫ�ظ�����"+set.size());
		
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testSet4(){
		Set set = new HashSet();
		set.add(new Student(1,"����"));
		set.add(new Student(1,"����"));
		set.add(new Student(3,"����"));
		set.add(new Student(4,"����"));
		
		//Studentû����дObject��equals��hashcode������Ĭ��equals������==һ��
		
		System.out.println(set.size());
	}
	
	
	@Test
	public void testSet3(){
		Set set = new LinkedHashSet();
		set.add("����");
		set.add("����");
		set.add("Wangwu");
		set.add("����");
		
		for (Object object : set) {
			System.out.println(object);//�����
		}
	}
	
	
	@Test
	public void testSet2(){
		Set set = new HashSet();
		set.add("����");
		set.add("����");
		set.add("Wangwu");
		set.add("����");
		
		for (Object object : set) {
			System.out.println(object);//�����
		}
	}
	
	@Test
	public void testSet(){
		Set set = new HashSet();
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		
		System.out.println(set.size());//�����ظ�
	}
}
class Student{
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
}