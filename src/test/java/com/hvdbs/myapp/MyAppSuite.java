package com.hvdbs.myapp;

import com.hvdbs.myapp.client.MyAppTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MyAppSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for MyApp");
    suite.addTestSuite(MyAppTest.class);
    return suite;
  }
}
