package com.restapi.bean;

import java.util.List;

public class Data {
	private int records;
	private int x1;

	private int x2;
	private int k;

	private List<XY> secretLairs;

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}

	
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

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public List<XY> getSecretLairs() {
		return secretLairs;
	}

	public void setSecretLairs(List<XY> secretLairs) {
		this.secretLairs = secretLairs;
	}

	@Override
	public String toString() {
		return "Data [records=" + records + ", X1=" + x1 + ", X2=" + x2 + ", k=" + k + ", secretLairs=" + secretLairs
				+ "]";
	}
	
	

}
