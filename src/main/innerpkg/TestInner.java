package main.innerpkg;

import mylib.TimeUtils;

public class TestInner {

  public void test() {
    System.out.println("in TestInner");
    new TimeUtils().getTime();
  }

}
