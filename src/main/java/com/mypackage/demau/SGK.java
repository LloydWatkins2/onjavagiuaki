package com.mypackage.demau;

public class SGK extends Sach {
  public SGK(String ten, String tg, int namxb, int sl) {
    super(ten, tg, namxb, sl);
  }

  public double lateFee(int sn) {
    return 2000.0 * sn;
  }

  @Override
  public String toString() {
    return String.format("%s %s %d %d", this.ten, this.tg, this.namxb, this.sl);
  }
}
