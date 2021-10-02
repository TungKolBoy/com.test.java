package math;

import java.util.ArrayList;

public class QuadraticEquation2 {
	public static  double findDelta(double a, double b, double c) {
		double delta;
		delta = Math.pow(b,2) - 4*a*c;
		return delta;
	}
	
	public static ArrayList<Double> quadraticEquation2(double delta, double a, double b) {
		double x1, x2, sqrtDelta;
		ArrayList<Double> list = new ArrayList();
		sqrtDelta = Math.sqrt(delta);
		if (delta > 0) {
			x1 = (-b + sqrtDelta)/2*a;
			x2 = (-b - sqrtDelta)/2*a;
			System.out.println("This is a 2 solution equation: x1= " + x1 + " and x2=" + x2);
			list.add(x1);
			list.add(x2);
		} else if (delta == 0) {
			x1 = -b/2*a;
			System.out.println("this is the double solution equation: x1=x2= " + x1);
			list.add(x1);
		} else {
			System.out.println("This is the equation with no solution");
			list.add(null);
		}
		return list;
	}
	
}
