package test_Packages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import math.QuadraticEquation2;


public class DeltaLargerThanZero {


  @Parameters({"a", "b", "c"})
  @Test(priority = 1)
  public void checkDelta(double a, double b, double c) {
	  System.out.println("input a:" + a );
	  System.out.println("input b:" + b );
	  System.out.println("input c:" + c );
	  QuadraticEquation2 delta = new QuadraticEquation2();
	  assertEquals(delta.findDelta(a, b, c), 9);	  
  }
  
  @Parameters({"a", "b", "c"})
  @Test(priority = 2)
  public void delta_larger_than_0(double a, double b, double c) {
	  QuadraticEquation2 value = new QuadraticEquation2();
	  double delta = value.findDelta(a, b, c);
	  ArrayList<Double> list = value.quadraticEquation2(delta, a, b);
	  assertEquals(list.get(0).floatValue(), 1);
	  assertEquals(list.get(1).floatValue(), -2);
  }
}
