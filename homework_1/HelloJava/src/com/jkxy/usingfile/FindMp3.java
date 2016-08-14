package com.jkxy.usingfile;

import java.io.File;

public class FindMp3 {
	public static void main(String[] args) {
		/*
		 * 读取指定目录的所有mp3文件，包括所有子目录
		 * 将读取的文件名呈现在控制台
		 */
		File file = new File("../HelloJava");
		//调用静态方法，打印mp3文件
		printFiles(file);
	}
	//定义一个printFiles()方法，查找指定目录的mp3文件。
	public static void printFiles(File dir) {
		if (dir.isDirectory()) {
			File next[] = dir.listFiles();
			for (int i = 0; i < next.length; i++) {
				if (next[i].getName().endsWith(".mp3"))
					System.out.println(next[i].getName());
				if (next[i].isDirectory())
					printFiles(next[i]);
			}
		}
	}
}
