package com.mypackage;

import com.mypackage.quanlinhanvien.*;
import java.util.Scanner;
import java.util.TreeMap;

public class quanlinv {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeMap<String, nhanvien> tonghop = new TreeMap<>();
    tonghop.put("MK1", new fulltime("MK1", "Le Huyen Phuong Uyen", "2006", "quanli", 10000000, 5));
    tonghop.put("MK2", new fulltime("MK2", "Nguyen Minh Duc", "2006", "chu quay", 20000000, 5));
    tonghop.put("MK3", new parttime("MK3", "Vu Minh Duc", "2006", "chu thau", 10));
    tonghop.put("MK4", new intern("MK4", "Dang Duc Anh", "2006", "staff"));

    int c;
    do {
      System.out.println(
          "Phan Mem Quan li \n"
              + " options: 1.in tat ca thong tin nhan vien\n"
              + "2. lay thong tin qua ma nv\n"
              + "3. lay so luong can tra va nhan vien co luong cao nhat\n"
              + "make your solutions:");
      if ((c = sc.nextInt()) == 1) {
        // in tat ca nhan vien:
        for (nhanvien e : tonghop.values()) System.out.println(e);
        System.out.println("----------------------------------------------");
      } else if (c == 2) {
        // thong tin 1 nv
        sc.nextLine();
        String manv = sc.nextLine();
        System.out.println(tonghop.get(manv));

        System.out.println("----------------------------------------------");
      } else {
        // tong quy luong va mvp
        long tongluong = 0;
        long mvp = 0;
        nhanvien mvp3 = null;
        for (nhanvien e : tonghop.values()) {
          long luong = e.getLuong();
          tongluong += luong;
          if (mvp < luong) {
            mvp = luong;
            mvp3 = e;
          }
        }
        System.out.printf("tong luong can tra la: %d \n", tongluong);
        System.out.println("nhan vien giau nhat la: " + mvp3);
        System.out.println("----------------------------------------------");
      }
    } while (c != 0);
    sc.close();
  }
}
