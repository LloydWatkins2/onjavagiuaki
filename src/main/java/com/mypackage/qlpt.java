package com.mypackage;

import com.mypackage.phuongtien.*;
import java.util.HashMap;
import java.util.Scanner;

/** qlpt */
public class qlpt {
  public static void main(String[] args) {
    // khoi tao 1 so xe
    xe[] kho = {
      new oto("X1", "21T1-22222", "K1", 20),
      new xemay("X2", "21T2-32322", "K2", 10),
      new xedap("X4", "", "K4", 100),
    };
    Scanner sc = new Scanner(System.in);
    int c;
    do {
      System.out.println(
          "Quan li xe:---------------------------\n"
              + "options:\n"
              + "1.show tat ca xe trong kho\n"
              + "2.tong doanh thu\n"
              + "3. doanh thu theo tuong loai xe:\n"
              + "make your options:\n");
      System.out.println("------------------------");
      if ((c = sc.nextInt()) == 1) {
        System.out.println("cac xe trong kho:");
        for (xe e : kho) {
          System.out.println(e);
        }
      } else if (c == 2) {
        System.out.println("tong doanh thu:");
        long tong = 0;
        for (xe e : kho) {
          tong += e.fee();
        }
        System.out.println("tong thu nhap" + tong);
      } else {
        HashMap<String, Long> hm = new HashMap<>();
        hm.put("xemay", (long) 0);
        hm.put("xedap", (long) 0);
        hm.put("oto", (long) 0);
        for (xe e : kho) {
          if (e instanceof oto) hm.put("oto", hm.get("oto") + e.fee());
          if (e instanceof xedap) hm.put("xedap", hm.get("xedap") + e.fee());
          if (e instanceof xemay) hm.put("xemay", hm.get("xemay") + e.fee());
        }
        for (String ten : hm.keySet()) {
          System.out.println(ten + " " + hm.get(ten));
        }
      }
    } while (c != 0);
    sc.close();
  }
}
