package com.atguigu.collection;
/*
 * ���ϣ�����
 * 
 * ����Ҳ��һ������
 * 
 * ���飺
 * �ڴ��У�����һ�������Ŀռ䣬������/�����д洢�����׵�ַ
 * ����ĳ���һ��ȷ���ǲ����޸�
 * �����޷�ֱ�ӻ�ȡ��ЧԪ�صĸ���
 * 
 * ���Ͽ�ܣ��ܶ���ָ������������
 * 
 * ����ṹ��
 * 	���飺�����ռ�     ����+�±�
 * 	�����������ռ�    ���� + ��һ���ڵ�ĵ�ַ + ��+��һ���ڵ�ĵ�ַ��
 * �߼��ṹ��
 * 	��̬����
 * 	��������˫��
 *  ջ
 *  ��
 *  ͼ
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
//�ڵ�
class Node{
	//��һ���ڵ�ĵ�ַ
	private Node prev;
	//����
	private Object data;
	//��һ���ڵ�ĵ�ַ
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