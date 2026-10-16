package com.mypackage.phuongtien;

/** oto */
public class oto extends xe {
  public oto(String mavs, String bs, String mx, long sohr) {
    super(mavs, bs, mx, sohr);
  }

  @Override
  public long fee() {
    return (this.sohr > 10) ? 200000 : 20000 * this.sohr;
  }
}
