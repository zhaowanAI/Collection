package com.atguigu.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map的实现类
 * 1、哈希表
 * 	HashMap和Hashtable
 * 2、TreeMap
 * 		作为它的key，要么实现java.lang.Comparable接口
 * 		要么在创建TreeMap时，指定一个java.util.Comparator的对象
 * 3、LinkedHashMap：在HashMap的基础上，维护了一个添加的顺序
 *    添加效率低，遍历效率高
 * 
 * 4、特殊的Map：Properties，它是Hashtable的子类
 *    特殊在：key和value都是String
 *    一般用于在系统中保存配置参数的值：参数名=参数值
 */
public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap map = new TreeMap(new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Data d1= (Data) o1;
				Data d2= (Data) o2;
				return d1.getNum() - d2.getNum();
			}
			
		});
		
		map.put(new Data(1), "尚硅谷1");
		map.put(new Data(2), "尚硅谷2");
		
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
		}
	}
}
