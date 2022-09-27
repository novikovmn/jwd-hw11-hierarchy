package by.epam.hw11.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class ElectricKettle extends KitchenDevice implements Serializable {

	private static final long serialVersionUID = -59588772201782176L;

	private double boilTime;
	private double weight;
	private String housingMaterial;

	public ElectricKettle() {
		super();
	}

	public ElectricKettle(String brand, double capacity, double boilTime, double weight, String housingMaterial) {
		super(brand, capacity);
		this.boilTime = boilTime;
		this.weight = weight;
		this.housingMaterial = housingMaterial;
	}

	public double getBoilTime() {
		return boilTime;
	}

	public void setBoilTime(double boilTime) {
		this.boilTime = boilTime;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHousingMaterial() {
		return housingMaterial;
	}

	public void setHousingMaterial(String housingMaterial) {
		this.housingMaterial = housingMaterial;
	}

	@Override
	public void printSpecs() {
		System.out.println(toString());

	}

	@Override
	public int hashCode() {
		return Objects.hash(boilTime, housingMaterial, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectricKettle other = (ElectricKettle) obj;
		return Double.doubleToLongBits(boilTime) == Double.doubleToLongBits(other.boilTime)
				&& Objects.equals(housingMaterial, other.housingMaterial)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "ElectricKettle [brand=" + brand + ", capacity=" + capacity +", boilTime=" + boilTime + ", weight=" + weight + ", housingMaterial=" + housingMaterial
				+ "]";
	}

}
