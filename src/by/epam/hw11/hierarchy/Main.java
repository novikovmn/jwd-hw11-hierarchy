package by.epam.hw11.hierarchy;

import by.epam.hw11.hierarchy.bean.ElectricKettle;
import by.epam.hw11.hierarchy.bean.Laptop;
import by.epam.hw11.hierarchy.bean.Oven;
import by.epam.hw11.hierarchy.bean.TabletPc;

public class Main {

	public static void main(String[] args) {

		Oven oven = new Oven("Tefal", 32.0, 70.0, 90.0, 240.0);
		ElectricKettle kettle = new ElectricKettle("Bosh", 1.5, 2.5, 1.3, "iron");

		TabletPc tabletPc = new TabletPc("Xiaomi", "Android", 7.0, 4000.0, true, true, true);
		Laptop laptop = new Laptop("Honor", "Windows", 15.6, 5000.0, true, false, "passive");

		oven.printSpecs();
		kettle.printSpecs();

		tabletPc.printSpecs();
		laptop.printSpecs();

	}

}
