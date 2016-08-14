package com.jkxy.animal;

abstract public class Animal {
	/*
	 * 封装抽象方法Animal
	 * 定义抽象方法voice()
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
