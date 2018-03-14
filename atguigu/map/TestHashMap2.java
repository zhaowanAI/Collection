package com.atguigu.map;

import java.util.HashMap;

/*
 * Object�У�hashcode���ݵ�ַ�����һ��ֵ
 * ����д��hashcode��equals������idֵ�Ǻͼ���hashֵ�йأ�id������hashcodeֵ�仯
 * 
 * �����µ�hashֵȥ��ԭ���Ķ����Ҳ���
 * 
 * ���ۣ���ΪMap��key�����ͣ����ڼ���hashcodeֵ�����ԣ�һ���ŵ�map�У���Ҫ�޸�
 */
public class TestHashMap2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		MyData myData = new MyData(1,"����");
		map.put(myData, "�й��");
		
		myData.setId(2);
		
		System.out.println(myData.hashCode());
		Object value = map.get(myData);
		System.out.println(value);
	}

}
class MyData{
	private int id;
	private String name;
	public MyData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyData other = (MyData) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}