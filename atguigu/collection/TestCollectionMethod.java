package com.atguigu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

/*
 * Collection：
 * 所有的集合在java.util包
 * 
 * 	Collection 层次结构 中的根接口。
 * 	说明：JDK1.5之后，Collection有一个父接口，java.lang.Iterable，表示可迭代的，可使用foreach循环
 * 
 * Collection 表示一组对象，这些对象也称为 collection 的元素。
 * 一些 collection 允许有重复的元素，而另一些则不允许。
 * 一些 collection 是有序的，而另一些则是无序的。
 * JDK 不提供此接口的任何直接 实现：它提供更具体的子接口（如 Set 和 List）实现。
 * 此接口通常用来传递 collection，并在需要最大普遍性的地方操作这些 collection。 
 * 
 * 方法：
 * 1、添加
 * （1）添加一个元素
 * add(Object)
 * addAll(Collection c):把c中的元素一一都添加到当前集合中
 * 
 * 2、是否为空集合
 * isEmpty()
 * 
 * 3、是否包含某个元素
 * contains(Object)
 * containsAll(Collection c)：判断当前集合是否包含集合c中的每一个元素
 * 
 * 4、删除
 * remove(Object)
 * removeAll(Collection c)：从当前集合中把和c中一样的元素一一删除，c不受影响
 * 
 * 5、清空
 * clear()
 * 
 * 6、retainAll(Collection c) :取交集，放到当前集合中，c不受影响
 */
public class TestCollectionMethod {
	@Test
	public void testCollection4(){
		Collection coll1 = new ArrayList();
		coll1.add(1);
		coll1.add(2);
		coll1.add(5);
		
		Collection coll2 = new ArrayList();
		coll2.add(1);
		coll2.add(2);
		coll2.add(3);
		
		coll1.retainAll(coll2);
		System.out.println("coll1的元素个数：" + coll1.size());
		System.out.println("coll2的元素个数：" + coll2.size());
		Object[] array = coll1.toArray();
		System.out.println(Arrays.toString(array));
	}
	
	@Test
	public void testCollection3(){
		Collection coll1 = new ArrayList();
		coll1.add(1);
		coll1.add(2);
		
		Collection coll2 = new ArrayList();
		coll2.add(1);
		coll2.add(2);
		coll2.add(3);
		
//		boolean flag = coll2.containsAll(coll1);
//		System.out.println(flag);
		
		coll2.removeAll(coll1);
		System.out.println("coll1的元素个数：" + coll1.size());
		System.out.println("coll2的元素个数：" + coll2.size());
	}
	
	@Test
	public void testCollection2(){
		Collection coll1 = new ArrayList();
		coll1.add(1);
		coll1.add(2);
		
		Collection coll2 = new ArrayList();
		coll2.add(1);
		coll2.add(2);
		coll2.add(3);
		
		coll1.addAll(coll2);//把集合coll2中的所有元素都添加到coll1
//		coll1.add(coll2);//把coll2当做一个整体，一个对象
		
		System.out.println("集合1："+coll1.size());
		System.out.println("集合2："+coll2.size());
		
		Object[] array = coll1.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testCollection(){
		Collection coll = new ArrayList();
		
		System.out.println("是否为空集合：" + coll.isEmpty());
		
		coll.add("张三");
		coll.add("李四");
		
/*		System.out.println("元素的个数：" + coll.size());
		System.out.println("是否为空集合：" + coll.isEmpty());
		
		System.out.println("是否包含张三：" + coll.contains("张三"));
		System.out.println("是否包含王五：" + coll.contains("王五"));
		
		//删除：
		coll.remove("张三");
		System.out.println("元素的个数：" + coll.size());
		
		coll.clear();
		System.out.println("是否为空集合：" + coll.isEmpty());*/
		
		Object[] array = coll.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}
}
