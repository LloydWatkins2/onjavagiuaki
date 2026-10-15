package com.mypackage.quanlinhanvien;

/** intern */
public class intern extends nhanvien {
  public intern(String manv, String ten, String ns, String pb) {
    super(manv, ten, ns, pb);
    earn();
  }

  @Override
  public void earn() {
    this.luong = 3000000;
  }

  @Override
  public String toString() {
    return "internshit: " + super.toString();
  }
}
