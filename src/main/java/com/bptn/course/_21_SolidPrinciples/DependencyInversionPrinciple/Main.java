package com.bptn.course._21_SolidPrinciples.DependencyInversionPrinciple;

public class Main {

	public static void main(String[] args) {
		Switchable lightBulb = new LightBulb();
		Switch lightSwitch = new Switch(lightBulb);
		lightSwitch.operate();
	}

}
