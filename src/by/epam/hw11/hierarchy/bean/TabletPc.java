package by.epam.hw11.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class TabletPc extends ElectronicComputingDevice implements Serializable {

	private static final long serialVersionUID = 1582485771564312865L;

	private boolean fingerScanner;
	private boolean chipNFC;
	private boolean portIR;

	public TabletPc() {
		super();
	}

	public TabletPc(String brand, String operatingSystem, double displayInches, double batteryCapacity,
			boolean fingerScanner, boolean chipNFC, boolean portIR) {
		super(brand, operatingSystem, displayInches, batteryCapacity);
		this.fingerScanner = fingerScanner;
		this.chipNFC = chipNFC;
		this.portIR = portIR;
	}

	public boolean isFingerScanner() {
		return fingerScanner;
	}

	public void setFingerScanner(boolean fingerScanner) {
		this.fingerScanner = fingerScanner;
	}

	public boolean isChipNFC() {
		return chipNFC;
	}

	public void setChipNFC(boolean chipNFC) {
		this.chipNFC = chipNFC;
	}

	public boolean isPortIR() {
		return portIR;
	}

	public void setPortIR(boolean portIR) {
		this.portIR = portIR;
	}

	@Override
	public void printSpecs() {
		System.out.println(toString());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(chipNFC, fingerScanner, portIR);
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
		TabletPc other = (TabletPc) obj;
		return chipNFC == other.chipNFC && fingerScanner == other.fingerScanner && portIR == other.portIR;
	}

	@Override
	public String toString() {
		return "TabletPc [brand=" + brand + ", operatingSystem="+ operatingSystem + ", displayInches=" + displayInches + ", batteryCapacity=" + batteryCapacity +  ", fingerScanner=" + fingerScanner + ", chipNFC=" + chipNFC + ", portIR=" + portIR + "]";
	}

}
