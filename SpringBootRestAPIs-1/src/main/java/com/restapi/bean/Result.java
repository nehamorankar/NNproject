package com.restapi.bean;

import java.util.List;

public class Result {
private String result;
private List<ResXY> xy;
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
public List<ResXY> getXy() {
	return xy;
}
public void setXy(List<ResXY> xy) {
	this.xy = xy;
}
@Override
public String toString() {
	return "Result [result=" + result + ", xy=" + xy + "]";
}



}
