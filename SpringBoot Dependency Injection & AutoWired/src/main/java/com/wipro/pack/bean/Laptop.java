package com.wipro.pack.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Laptop {
	private String manufacturer;
	private String processor;
	private String operatingSystem;
	private String productNumber;
	@Autowired
	private HardDisk h;
	@Autowired
	private Battery b;
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public HardDisk getH() {
		return h;
	}
	public void setH(HardDisk h) {
		this.h = h;
	}
	public Battery getB() {
		return b;
	}
	public void setB(Battery b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Laptop [manufacturer=" + manufacturer + ", processor=" + processor + ", operatingSystem="
				+ operatingSystem + ", productNumber=" + productNumber + ", h=" + h + ", b=" + b + "]";
	}
}
