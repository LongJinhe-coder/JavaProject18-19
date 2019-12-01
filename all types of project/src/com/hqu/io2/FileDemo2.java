package com.hqu.io2;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		getFiles("C:\\360Safe");
	}
	
	//递归
	public static void getFiles(String path){
		File file = new File(path);
		File [] files = file.listFiles();//获取该路径底下的所有文件
		//遍历
		for (File file2 : files) {
			//要判断是文件还是目录
			if(file2.isDirectory()){
				//是目录怎么办？调用自己(可以轻松搞定)
				getFiles(file2.getAbsolutePath());
				System.out.println("目录"+file2.getName());
			}else{
				//是文件怎么办？ 输出文件名
				System.out.println("文件"+file2.getName());
			}	
		}
	}
	
}