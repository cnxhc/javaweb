package com.jkxy.animal;

public class Cat extends Animal {
	/*
	 * ����cat��̳г�����Animal
	 */
	public Cat(String name, int age) {
		super(name, age);
	}
	/*
	 * ��дCat��ĳ��󷽷�voice()
	 * 
	 */
	@Override
	public void voice() {
		System.out.println("��~��~I'm a cat name:"+getName()+" age:"+getAge());
	}

}
