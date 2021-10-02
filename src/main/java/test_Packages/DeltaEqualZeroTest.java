package test_Packages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import math.QuadraticEquation2;

public class DeltaEqualZeroTest {

	@DataProvider
	public Object[][] dataSet() {
//		Object[][] dataset = new Object[2][3];

//		// first row
//		dataset[0][0] = 1;
//		dataset[0][1] = 0;
//		dataset[0][2] = 1;
//
//		// second row
//		dataset[1][0] = 5;
//		dataset[1][1] = 3;
//		dataset[1][2] = 0;

		return new Object[][] { { 1, 2, 1 }, { 2, 4, 2 } };
	}

	@Test(dataProvider = "dataSet")
	public void checkDelta(double a, double b, double c) {	
		QuadraticEquation2 delta = new QuadraticEquation2();
		double[][] found = new double[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (j == 0) {
					found[i][j] = a;
				} else if (j == 1) {
					found[i][j] = b;
				} else if (j == 2) {
					found[i][j] = c;
				}
			}
		}

		double value1 = delta.findDelta(found[0][0], found[0][1], found[0][2]);
		double value2 = delta.findDelta(found[1][0], found[1][1], found[1][2]);

		assertEquals(0, value1);
		assertEquals(0, value2);

	}
	@Test(dataProvider = "dataSet")
	public void delta_equal_0(double a, double b, double c) {
		QuadraticEquation2 qe2 = new QuadraticEquation2();
		double[][] found = new double[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (j == 0) {
					found[i][j] = a;
				} else if (j == 1) {
					found[i][j] = b;
				} else if (j == 2) {
					found[i][j] = c;
				}
			}
		}

		double value = qe2.findDelta(found[0][0], found[0][1], found[0][2]);
		  ArrayList<Double> list = qe2.quadraticEquation2(value, a, b);
		  assertNotEquals(list, 10);
	
	  }
}
