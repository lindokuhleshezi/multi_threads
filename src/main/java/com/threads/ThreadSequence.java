package com.threads;

public class ThreadSequence {

	 public static void main(String[] args) {
	  SeqRun sr = new SeqRun();
	  long start = System.currentTimeMillis();
	  
	  // Three threads
	  Thread t1 = new Thread(sr,"T1");
	  Thread t2 = new Thread(sr,"T2");
	  Thread t3 = new Thread(sr,"T3");
	  
	  try {
	   // First thread
	   t1.start();
	   t1.join();
	   // Second thread
	   t2.start();
	   t2.sleep(1000);
	   // uncoment below line to see sleep time for thread 2
	   // System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
	   t2.join();
	   // Third thread
	   t3.start();
	   t3.join();
	  } catch (InterruptedException e) {
	   		   e.printStackTrace();
	  }
	 }
	}
