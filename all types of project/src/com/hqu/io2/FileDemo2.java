package com.hqu.io2;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		getFiles("C:\\360Safe");
	}
	
	//�ݹ�
	public static void getFiles(String path){
		File file = new File(path);
		File [] files = file.listFiles();//��ȡ��·�����µ������ļ�
		//����
		for (File file2 : files) {
			//Ҫ�ж����ļ�����Ŀ¼
			if(file2.isDirectory()){
				//��Ŀ¼��ô�죿�����Լ�(�������ɸ㶨)
				getFiles(file2.getAbsolutePath());
				System.out.println("Ŀ¼"+file2.getName());
			}else{
				//���ļ���ô�죿 ����ļ���
				System.out.println("�ļ�"+file2.getName());
			}	
		}
	}
	
}