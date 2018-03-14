package com.atguigu.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import org.junit.Test;

/*
 * List:实现类
 * （1）ArrayList：动态数组
 * 		物理结构：数组
 * 		线程不安全的
 * 		JDK1.2
 * 		不支持Enumration迭代
 * 		初始化容量是0，第一次扩为10，之后扩容的算法是：原来的1.5倍
 * 		
 * （2）Vector：动态数组
 * 		物理结构：数组
 * 		线程安全的
 * 		JDK1.0
 * 		支持旧版本的迭代：Enumration
 * 		初始化容量直接为10，之后的扩容的算法是：原来的2倍，用户可以自定义扩容的数量
 * 
 * （3）LinkedList：链表
 * 		物理结构：链表
 * 		和动态数组最大的区别：删除、插入时效率比较高
 * 	
 * 	动态数组在插入和删除时设计到移动元素
 *  链表在插入和删除时，效率比较高
 *  
 *  要求：
 *  1、会用API中的方法
 *  Collection和List接口的方法
 *  会遍历集合（foreach和Iterator)
 *  
 *  2、几种集合的特点
 *  
 *  3、最高要求：看源代码或自己模拟编写一个动态数组和链表
 *  算法结构：手动实现一个动态数组，链表
 * 
 * 
 */
public class TestListImpl {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testLinkedList(){
		LinkedList list = new LinkedList();
		list.add("张三");//first = "张三"  last = "张三"
		list.add("李四");//first = "张三"  first.next ="李四"  last="李四"
		list.add("王五");
		
		list.add(0, "赵六");
		
		list.remove("张三");
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
		ArrayList list = new ArrayList();//数组初始化为长度为0的数组
		
//		list.add("张三");//容量变成10，size=1
		for(int i=1; i<= 20; i++){
			list.add(i);
		}
		
		System.out.println(list.size());
		
	}
}
