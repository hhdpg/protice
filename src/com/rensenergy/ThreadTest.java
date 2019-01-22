package com.rensenergy;

public class ThreadTest {
	static int r = 0;

	public static void main(String[] args) throws InterruptedException {
		/*
		 * // TODO Auto-generated method stub try { Runnable run = () ->
		 * System.out.println("Thread test" ); Thread t = new Thread(run);
		 * t.start(); } catch (Exception e) { e.printStackTrace(); }
		 */
		/*
		 * Thread t1= new Thread(()->{ System.out.println("t1运行开始"); try {
		 * Thread.sleep(500); } catch (InterruptedException e) {
		 * e.printStackTrace(); } System.out.println("t1运行结束"); r = 100; });
		 * t1.start(); t1.join(); System.out.println(r);
		 */
		Object obj = new Object();
		Thread t = new Thread(() -> {
			long starttime = System.currentTimeMillis();
			for (int i = 0; i <= 500; i++) {
				synchronized (obj) {
					r++;
					System.out.print("t[" + r + "]" + "  ");
					if ((i % 10) == 0) {
						System.out.println();
					}
				}
			}
			long endtime = System.currentTimeMillis();
			System.out.println("t线程总耗时" + (endtime - starttime));
		});
		Thread h = new Thread(() -> {
			long starttime = System.currentTimeMillis();
			for (int i = 0; i <= 500; i++) {
				synchronized (obj) {
					r--;
					System.out.print("h[" + r + "]" + "  ");
					if ((i % 10) == 0) {
						System.out.println();
					}
				}
			}
			long endtime = System.currentTimeMillis();
			System.out.println("h线程总耗时" + (endtime - starttime));
		});
		t.start();
		h.start();
		t.join();
		h.join();
		System.out.println(r);
	}
}