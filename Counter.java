package com.multithreading;

public class Counter implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage store = new Storage();
        Counter c1 = new Counter(store);
        Printer p1 = new Printer(store);
  }
  Storage st;
  public Counter(Storage store){
        st = store;
        new Thread(this, "Counter").start();
         
  }
  @Override
  public void run() {
        for(int i = 0 ; i < 10; i++){
              st.setValue(i);
        }

	}

}
