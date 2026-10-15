package com.mypackage.quanlinhanvien;

/** nhanvien */
public abstract class nhanvien implements Comparable<nhanvien> {
  protected String manv, ten, ns, pb;
  protected long luong;

  public nhanvien(String manv, String ten, String ns, String pb) {
    this.manv = manv;
    this.ten = ten;
    this.ns = ns;
    this.pb = pb;
  }

  public long getLuong() {
    return this.luong;
  }

  public abstract void earn();

  public int compareTo(nhanvien other) {
    if (this.luong < other.luong) return 1;
    if (this.luong > other.luong) return -1;
    return 0;
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s %d", this.manv, this.ten, this.ns, this.pb, this.luong);
  }
}
