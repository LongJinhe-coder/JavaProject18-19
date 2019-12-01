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
	 * 代表文件的时候： 1.获取文件名 2.获取文件路径 3.获取文件大小 4.获取文件的最后修改时间
	 */
	public static void getSoming() {
		File file = new File("d://1.txt");
		System.out.println("文件名：" + file.getName());
		System.out.println("相对路径：" + file.getPath());
		System.out.println("绝对路径：" + file.getAbsolutePath());
		System.out.println("文件大小：" + file.length());
		System.out.println("最后修改时间：" + file.lastModified());
		// 时间格式化
		Date date = new Date(file.lastModified());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(date);
		System.out.println(time);
	}

	/*
	 * 对file的常见操作 创建文件：createNewFile 删除文件：delete 创建目录：mkdir mkdirs 重命名:renameTo
	 * 判断是否是文件：isFile 判断是否是目录：isDirectory 判断文件是否存在：exists
	 */
	public static void getSoming2() throws IOException {
		File file = new File("d://dir2创建的新目录//java");
		if (!file.exists()) {// 存在：返回true
			// file.createNewFile();//创建文件
			// file.mkdir();//只能创建一级目录
			file.mkdirs();// 可以创建多级目录

			File file2 = new File("d://创建的新文件");
			if (!file2.exists()) {// 存在：返回true
				file2.createNewFile();// 创建文件

			}

		}
	}
}
