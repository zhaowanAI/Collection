package com.atguigu.collection;

import java.util.Arrays;

/*
 * MyArray是一个容器
 * 物理结构是数组
 * 逻辑结构：动态数组
 * 
 */
public class MyArray {
	//存储数据
	private Object[] data;
	private int total;
	
	public MyArray(){
		data = new Object[10];
	}
	public MyArray(int initialSize){
		data = new Object[initialSize];
	}
	
	//提供添加的方法
	public void add(Object obj){
		if(total >= data.length){
			//假设不够了，把原来的数组扩大为2倍
			data = Arrays.copyOf(data, data.length*2);
		}
		data[total++] = obj;
	}
	
	//获取当前容器中所有的元素的个数
	public int size(){
		return total;
	}
	
	//获取所有已存的元素
	public Object[] getAll(){
		return Arrays.copyOf(data, total);
	}
	
	//删除一个元素
	public void remove(Object obj){
		//逻辑
		//1、找到要删除的元素的下标
		int index = -1;
		for (int i = 0; i < total; i++) {
			if(data[i].equals(obj)){
				index = i;
				break;
			}
		}
		if(index!=-1){
			System.arraycopy(data, index+1, data, index, total-index-1);
			data[--total]=null;
		}
	}
	
	public int getLength(){
		return data.length;
	}
}
