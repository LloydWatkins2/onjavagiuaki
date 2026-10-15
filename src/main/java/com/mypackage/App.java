package com.mypackage;

import com.mypackage.demau.*;
import java.util.ArrayList;
import java.util.HashMap;

public class App {
  public static void main(String[] args) {
    ArrayList<Sach> kho = new ArrayList<>();
    Sach s1 = new SGK("dime m", "efe", 2023, 10);
    kho.add(s1);

    for (Sach e : kho) {
      System.out.println(e);
    }

    HashMap<Sach, Integer> ds = new HashMap<>();
    ds.put(new Novel("fefe", "feef", 2003, 12), 2);
    double tongphi = 0;
    for (Sach e : ds.keySet()) {
      tongphi += e.lateFee(ds.get(e));
    }
  }
}
