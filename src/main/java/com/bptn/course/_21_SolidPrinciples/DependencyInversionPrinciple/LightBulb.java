package com.bptn.course._21_SolidPrinciples.DependencyInversionPrinciple;

//public class LightBulb {
//	public void turnOn() {
//		System.out.println("LightBulb on");
//	}
//
//	public void turnOff() {
//		System.out.println("LightBulb off");
//	}
//}

public class LightBulb implements Switchable {
	public void turnOn() {
		System.out.println("LightBulb on");
	}

	public void turnOff() {
		System.out.println("LightBulb off");
	}
}
