package com.hqu.io2;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		getSoming();
		getSoming2();
	}

	/*
	 * �����ļ���ʱ�� 1.��ȡ�ļ��� 2.��ȡ�ļ�·�� 3.��ȡ�ļ���С 4.��ȡ�ļ�������޸�ʱ��
	 */
	public static void getSoming() {
		File file = new File("d://1.txt");
		System.out.println("�ļ�����" + file.getName());
		System.out.println("���·����" + file.getPath());
		System.out.println("����·����" + file.getAbsolutePath());
		System.out.println("�ļ���С��" + file.length());
		System.out.println("����޸�ʱ�䣺" + file.lastModified());
		// ʱ���ʽ��
		Date date = new Date(file.lastModified());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(date);
		System.out.println(time);
	}

	/*
	 * ��file�ĳ������� �����ļ���createNewFile ɾ���ļ���delete ����Ŀ¼��mkdir mkdirs ������:renameTo
	 * �ж��Ƿ����ļ���isFile �ж��Ƿ���Ŀ¼��isDirectory �ж��ļ��Ƿ���ڣ�exists
	 */
	public static void getSoming2() throws IOException {
		File file = new File("d://dir2��������Ŀ¼//java");
		if (!file.exists()) {// ���ڣ�����true
			// file.createNewFile();//�����ļ�
			// file.mkdir();//ֻ�ܴ���һ��Ŀ¼
			file.mkdirs();// ���Դ����༶Ŀ¼

			File file2 = new File("d://���������ļ�");
			if (!file2.exists()) {// ���ڣ�����true
				file2.createNewFile();// �����ļ�

			}

		}
	}
}
