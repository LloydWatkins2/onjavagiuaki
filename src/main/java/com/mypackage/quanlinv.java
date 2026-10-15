package com.mypackage;

import com.mypackage.quanlinhanvien.*;
import java.util.TreeMap;

public class quanlinv {
  public static void main(String[] args) {
    TreeMap<String, nhanvien> tonghop = new TreeMap<>();
    tonghop.put("MK1", new fulltime("MK1", "Le Huyen Phuong Uyen", "2006", "quanli", 10000000, 5));
    tonghop.put("MK2", new fulltime("MK2", "Nguyen Minh Duc", "2006", "chu quay", 20000000, 5));
    tonghop.put("MK3", new parttime("MK3", "Vu Minh Duc", "2006", "chu thau", 10));
    tonghop.put("MK4", new intern("MK4", "Dang Duc Anh", "2006", "staff"));

    // in tat ca nhan vien:
    for (nhanvien e : tonghop.values()) System.out.println(e);

    // thong tin 1 nv
    String manv = "MK4";
    System.out.println(tonghop.get(manv));

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
  }
}
