package com.atguigu.collection;

import java.util.Arrays;

/*
 * MyArray��һ������
 * ����ṹ������
 * �߼��ṹ����̬����
 * 
 */
public class MyArray {
	//�洢����
	private Object[] data;
	private int total;
	
	public MyArray(){
		data = new Object[10];
	}
	public MyArray(int initialSize){
		data = new Object[initialSize];
	}
	
	//�ṩ��ӵķ���
	public void add(Object obj){
		if(total >= data.length){
			//���費���ˣ���ԭ������������Ϊ2��
			data = Arrays.copyOf(data, data.length*2);
		}
		data[total++] = obj;
	}
	
	//��ȡ��ǰ���������е�Ԫ�صĸ���
	public int size(){
		return total;
	}
	
	//��ȡ�����Ѵ��Ԫ��
	public Object[] getAll(){
		return Arrays.copyOf(data, total);
	}
	
	//ɾ��һ��Ԫ��
	public void remove(Object obj){
		//�߼�
		//1���ҵ�Ҫɾ����Ԫ�ص��±�
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
