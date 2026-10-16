package com.mypackage.phuongtien;

/** xe */
public abstract class xe {
  String mavs, bs, mx;
  long sohr;

  public xe(String mavs, String bs, String mx, long sohr) {
    this.mavs = mavs;
    this.bs = bs;
    this.mx = mx;
    this.sohr = sohr;
  }

  public abstract long fee();

  @Override
  public String toString() {
    return this.mavs + " " + this.bs + " " + this.mx + " " + Long.toString(fee());
  }
}
