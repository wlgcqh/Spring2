package com.qiheng.test;

public class HotDog implements Dog {

	private String name;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String run() {

		return name + "fast run!!!";
	}

}
