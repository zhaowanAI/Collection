package com.atguigu.map;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class TestProperties {

	public static void main(String[] args) {
	/*	Properties properties = System.getProperties();
		Set entrySet = properties.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
		}*/
		
		Properties pro = new Properties();
		
		try {
			//从jdbc.properties文件加载，这个文件在src类路径下，使用类加载器加载
			pro.load(ClassLoader.getSystemResourceAsStream("jdbc.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(pro.getProperty("user"));
		System.out.println(pro.getProperty("pwd"));
	}

}
