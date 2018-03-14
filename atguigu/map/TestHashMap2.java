package com.atguigu.map;

import java.util.HashMap;

/*
 * Object中：hashcode根据地址计算的一个值
 * 当重写了hashcode和equals方法，id值是和计算hash值有关，id变量，hashcode值变化
 * 
 * 根据新的hash值去找原来的对象，找不到
 * 
 * 结论：作为Map的key的类型，用于计算hashcode值的属性，一旦放到map中，不要修改
 */
public class TestHashMap2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		MyData myData = new MyData(1,"张三");
		map.put(myData, "尚硅谷");
		
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