package com.jkxy.animal;

public class Dog extends Animal{
	/*
	 * 
	 * ����Dog��̳г�����Animal
	 */
	public Dog(String name, int age) {
		super(name, age);
	}
	/*
	 * ��дDog���voice()����
	 *
	 */
	@Override
	public void voice() {
		System.out.println("��~��~I'm a dog name:"+getName()+" age:"+getAge());
		
	}

}
