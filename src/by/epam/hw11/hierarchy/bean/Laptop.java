package by.epam.hw11.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends ElectronicComputingDevice implements Serializable {

	private static final long serialVersionUID = -1922906779413127146L;

	private boolean cardReader;
	private boolean CDRom;
	private String coolingType;

	public Laptop() {
		super();
	}

	public Laptop(String brand, String operatingSystem, double displayInches, double batteryCapacity,
			boolean cardReader, boolean cDRom, String coolingType) {
		super(brand, operatingSystem, displayInches, batteryCapacity);
		this.cardReader = cardReader;
		CDRom = cDRom;
		this.coolingType = coolingType;
	}

	public boolean isCardReader() {
		return cardReader;
	}

	public void setCardReader(boolean cardReader) {
		this.cardReader = cardReader;
	}

	public boolean isCDRom() {
		return CDRom;
	}

	public void setCDRom(boolean cDRom) {
		CDRom = cDRom;
	}

	public String getCoolingType() {
		return coolingType;
	}

	public void setCoolingType(String coolingType) {
		this.coolingType = coolingType;
	}

	@Override
	public void printSpecs() {
		System.out.println(toString());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(CDRom, cardReader, coolingType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return CDRom == other.CDRom && cardReader == other.cardReader && Objects.equals(coolingType, other.coolingType);
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", operatingSystem=" + operatingSystem + ", displayInches=" + displayInches
				+ ", batteryCapacity=" + batteryCapacity + ", cardReader=" + cardReader + ", CDRom=" + CDRom
				+ ", coolingType=" + coolingType + "]";
	}

}
