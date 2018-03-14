package com.atguigu.map;

import java.util.HashMap;

/*
 * Map的实现类
 * 1、哈希表
 * Hashtable：旧（jdk1.0)
 * 	线程安全的
 *  键和值是非null
 * HashMap：新(jdk1.2)
 * 	线程不安全
 *  键和值允许null
 *  
 *  HashMap的底层实现：
 *   	jdk1.7：数组+链表
 *   	jdk1.8：数组+链表/树
 *   
 *   JDK1.8：先是Node类型，树形化后是TreeNode类型
 *   
 *   如果均匀分布：
 *   loadFactor：默认0.75  当数组的threshold空间都存储满了，就会导致扩容
 *   threshold：数组的长度  * loadFactor
 *   如果不是均匀分布:
 *   当单个分支的个数达到8个，判断总容量是否达到64，如果没有达到64，先扩容解决
 *   如果单个分支个数达到8个，而且容量达到64，这个把单个分支“树形化”，链表变成树
 *   
 *   JDK1.7:
 *   当size达到容量*0.75的个数后，在添加就会扩容，扩容为2倍，元素的类型是Entry
 *   
 * 
 * 面试题：ArrayList和Vector区别
 *      Hashtable与HashMap区别
 */
public class TestHashMap {

	public static void main(String[] args) {
		/*HashMap map = new HashMap();
		for(int i=1; i<100; i++){
			map.put(i, "尚硅谷"+i);
		}*/
		
		HashMap map = new HashMap();
		for(int i=1; i<100; i++){
			map.put(new Data(i), "尚硅谷"+i);//添加到第9个，扩容32，第10个，扩容为64，第11个
		}
	}

}
class Data{
	private int num;

	public Data(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
