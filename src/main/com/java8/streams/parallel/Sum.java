package com.java8.streams.parallel;

import java.util.concurrent.atomic.AtomicInteger;

public class Sum {

	private  AtomicInteger sum = new AtomicInteger(0);

	public int getSum() {
		return sum.get();
	}

	public  void performSum(int num) {
		//int result = this.sum.addAndGet(num);
		//synchronized(this) {
			//int result = this.sum.addAndGet(num);
			this.sum.getAndSet( this.sum.addAndGet(num));
		//}
	}


}
