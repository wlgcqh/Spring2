package com.qiheng.test;

public class Chinese implements Person {

	private Dog dog;
	
	
	@Override
	public Dog getDog() {
		return dog;
	}
	@Override
	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String sayHello() {
		
		return "你好! "+dog.run();
	}

	@Override
	public String sayByebye() {
		
		return "再见! "+dog.run();
	}

}
