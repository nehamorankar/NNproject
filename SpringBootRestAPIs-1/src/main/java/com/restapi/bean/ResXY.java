package com.restapi.bean;

public class ResXY {
	private int x1;

	private int x2;
	private int c;

	private int r;
	private String in;

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

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	
	public String getIn() {
		return in;
	}

	public void setIn(String in) {
		this.in = in;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "ResXY [x1=" + x1 + ", x2=" + x2 + ", c=" + c + ", r=" + r + ", In=" + in + ", y=" + y + "]";
	}
	
	
}
