package com.wipro.pack.bean;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	private String cellType;
	private int lastingHours;
	private int voltage;
	public String getCellType() {
		return cellType;
	}
	public void setCellType(String cellType) {
		this.cellType = cellType;
	}
	public int getLastingHours() {
		return lastingHours;
	}
	public void setLastingHours(int lastingHours) {
		this.lastingHours = lastingHours;
	}
	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	@Override
	public String toString() {
		return "Battery [cellType=" + cellType + ", lastingHours=" + lastingHours + ", voltage=" + voltage + "]";
	}

}
