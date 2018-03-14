package com.atguigu.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/*
 * Set：无序的，不可重复的
 * 
 * Set的方法都是从Collection继承的，没有自定义的方法
 * 遍历方式：foreach和Iterator
 * 
 * 实现类：
 * HashSet：
 * 	底层实现：HashMap（哈希表）
 * 	是否是重复元素的依据是：equals方法，hashcode能够用于计算存储的“桶”索引位置
 * 		JDK1.8之前：数组+链表
 * 		JDK1.8之后：数组+链表/树
 * TreeSet：
 * 	底层实现：TreeMap
 * 		使用元素的自然顺序Comparable对元素进行排序，或者根据创建 set 时提供的 Comparator 进行排序，具体取决于使用的构造方法。 
 * LinkedHashSet：
 * 	在HashSet的基础上，多维护了一个添加的顺序
 *  比HashSet：添加时，效率低
 *  比HashSet：遍历时，效率高
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
		set.add(1);//重复
		
		System.out.println("元素个数："+set.size());
		
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testSet4(){
		Set set = new HashSet();
		set.add(new Student(1,"张三"));
		set.add(new Student(1,"张三"));
		set.add(new Student(3,"李四"));
		set.add(new Student(4,"王五"));
		
		//Student没有重写Object的equals和hashcode方法，默认equals方法与==一样
		
		System.out.println(set.size());
	}
	
	
	@Test
	public void testSet3(){
		Set set = new LinkedHashSet();
		set.add("张三");
		set.add("李四");
		set.add("Wangwu");
		set.add("赵六");
		
		for (Object object : set) {
			System.out.println(object);//无序的
		}
	}
	
	
	@Test
	public void testSet2(){
		Set set = new HashSet();
		set.add("张三");
		set.add("李四");
		set.add("Wangwu");
		set.add("赵六");
		
		for (Object object : set) {
			System.out.println(object);//无序的
		}
	}
	
	@Test
	public void testSet(){
		Set set = new HashSet();
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		
		System.out.println(set.size());//不可重复
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