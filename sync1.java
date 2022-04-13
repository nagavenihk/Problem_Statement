package com.synchronization;
class storage {
	int value=0;
	boolean available=false;
	
	synchronized void count(int num)
	{
		if(available==true)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		available=true;
		value=num;
		System.out.println("Counter incremeted to:"+value);
		notifyAll();
	}
	
	synchronized int print()
	{
		if(available==false)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		available=false;
		System.out.println("Printer:"+value);
		notifyAll();
		return value;
	}

}

 class counter extends Thread{
	storage s;
	counter(storage s)
	{
		this.s=s;
		this.start();
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++) {
			s.print();
			
		}
	}

}
  class printer extends Thread {
		storage s;
		printer(storage s){
			this.s=s;
			this.start();
			
		}
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				s.print();
			}
		}
	}


public class sync1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		storage s=new storage();
		new counter(s);
		new printer(s);

	}

}
