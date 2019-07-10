package com.restapi.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.naming.spi.ResolveResult;

import com.restapi.bean.Data;
import com.restapi.bean.ResXY;
import com.restapi.bean.Result;
import com.restapi.bean.XY;

public class KNN {
	public static Result computeKNN(Data data) {
		
		int n, x1_qi, x2_qi;

		n =  data.getRecords();
		x1_qi = data.getX1();
		x2_qi = data.getX2();
		
		int k = data.getK();

		int x1[] = new int[n];
		int x2[] = new int[n];
		String clasi[] = new String[n];
		String In[] = new String[n];
		int d[] = new int[n];
		int c[] = new int[n];
		int r[] = new int[n];

		List<XY> list = data.getSecretLairs();

		
		if(list != null) {
			int i = 0;
			for(XY xy:list) {
				x1[i] = xy.getX1();
				x2[i] = xy.getX2();
				clasi[i] = xy.getY();
				i++;
			}
		}
		
		

		for (int i = 0; i < n; i++) {
			d[i] = ((x1[i] - x1_qi) * (x1[i] - x1_qi)) + ((x2[i] - x2_qi) * (x2[i] - x2_qi));
		}
		for (int i = 0; i < n; i++) {
			c[i] = d[i];
		}

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (d[j - 1] > d[j]) {
					int t = d[j - 1];
					d[j - 1] = d[j];
					d[j] = t;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (c[i] == d[j]) {
					r[i] = j + 1;
					continue;
				}
			}
		}

		int g = 0, b = 0;
		for (int i = 0; i < n; i++) {
			if (r[i] < (k + 1)) {
				In[i] = "yes";
				if (clasi[i].equals("good"))
					g++;
				else
					b++;
			} else
				In[i] = "no";
		}

		System.out.println("X1\tX2\tSquare Dist\tRank\tIncluded in KNN\tCategory");
		
		Result result= new Result();
		if (g > b) {
			result.setResult("Good");
			System.out.print("Prediction is that the new tissue belongs to Category : good");
		}
		else {
			result.setResult("Bad");

			System.out.print("Prediction is that the new tissue belongs to Category : bad");
		}
		
		List<ResXY> xy= new ArrayList<ResXY>();
		for (int i = 0; i < n; i++) {
			ResXY resXY=new ResXY();
			resXY.setX1(x1[i]);
			resXY.setX2(x2[i]);
			resXY.setC(c[i]);
			resXY.setR(r[i]);
			resXY.setIn(In[i]);
			resXY.setY(clasi[i]);
			xy.add(resXY);
			
			//System.out.println(x1[i] + "\t" + x2[i] + "\t\t" + c[i] + "\t" + r[i] + "\t" + In[i] + "\t\t" + y[i]);
		}
		
		result.setXy(xy);
		
		return result;
		
	}
}