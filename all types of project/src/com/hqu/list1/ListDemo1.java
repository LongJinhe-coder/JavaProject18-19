package com.hqu.list1;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListDemo1 {
public static void main(String[] args) {
	//创建容器（实例化/创建对象）
	List<String> list=new ArrayList<>();
	//常用练习方法
	list.add("小可爱");
	list.add("黑鬼");
	list.add("德强");
	//判断集合是否null，当集合不为null时，判断是否有小白，如果不包含，添加小白
	if(!list.isEmpty()){//为null，返回true
		if(!list.contains("小白")){
			list.add("小白");
		}
	}
	//查看集合大小
	System.out.println("集合里面的元素个数"+list.size());
	//获取第一个元素
	System.out.println("第一个是"+list.get(0));
	
	//遍历1：for
	for (int i = 0; i < list.size(); i++) {
		System.out.println("for遍历："+list.get(i));
	}
	
	//遍历2：迭代
	Iterator<String> it=list.iterator();
	while(it.hasNext()){
		System.out.println("迭代"+it.next());
	}
	
	//遍历3：foreach
	for(String s:list){
		System.out.println("foreach遍历"+s);
	}
	
}
}
