package com.atguigu.collection;
/*
 * 集合：容器
 * 
 * 数组也是一个容器
 * 
 * 数组：
 * 内存中：开辟一块连续的空间，数组名/引用中存储的是首地址
 * 数组的长度一旦确定是不可修改
 * 数组无法直接获取有效元素的个数
 * 
 * 集合框架：很多各种各样的容器组成
 * 
 * 物理结构：
 * 	数组：连续空间     数据+下标
 * 	链表：非连续空间    数据 + 下一个节点的地址 + 【+上一个节点的地址】
 * 逻辑结构：
 * 	动态数组
 * 	链表（单向，双向）
 *  栈
 *  树
 *  图
 *  ...
 * 
 */
public class TestCollection {
	public static void main(String[] args) {
//		int[] arr = new int[5];
		
		Node first = new Node(null,"1",null);
		Node second = new Node(first,"2",null);
		first.setNext(second);
		Node third = new Node(second,"3",null);
		second.setNext(third);
		
		/*System.out.println(first);
		System.out.println(first.getNext());
		System.out.println(first.getNext().getNext());*/
		
	/*	System.out.println(third);
		System.out.println(third.getPrev());
		System.out.println(third.getPrev().getPrev());*/
		
		
		for(Node n = first ; n!=null ; n=n.getNext()){
			System.out.println(n);
		}
	}
}
//节点
class Node{
	//上一个节点的地址
	private Node prev;
	//数据
	private Object data;
	//下一个节点的地址
	private Node next;
	
	public Node(Node prev, Object data, Node next) {
		super();
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
	
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		/*StringBuilder sb = new StringBuilder();
		if(prev!=null){
			sb.append(prev.getData());
		}else{
			sb.append("null");
		}
		sb.append(data);
		if(next!=null){
			sb.append(next.getData());
		}
		return sb.toString();*/
		return data.toString();
	}
	
}