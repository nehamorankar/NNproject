package com.restapi.bean;

public class XY {
	private int x1;

	private int x2;
	private String y;
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "XY [x1=" + x1 + ", x2=" + x2 + ", y=" + y + "]";
	}

	
	

}
