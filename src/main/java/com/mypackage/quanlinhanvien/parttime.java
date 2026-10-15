package com.mypackage.quanlinhanvien;

/** parttime */
public class parttime extends nhanvien {
  int sohlam;

  public parttime(String manv, String ten, String ns, String pb, int sohlam) {
    super(manv, ten, ns, pb);
    this.sohlam = sohlam;
    earn();
  }

  @Override
  public void earn() {
    this.luong = 50000 * this.sohlam;
  }

  @Override
  public String toString() {
    return "nhan vien parttime: " + super.toString();
  }
}
