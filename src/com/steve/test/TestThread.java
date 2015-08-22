package com.steve.test;

public class TestThread {

	boolean gaming = true;
	private class Robit implements Runnable{
		int distance = 0; //����
		int count = 0; //����
		@Override
		public void run() {
			while(gaming){
				System.out.println("��������:"+distance);
				count++; //һ��һ��
				distance+=100; //һ��100����
				if(count%100==0)
				{
					//100������Ϣһ����
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(distance >= 50000)
				{
					System.out.println("����ʤ��");
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
				System.out.println("�ڹ�����:"+distance);
				count++;
				distance++;
				if(distance >= 50000)
				{
					System.out.println("�ڹ�ʤ��");
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
