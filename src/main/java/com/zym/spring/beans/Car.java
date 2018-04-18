package com.zym.spring.beans;

public class Car {

	private String pinpai;
	private String chandi;
	private Double jiage;
	private int maxpreed;

	public String getPinpai() {
		return pinpai;
	}

	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}

	public String getChandi() {
		return chandi;
	}

	public void setChandi(String chandi) {
		this.chandi = chandi;
	}

	public Double getJiage() {
		return jiage;
	}

	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}

	public int getMaxpreed() {
		return maxpreed;
	}

	public void setMaxpreed(int maxpreed) {
		this.maxpreed = maxpreed;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String pinpai, String chandi, int maxpreed) {
		super();
		this.pinpai = pinpai;
		this.chandi = chandi;
		this.maxpreed = maxpreed;
	}

	public Car(String pinpai, String chandi, Double jiage) {
		super();
		this.pinpai = pinpai;
		this.chandi = chandi;
		this.jiage = jiage;
	}

	@Override
	public String toString() {
		return "Car [pinpai=" + pinpai + ", chandi=" + chandi + ", jiage=" + jiage + ", maxpreed=" + maxpreed + "]";
	}
}
