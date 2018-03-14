package com.atguigu.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/*
 * Map集合：
 * 存储的键值对（key,value)
 * key可以是任意引用类型，value也可以任意引用类型
 * 
 * 集合包括Collection，Map所有的元素都是对象，如果是基本数据类型，也是要自动装箱的。
 * 
 * key：必须是唯一的，key不可以重复的
 * value可以重复
 * 
 * Map的方法：
 * 1、添加
 * put(key,value)
 * 
 * 2、获取键值对数
 * size()
 * 
 * 3、是否包含
 * containsKey(key)
 * containsValue(value)
 * 
 * 4、根据key获取value
 * value get(key)
 * 
 * 5、根据key删除一对键值对
 * 
 * 6、遍历，迭代键值对
 * （1）遍历所有的key
 * （2）遍历所有的value
 * （3）遍历键值对 ：Entry（Node）
 * Entry是Map的内部接口类型
 * Node是Entry的实现类，它是HashMap等的内部类
 * 
 * 
 * 回忆：Collection
 * (1)转数组
 * (2)foreach
 * (3)Iterator
 * 
 * 
 * 实现类 ：
 * HashMap：哈希表
 * 
 */
public class TestMap {
	@Test
	public void testMap4(){
		Map map = new HashMap();
		
		map.put(1, "张三");
		map.put(1, "张三逢");//覆盖了
		map.put(2, "李四");
		map.put(3, "田春");
		map.put(4, "小柴");
		
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			Map.Entry entry = (Map.Entry) object;
			/*
			 * Entry的实现类：Node
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
		
		map.put(1, "张三");
		map.put(1, "张三逢");//覆盖了
		map.put(2, "李四");
		map.put(3, "田春");
		map.put(4, "小柴");
		
		//遍历所有的value
		Collection values = map.values();//因为value可能重复
		for (Object value : values) {
			System.out.println(value);
		}
	}
	
	@Test
	public void testMap2(){
		Map map = new HashMap();
		
		map.put(1, "张三");
		map.put(1, "张三逢");//覆盖了
		map.put(2, "李四");
		map.put(3, "田春");
		map.put(4, "小柴");
		
		//遍历所有的key
		Set keySet = map.keySet();//因为所有的key不可重复
		for (Object key : keySet) {
			System.out.println(key + "-->" + map.get(key));
		}
		
	}
	@Test
	public void testMap(){
		Map map = new HashMap();
		
		map.put(1, "张三");
		map.put(1, "张三逢");//覆盖了
		map.put(2, "李四");
		map.put(3, "田春");
		map.put(4, "小柴");
		
		/*System.out.println(map.size());
		
		System.out.println(map.containsKey(5));
		System.out.println(map.containsKey(2));
		
		System.out.println(map.containsValue("张三"));//false
		System.out.println(map.containsValue("李四"));//true
*/		
		System.out.println(map.get(1));
		
		map.remove(2);
		System.out.println(map.size());
		
		
	}

}
