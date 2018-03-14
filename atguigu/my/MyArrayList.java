package com.atguigu.my;

import java.util.Arrays;

public class MyArrayList {
	private Object[] data;
	private int size;
	
	public MyArrayList(){
		data = new Object[10];
	}
	
	public void add(Object obj){
		if(size>=data.length){
			data = Arrays.copyOf(data, data.length*2);
		}
		data[size++] = obj;
	}
	
	public void add(int index,Object obj){
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException(index+"³¬¹ýË÷Òý·¶Î§");
		}
		if(size>=data.length){
			data = Arrays.copyOf(data, data.length*2);
		}
		System.arraycopy(data, index, data, index+1, size-index);
		data[index] = obj;
		size++;
	}
	
	public void remove(Object obj){
		int index = indexOf(obj);
		if(index!=-1){
			remove(index);
		}
	}
	public void remove(int index){
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException(index+"³¬¹ýË÷Òý·¶Î§");
		}
		System.arraycopy(data, index+1, data, index, size-index-1);
		data[--size] = null;
	}
	
	public void set(int index ,Object obj){
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException(index+"³¬¹ýË÷Òý·¶Î§");
		}
		data[index] = obj;
	}
	
	public Object get(int index){
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException(index+"³¬¹ýË÷Òý·¶Î§");
		}
		return data[index];
	}
	
	public boolean contains(Object obj){
		if(indexOf(obj)!=-1){
			return true;
		}
		return false;
	}
	
	public int indexOf(Object obj){
		int index = -1;
		if(obj == null){
			for (int i = 0; i < size; i++){
                if (data[i] == null) {
                   index = i;
                   break;
                }
			}
		}else{
			for (int i = 0; i < size; i++){
                if (obj.equals(data[i])) {
                   index = i;
                   break;
                }
			}
		}
		return index;
	}
	
	public int lastIndexOf(Object obj){
		int index = -1;
		if(obj == null){
			for (int i = size-1; i >=0; i--){
                if (data[i] == null) {
                   index = i;
                   break;
                }
			}
		}else{
			for (int i = size-1; i >=0; i--){
                if (obj.equals(data[i])) {
                   index = i;
                   break;
                }
			}
		}
		return index;
	}
	
	public int size(){
		return size;
	}
	
	public Object[] toArray(){
		return Arrays.copyOf(data, size);
	}
}
