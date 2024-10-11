package com.bptn.course._21_SolidPrinciples.DependencyInversionPrinciple;

//High-Level modules should not depend on low level modules. Both should depend on abstractions.
//Abstractions should not depend on detail. Details should depend on abstractions.

//public class Switch {
//	private LightBulb lightBulb;
//
//	public Switch(LightBulb lightBulb) {
//		this.lightBulb = lightBulb;
//	}
//
//	public void operate() {
//		lightBulb.turnOn();
//	}
//
//	public static void main(String[] args) {
//		LightBulb lightBulb = new LightBulb();
//		Switch lightSwitch = new Switch(lightBulb);
//		lightSwitch.operate();
//	}
//
//}

public class Switch {
	private Switchable device;

	public Switch(Switchable device) {
		this.device = device;
	}

	public void operate() {
		device.turnOn();
	}
}

// The switch directly depends on the LightBulb class, violating DIP
// If we need to modify the LightBulb class, we must make same changes to the
// Switch class.

//The Switch class now depends on Switchable interface instead of the LightBulb class
//there by adhering to the DIP. H-L and L-L modules both depend on abstraction.