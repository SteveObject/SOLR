package com.steve.test;

public class TestThread {

	boolean gaming = true;
	private class Robit implements Runnable{
		int distance = 0; //距离
		int count = 0; //步数
		@Override
		public void run() {
			while(gaming){
				System.out.println("兔子跑了:"+distance);
				count++; //一次一步
				distance+=100; //一步100厘米
				if(count%100==0)
				{
					//100厘米休息一毫秒
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(distance >= 50000)
				{
					System.out.println("兔子胜出");
					gaming = false;
				}
			}
		}
	}
	
	private class Tortoise implements Runnable{
		int distance  = 0;
		int count = 0;
		@Override
		public void run() {
			while(gaming){
				System.out.println("乌龟跑了:"+distance);
				count++;
				distance++;
				if(distance >= 50000)
				{
					System.out.println("乌龟胜出");
					gaming = false;
				}
			}
		}
	}
	
	public void go()
	{
		Runnable r = new Robit();
		Thread rt = new Thread(r);
		Runnable t = new Tortoise();
		Thread tt = new Thread(t);
		
		rt.start();
		tt.start();
		/*while(gaming)
		{
			r.run();
			t.run();
		}*/
	}
	

	public static void main(String[] args) {
		TestThread tt = new TestThread();
		tt.go();
	}
	

}
