package com.atguigu.map;

import java.util.HashMap;

/*
 * Map��ʵ����
 * 1����ϣ��
 * Hashtable���ɣ�jdk1.0)
 * 	�̰߳�ȫ��
 *  ����ֵ�Ƿ�null
 * HashMap����(jdk1.2)
 * 	�̲߳���ȫ
 *  ����ֵ����null
 *  
 *  HashMap�ĵײ�ʵ�֣�
 *   	jdk1.7������+����
 *   	jdk1.8������+����/��
 *   
 *   JDK1.8������Node���ͣ����λ�����TreeNode����
 *   
 *   ������ȷֲ���
 *   loadFactor��Ĭ��0.75  �������threshold�ռ䶼�洢���ˣ��ͻᵼ������
 *   threshold������ĳ���  * loadFactor
 *   ������Ǿ��ȷֲ�:
 *   ��������֧�ĸ����ﵽ8�����ж��������Ƿ�ﵽ64�����û�дﵽ64�������ݽ��
 *   ���������֧�����ﵽ8�������������ﵽ64������ѵ�����֧�����λ�������������
 *   
 *   JDK1.7:
 *   ��size�ﵽ����*0.75�ĸ���������Ӿͻ����ݣ�����Ϊ2����Ԫ�ص�������Entry
 *   
 * 
 * �����⣺ArrayList��Vector����
 *      Hashtable��HashMap����
 */
public class TestHashMap {

	public static void main(String[] args) {
		/*HashMap map = new HashMap();
		for(int i=1; i<100; i++){
			map.put(i, "�й��"+i);
		}*/
		
		HashMap map = new HashMap();
		for(int i=1; i<100; i++){
			map.put(new Data(i), "�й��"+i);//��ӵ���9��������32����10��������Ϊ64����11��
		}
	}

}
class Data{
	private int num;

	public Data(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
