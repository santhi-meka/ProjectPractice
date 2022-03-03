package com.test.learn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestNgDemo1 {
  @Test
  public void f1() {
	  System.out.println("Demo 1 - TestCode1");
  }
  @Test
  public void f2() {
	  System.out.println("Demo 1 - TestCode2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Demo 1 - beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Demo 1 - afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Demo 1 - beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Demo 1 - afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Demo 1 - beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Demo 1 - afterTest");
  }

}
