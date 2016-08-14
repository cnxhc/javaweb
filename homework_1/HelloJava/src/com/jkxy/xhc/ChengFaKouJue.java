package com.jkxy.xhc;

public class ChengFaKouJue {

	public static void main(String[] args) {
		/*
		 * 通过双重循环打印乘法口诀表。
		 */
		for(int i=1;i<=9;i++){ 
			for(int j=1;j<=i;j++){ 
				System.out.print(j+"*"+i+"="+i*j +"\t");
			}
			System.out.println();
		}
	}

}
