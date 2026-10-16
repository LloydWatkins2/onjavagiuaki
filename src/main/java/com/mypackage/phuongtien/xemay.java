package com.mypackage.phuongtien;

/** xemay */
public class xemay extends xe {
  public xemay(String mavs, String bs, String mx, long sohr) {
    super(mavs, bs, mx, sohr);
  }

  @Override
  public long fee() {
    return 3000 * this.sohr;
  }
}
