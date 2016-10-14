package com.lixiang;

public class peoTruck extends Car {
public static final int PEO_TRUCK = 3;
private int peopleCount;
private int weight;
//private int type = PEO_TRUCK;
public peoTruck(int peoCount,int weight,int price,String name) {
	// TODO Auto-generated constructor stub
	this.peopleCount = peoCount;
	this.weight = weight;
	this.price = price;
	this.name = name;
	this.isExist = true;
	this.type = PEO_TRUCK;
}
public int getPeopleCount() {
	return peopleCount;
}
public void setPeopleCount(int peopleCount) {
	this.peopleCount = peopleCount;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public int getType() {
	return type;
}

}
 