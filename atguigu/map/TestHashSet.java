package com.atguigu.map;

import java.util.HashSet;

/*
 * HashSet：底层是HashMap
 * HashSet的元素是HashMap的key，value是一个常量对象：Object
 * 
 * HashMap的key不可以重复，HashSet不可以重复
 * 
 */
public class TestHashSet {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("张三");
	}

}
