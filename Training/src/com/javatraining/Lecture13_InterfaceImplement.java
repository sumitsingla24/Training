package com.javatraining;

public class Lecture13_InterfaceImplement implements Lecture13_Interface{

	@Override
	public void Draw() {
		System.out.println("Drawing Circle here:" + myname);
		
	}
	
	public static void clearDraw(){
		System.out.println("Clear Draw");
	}

}
