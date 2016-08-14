package com.jkxy.animal;

public class Dog extends Animal{
	/*
	 * 
	 * 定义Dog类继承抽象类Animal
	 */
	public Dog(String name, int age) {
		super(name, age);
	}
	/*
	 * 重写Dog类的voice()方法
	 *
	 */
	@Override
	public void voice() {
		System.out.println("旺~旺~I'm a dog name:"+getName()+" age:"+getAge());
		
	}

}
