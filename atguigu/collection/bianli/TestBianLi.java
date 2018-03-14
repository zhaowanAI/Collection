package com.atguigu.collection.bianli;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/*
 * 集合的遍历方式：
 * 1、转成数组，遍历：for和foreach
 * 2、直接对集合使用foreach：仅仅遍历时，效率高，代码简洁
 * 	JDK1.5之后引入
 * 3、集合专用的遍历：迭代器：遍历的同时可以删除等
 * 
 * Collection中有一个方法：
 * 	Iterator iterator()
 * 
 * JDK1.2引入，Iterator对 collection 进行迭代的迭代器。用来代替Enumration迭代。
 * 
 * (1)hasNext()
 * (2)next()
 * (3)remove()
 * 
 * 结论：一边迭代一边删除，不能用foreach，用迭代器Iterator
 * 
 * 内部类：
 *  迭代器类型只为外部的集合对象服务，因此把这个迭代器类型声明在集合中，用内部类的形式
 */
public class TestBianLi {
	@Test
	public void test6(){
		Collection coll = new ArrayList();
		coll.add(new Student("张三"));
		coll.add(new Student("李四"));
		coll.add(new Student("王五"));
		
		Iterator iterator = coll.iterator();
		//在ArrayList的iterator()方法中，new Itr()
		//Itr是在ArrayList中的一个成员内部类，而且这个类实现了Iterator接口
	}
	
	
	@Test
	public void test5(){
		Collection coll = new ArrayList();
		coll.add(new Student("张三"));
		coll.add(new Student("李四"));
		coll.add(new Student("王五"));
		coll.add(new Student("赵六"));
		
		System.out.println("删除之前：" + coll.size());
		
	/*	for (Object object : coll) {
			Student stu = (Student) object;
			if("张三".equals(stu.getName())){
				coll.remove(object);
			}
		}*/
		Iterator iterator = coll.iterator();
		while(iterator.hasNext()){
			Student stu = (Student) iterator.next();
			if("张三".equals(stu.getName())){
				iterator.remove();//删除刚刚next的那个元素
			}
		}
		
		
		System.out.println("删除之后：" + coll.size());
	}
	
	@Test
	public void test4(){
		Collection coll = new ArrayList();
		coll.add(new Student("张三"));
		coll.add(new Student("李四"));
		coll.add(new Student("王五"));
		coll.add(new Student("赵六"));
		
		System.out.println("删除之前：" + coll.size());
		
		//如果集合中存在张三，把它移除
		coll.remove(new Student("张三"));//需要用到元素的equals方法
		
		System.out.println("删除之后：" + coll.size());
		
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
		
		//把集合转成数组
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
		
		//for(元素的类型  元素名：集合名){}
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