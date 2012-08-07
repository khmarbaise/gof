package com.soebes.patterns.state;

public class Client {
  private Context context;

  public Client(Context context) {
    this.context = context;
  }

  public void changeState() {
    context.operate();
  }
}
