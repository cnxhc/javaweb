package com.jkxy.animal;

public class AnimalMain {

	public static void main(String[] args) {
		/*
		 * 实例化cat类和dog类
		 * 并调用voice()方法
		 */
		Cat cat=new Cat("tom",3);
		cat.voice();
		Dog dog=new Dog("wangcai",2);
		dog.voice();
	}

}
