package com.mypackage.demau;

public abstract class Sach {
  protected String ten, tg;
  protected int namxb, sl;

  public Sach(String ten, String tg, int namxb, int sl) {
    this.ten = ten;
    this.tg = tg;
    this.namxb = namxb;
    this.sl = sl;
  }

  public abstract double lateFee(int sn);

  @Override
  public String toString() {
    return String.format("%s %s %d %d", this.ten, this.tg, this.namxb, this.sl);
  }
}
