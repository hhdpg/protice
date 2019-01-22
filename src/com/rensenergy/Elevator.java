package com.rensenergy;

public class Elevator {
	private int currentFloor;
	private int toFloor;
	private String status;
	private int serial;
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public Elevator(int i, int j, String string,int k) {
		// TODO Auto-generated constructor stub
	}
	public Elevator(){}
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public int getToFloor() {
		return toFloor;
	}
	public void setToFloor(int toFloor) {
		this.toFloor = toFloor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
