package com.atguigu.my;

public class MyLinkedList {
	private Node first;
	private Node last;
	private int size;
	
	public void add(Object obj){
		Node l = last;
		Node newNode = new Node(l,obj,null);
		last = newNode;
		if(first == null){
			first = newNode;
		}else{
			l.next = newNode;
		}
		size++;
	}
	
	public void add(int index, Object obj){
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException(index+"超过索引范围");
		}
		
		if(index == 0){
			addFirst(obj);
		}else if(index == size){
			addLast(obj);
		}else{
			Node node = first;
			for(int i=0; i<index; i++){
				node = node.next;
			}
			Node prev = node.prev;
			Node newNode = new Node(prev,obj,node);
			prev.next = newNode;
			node.prev = newNode;
		}
	}
	
	public void addFirst(Object obj){
		Node f = first;
		Node newNode = new Node(null,obj,first);
		first = newNode;
		if(f != null){
			f.prev = newNode;
		}
	}
	
	public void addLast(Object obj){
		Node l = last;
		Node newNode = new Node(last,obj,null);
		last = newNode;
		if(last!=null){
			l.next = newNode;
		}
	}
	
	public Object getFirst(){
		return first.item;
	}
	
	public Object getLast(){
		return last.item;
	}
	
	public Object get(int index){
		Node node = first;
		for(int i=0; i<index; i++){
			node = node.next;
		}
		return node.item;
	}
	
	public void remove(Object obj){
		if(obj==null){
			Node node = first;
			for(int i=0; i<size; i++){
				if(node.item==null){
					remove(i);
					break;
				}
			}
		}else{
			Node node = first;
			for(int i=0; i<size; i++){
				if(node.item.equals(obj)){
					remove(i);
					break;
				}
			}
		}
	}
	
	public void remove(int index){
		Node node = first;
		for(int i=0; i<index; i++){
			node = node.next;
		}
		Node prev = node.prev;
		Node next = node.next;
		prev.next = node.next;
		next.prev = prev;
		//变成垃圾
		node.prev = null;
		node.next = null;
		node.item = null;
		
		size--;
	}
	
	public int size(){
		return size;
	}
	
    private static class Node {
    	Object item;
        Node next;
        Node prev;

        Node(Node prev, Object element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    
    public Object[] toArray(){
    	Object[] arr = new Object[size];
    	Node node = first;
    	for(int i=0;i<size;i++){
    		arr[i] = node.item;
    		node = node.next;
    	}
    	return arr;
    }
}
