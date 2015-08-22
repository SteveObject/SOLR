package com.steve.utils;

import java.util.Random;

public class RandomDistance {

	
	public static int helpDistance(int total,int distance,int nums){
		Random r = new Random();
		int needNums = needPeoples(total/10);
		int leftDistance= total - distance;
		int leftNums = needNums - nums;
		int base_top = leftDistance/leftNums;
		int offset = total/100;
		int helpDistance = 0;
		if(leftNums <= 1){
			return leftDistance;//最后一人把里程数集完
		}
		if(nums<needNums/3){
			
			offset = offset + base_top;
		}
		
		helpDistance = r.nextInt(base_top)+offset;
		
		return helpDistance;
	}
	
	public static float helpDistance(float total,float distance,int nums){
		float helpdistance = 0;
		Random r = new Random();
		int needNums = needPeoples(total);//总共需要的人数
		float leftDistance = total - distance;
		float leftNums = needNums - nums;
		float base_top = leftDistance/leftNums; //剩余人均里程数 
		float offset = total/300;
		if(leftNums <= 1){
			return leftDistance;//最后一人把里程数集完
		}
		if(leftDistance<leftNums*offset){//剩余里程数太小了
			if(needNums>30){
				return 0.1f;
			}else {
				return 0;
			}
		}
		if(nums<(needNums/3)){
			base_top = (total/2)/((needNums/3));
			offset = needNums/15;
		}
		
		helpdistance = (float)(r.nextFloat()*base_top+offset); //得到的数 可能会有小数点后好多位
		helpdistance = (float)(Math.round(helpdistance*10))/10; //保留一位小数
		return helpdistance ;
	}
	
	public static int needPeoples(float total){
		int result  = 30;
		if(total<=300 && total >= 50){
			result = 30;
		}else if(total<=600 && total>300 ){
			result = 60;
		}else if(total <=1000 && total > 600){
			result = 90;
		}
		return result;
	}
	
}
