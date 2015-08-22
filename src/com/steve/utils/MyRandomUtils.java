package com.steve.utils;

import java.util.Random;

public class MyRandomUtils {
	
	public static float randDistance(float total,float distance,int nums){
		
		Random r = new Random();
		float result = 0.0f;
		int b = 0;
		int needPeoples = needPeoples(total);
		float leftDistance = total -distance;
		if(leftDistance<=0){
			return leftDistance;
		}
		
		if((needPeoples/3) > nums){//集里程人数小于30%
			b = randRange(40, 200);
			result =  b/10;
		}
		
		
		return result;
	}
	
	/**
	 * 判断需要多少人才能完成里程数
	 * @param total
	 * @return
	 */
	public static int needPeoples(float total){
		int peoples = 0;
		if(total < 50 || total > 1000){
			peoples = -1;//传入参数有误
		}
		if(total<=300){
			peoples =  30;
		}else if(total<=600){
			peoples =  60;
		}else if(total <=1000){
			peoples = 90;
		}
		return peoples;
	}
	
	
	/**
	 * 取一个范围内的随机数
	 * @param start
	 * @param end
	 * @return
	 */
	public static int randRange(int start,int end){
		Random r = new Random();
		int result = 0;
		if(end == start){
			result = start;
		}else if(end > start){
			result = r.nextInt(end-start)+start;
		}else{
			result = r.nextInt(start-end)+end;
		}
		
		return result;
	}
	
}
