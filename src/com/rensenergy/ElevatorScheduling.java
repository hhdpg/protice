package com.rensenergy;

import java.util.ArrayList;
import java.util.List;

public class ElevatorScheduling {
	public void elevatorScheduling(int needfloor,String gowhere,int nowFloor,int number){
		Elevator ele1 = new Elevator(1,0,"停",1);
		Elevator ele2 = new Elevator(1,0,"停",2);
		Elevator ele3 = new Elevator(1,0,"停",3);
		Elevator ele4 = new Elevator(1,0,"停",4);
		List<String> statusList = new ArrayList<String>();
		statusList.add(ele1.getStatus());
		statusList.add(ele2.getStatus());
		statusList.add(ele3.getStatus());
		statusList.add(ele4.getStatus());
		if (ele1.getSerial() == number){//判读乘客输入的电梯号是否是1号电梯
			for (String currentStatus : statusList){
				if (currentStatus != "停"){//判断除一号电梯外的电梯的运行状态
					ele1.setToFloor(needfloor);//设置一号电梯要去的楼层
				}
			}
		}
	}
	
	public static void main(String args[]){
		
	}
}
