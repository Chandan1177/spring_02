package com.spring.eclipse;

public class Ram implements Action{

	@Override
	public void eat() {
		System.out.println("Ram :: eat method called");		
	}

	@Override
	public void sleep() {
		System.out.println("Ram :: sleep method called");		
	}

}
