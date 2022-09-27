package by.epam.hw11.hierarchy.bean;

import java.util.Objects;

public abstract class ElectronicComputingDevice {

	public String brand;
	public String operatingSystem;
	public double displayInches;
	public double batteryCapacity;

	public abstract void printSpecs();

	public ElectronicComputingDevice() {
		super();
	}

	public ElectronicComputingDevice(String brand, String operatingSystem, double displayInches,
			double batteryCapacity) {
		super();
		this.brand = brand;
		this.operatingSystem = operatingSystem;
		this.displayInches = displayInches;
		this.batteryCapacity = batteryCapacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(double displayInches) {
		this.displayInches = displayInches;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(batteryCapacity, brand, displayInches, operatingSystem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicComputingDevice other = (ElectronicComputingDevice) obj;
		return Double.doubleToLongBits(batteryCapacity) == Double.doubleToLongBits(other.batteryCapacity)
				&& Objects.equals(brand, other.brand)
				&& Double.doubleToLongBits(displayInches) == Double.doubleToLongBits(other.displayInches)
				&& Objects.equals(operatingSystem, other.operatingSystem);
	}

	
	
	
}
