package com.jkxy.animal;

public class Cat extends Animal {
	/*
	 * 定义cat类继承抽象类Animal
	 */
	public Cat(String name, int age) {
		super(name, age);
	}
	/*
	 * 重写Cat类的抽象方法voice()
	 * 
	 */
	@Override
	public void voice() {
		System.out.println("喵~喵~I'm a cat name:"+getName()+" age:"+getAge());
	}

}
