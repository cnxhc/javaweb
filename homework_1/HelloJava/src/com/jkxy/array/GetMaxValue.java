package com.jkxy.array;

import java.util.Arrays;
import java.util.Random;

public class GetMaxValue {

	public static void main(String[] args) {
		// 定义一个长度为10的数组
		int[] arr = new int[10];
		/*
		 * 通过randomNumber()生成随机数组
		 */
		randomNumber(arr);
		System.out.println("随机数组为arr：" + Arrays.toString(arr));
		// getMaxValue()获取最大值
		System.out.println("数组最大值为：" + getMaxValue(arr));

	}

	/*
	 * 定义一个获取数组最大值的方法getMaxValue()
	 * 返回一个整型
	 */
	public static int getMaxValue(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/*
	 * 定义一个为数组随机填充数字的方法.
	 * 返回一个数组
	 */
	public static void randomNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			Random r = new Random();
			arr[i] = r.nextInt(100);
		}

	}

}
