package com.mypackage.phuongtien;

/** xedap */
public class xedap extends xe {
  public xedap(String mavs, String bs, String mx, long sohr) {
    super(mavs, bs, mx, sohr);
  }

  @Override
  public long fee() {
    return 5000;
  }
}
