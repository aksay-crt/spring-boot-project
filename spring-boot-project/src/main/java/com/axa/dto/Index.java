package com.axa.dto;

public class Index {

	private String name;
	private String lastPrice;
	private String change;
	private String pChange;
	private String imgFileName;

	public Index() {
		super();
	}

	public Index(String name, String lastPrice, String change, String pChange, String imgFileName) {
		super();
		this.name = name;
		this.lastPrice = lastPrice;
		this.change = change;
		this.pChange = pChange;
		this.imgFileName = imgFileName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(String lastPrice) {
		this.lastPrice = lastPrice;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public String getpChange() {
		return pChange;
	}

	public void setpChange(String pChange) {
		this.pChange = pChange;
	}

	public String getImgFileName() {
		return imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

}
