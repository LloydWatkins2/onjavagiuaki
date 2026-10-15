package com.mypackage.quanlinhanvien;

/** fulltime */
public class fulltime extends nhanvien {

  long luongcb, hsl;

  public fulltime(String manv, String ten, String ns, String pb, long luongcb, long hsl) {
    super(manv, ten, ns, pb);
    this.luongcb = luongcb;
    this.hsl = hsl;
    earn();
  }

  @Override
  public void earn() {
    this.luong = (this.luongcb * this.hsl + 1000000);
  }

  @Override
  public String toString() {
    return "nhan vien fulltime: " + super.toString();
  }
}
