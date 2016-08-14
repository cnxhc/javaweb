package com.jkxy.animal;

abstract public class Animal {
	/*
	 * ��װ���󷽷�Animal
	 * ������󷽷�voice()
	 */
	private String name;
	private int age;
	public Animal(String name,int age){ 
		this.name=name;
		this.age=age;
	}
	public void setName() {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public abstract void voice();
	
}
