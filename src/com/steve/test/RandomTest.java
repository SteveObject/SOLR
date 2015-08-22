package com.steve.test;

import com.steve.utils.RandomDistance;

public class RandomTest {

	public static void main(String[] args) {
		float total = 50;
		float distance = 0;
		int nums = 0;
		float t = 0;
		int t1 = 0;
		/*while(total!=distance){
			t = RandomDistance.helpDistance(total, distance, nums);
			nums++;
			distance = Math.round((distance+t)*10)/10;
			System.out.println("第"+nums+"次\t"+t+"\t"+distance);
		}*/
		int total1 = (int)total*10;
		int distance1 = (int)distance*10;
		while(total1!=distance1){
			t1 = RandomDistance.helpDistance(total1, distance1, nums);
			nums++;
			t = t1 /10.0f;
			distance = distance1/10.0f+t;
			distance1 = distance1+t1;
			System.out.println("第"+nums+"次 \t"+t1+"\t"+distance1+"\t t:"+t+"\t distance:"+distance);
		}
	}
}
