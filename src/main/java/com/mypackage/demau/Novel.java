package com.mypackage.demau;

/** InnerNovel */
public class Novel extends Sach {

  public Novel(String ten, String tg, int namxb, int sl) {
    super(ten, tg, namxb, sl);
  }

  @Override
  public double lateFee(int sn) {
    return 1000.0 * sn;
  }

  @Override
  public String toString() {
    return "Novel :" + super.toString();
  }
}
