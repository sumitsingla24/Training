package com.javatraining;

public class Lecture13_InterfaceUse {

	public static void main(String[] args) {
		Lecture13_Interface intObj = new Lecture13_InterfaceImplement();
		Lecture13_InterfaceImplement.clearDraw();
		intObj.Draw();
		System.out.println("Interface variable value = " + Lecture13_Interface.myname);
	}

}
