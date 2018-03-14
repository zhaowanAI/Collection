package com.atguigu.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

/*
 * Collection：
 * 	List：有序的，可重复的
 *  Set：无序的，不可重复的
 *  
 * List： 
 *  有序的 collection（也称为序列）。
 *  此接口的用户可以对列表中每个元素的插入位置进行精确地控制。
 *  用户可以根据元素的整数索引（在列表中的位置）访问元素，并搜索列表中的元素。
 *  
 *  方法：
 *  Collection接口中有的，它都有
 *  Collection接口中没有的，它多了一些和index相关的方法
 *  
 *  1、添加
 *  add(Object)
 *  addAll(Collection)
 *  add(index,Object)
 *  addAll(index,Collection)
 *  
 *  2、删除
 *  remove(Object)
 *  remove(index)
 *  removeAll(Collection c)
 *  
 *  3、获取
 *  get(index)
 *  
 *  4、查找索引
 *  indexOf(Object)
 *  lastIndexOf(Object)
 *  如果没有返回-1
 *  
 *  5、替换
 *  set(index,Object)
 *  
 *  6、subList(int,int)
 *  
 *  7、List系列的集合的专有迭代器
 *  ListIterator是继承了Iterator接口
 *  
 *  ListIterator listIterator()
 *  ListIterator listIterator(index)
 *  
 *  与Iterator不同：
 *  （1）方向任意
 *  （2）可以获取索引位置
 *  （3）遍历同时可以修改，添加，删除
 *  
 *  Iterator只能从前往后，只能删除，无法获取索引信息
 *  
 */
public class TestList {
	@Test
	public void testList8(){
		List list = new ArrayList();
		
		list.add("张三");
		list.add("李四");
		list.add("张三");
		list.add("赵六");
		
		ListIterator iter = list.listIterator(2);
		
		while(iter.hasPrevious()){
			System.out.println(iter.previousIndex());
			System.out.println(iter.previous());
		}
		
	}
	
	@Test
	public void testList7(){
		List list = new ArrayList();
		
		list.add("张三");
		list.add("李四");
		list.add("张三");
		list.add("赵六");
		
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
		
		list.add("张三");
		list.add("李四");
		list.add("张三");
		list.add("赵六");
		
		List subList = list.subList(0, 2);//[from,to)
		System.out.println(subList.size());
		
		subList.add("田春");//subList不是ArrayList,而是一个SubList的类型，也是List的实现类
	}
	
	@Test
	public void testList5(){
		List list = new ArrayList();
		
		list.add("张三");
		list.add("李四");
		list.add("张三");
		list.add("赵六");
		
		list.set(0, "田春");
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testList4(){
		List list = new ArrayList();
		
		list.add("张三");
		list.add("李四");
		list.add("张三");
		list.add("赵六");
		
		int indexOf = list.indexOf("张三");
		int indexOf2 = list.lastIndexOf("张三");
		System.out.println(indexOf);
		System.out.println(indexOf2);
		
		System.out.println(list.indexOf("小柴"));
		
	}
	
	@Test
	public void testList3(){
		List list = new ArrayList();
		
		list.add("张三");
		list.add(0, "李四");
		list.add(0, "王五");
		list.add(0, "赵六");
		
		System.out.println(list.get(1));
		
	}
	@Test
	public void testList2(){
		List list = new ArrayList();
		
		list.add("张三");
		list.add(0, "李四");
		list.add(0, "王五");
		list.add(0, "赵六");
		
		list.remove(1);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
	}
	
	@Test
	public void testList(){
		List list = new ArrayList();
		
		list.add("张三");
		list.add(0, "李四");
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
