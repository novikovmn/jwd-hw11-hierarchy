package by.epam.hw11.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends KitchenDevice implements Serializable {

	private static final long serialVersionUID = 5568094326947760847L;

	private double width;
	private double heigth;
	private double maxTemperature;

	public Oven() {
		super();
	}

	public Oven(String brand, double capacity, double width, double heigth, double maxTemperature) {
		super(brand, capacity);
		this.width = width;
		this.heigth = heigth;
		this.maxTemperature = maxTemperature;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	@Override
	public void printSpecs() {
		System.out.println(toString());
	}

	@Override
	public int hashCode() {
		return Objects.hash(heigth, maxTemperature, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oven other = (Oven) obj;
		return Double.doubleToLongBits(heigth) == Double.doubleToLongBits(other.heigth)
				&& Double.doubleToLongBits(maxTemperature) == Double.doubleToLongBits(other.maxTemperature)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return "Oven [brand=" + brand + ", capacity=" + capacity + ", width=" + width + ", heigth=" + heigth + ", maxTemperature=" + maxTemperature + "]";
	}

}
