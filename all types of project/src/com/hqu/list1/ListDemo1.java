package com.hqu.list1;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListDemo1 {
public static void main(String[] args) {
	//����������ʵ����/��������
	List<String> list=new ArrayList<>();
	//������ϰ����
	list.add("С�ɰ�");
	list.add("�ڹ�");
	list.add("��ǿ");
	//�жϼ����Ƿ�null�������ϲ�Ϊnullʱ���ж��Ƿ���С�ף���������������С��
	if(!list.isEmpty()){//Ϊnull������true
		if(!list.contains("С��")){
			list.add("С��");
		}
	}
	//�鿴���ϴ�С
	System.out.println("���������Ԫ�ظ���"+list.size());
	//��ȡ��һ��Ԫ��
	System.out.println("��һ����"+list.get(0));
	
	//����1��for
	for (int i = 0; i < list.size(); i++) {
		System.out.println("for������"+list.get(i));
	}
	
	//����2������
	Iterator<String> it=list.iterator();
	while(it.hasNext()){
		System.out.println("����"+it.next());
	}
	
	//����3��foreach
	for(String s:list){
		System.out.println("foreach����"+s);
	}
	
}
}
