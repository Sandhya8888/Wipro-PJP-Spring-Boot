package com.wipro.pack.bean;

import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	private int size;
	private String type;
	private String serialNumber;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "HardDisk [size=" + size + ", type=" + type + ", serialNumber=" + serialNumber + "]";
	} 
}
