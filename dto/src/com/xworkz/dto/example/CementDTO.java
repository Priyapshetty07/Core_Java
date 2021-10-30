package com.xworkz.dto.example;

public class CementDTO {
	private String brand;
	private int price;
	private int kG;
	private boolean gypSum;
	private boolean isiMark;

	public CementDTO() {
		System.out.println("INVOKED CEMENT");
	}

	public CementDTO(String brand, int price, int kG, boolean gypSum, boolean isiMark) {
		super();
		this.brand = brand;
		this.price = price;
		this.kG = kG;
		this.gypSum = gypSum;
		this.isiMark = isiMark;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getkG() {
		return kG;
	}

	public void setkG(int kG) {
		this.kG = kG;
	}

	public boolean isGypSum() {
		return gypSum;
	}

	public void setGypSum(boolean gypSum) {
		this.gypSum = gypSum;
	}

	public boolean isIsiMark() {
		return isiMark;
	}

	public void setIsiMark(boolean isiMark) {
		this.isiMark = isiMark;
	}

}
