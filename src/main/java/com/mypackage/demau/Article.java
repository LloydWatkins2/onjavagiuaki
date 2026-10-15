package com.mypackage.demau;

public class Article extends Sach {
  public Article(String t, String tg, int n, int sl) {
    super(t, tg, n, sl);
  }

  @Override
  public double lateFee(int n) {
    return 500.0 * n;
  }

  @Override
  public String toString() {
    return "[Tạp chí] " + super.toString();
  }
}
