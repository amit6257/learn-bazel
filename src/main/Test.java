package main;

import main.innerpkg.TestInner;
import mylib.TimeUtils;

public class Test {

  public static void main(String[] args) {
    System.out.println("Hello Bazel!!!");
    new TimeUtils().getTime();
    System.out.println("Bye-----");
    new TestInner().test();
  }

}
