package by.epam.hw11.hierarchy.bean;

import java.util.Objects;

public abstract class KitchenDevice {

	public String brand;

	public double capacity;

	public abstract void printSpecs();

	public KitchenDevice() {
	}

	public KitchenDevice(String brand, double capacity) {
		this.brand = brand;
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, capacity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KitchenDevice other = (KitchenDevice) obj;
		return Objects.equals(brand, other.brand)
				&& Double.doubleToLongBits(capacity) == Double.doubleToLongBits(other.capacity);
	}

	
}
