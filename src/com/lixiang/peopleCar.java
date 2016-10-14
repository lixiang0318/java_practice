package com.lixiang;

public class peopleCar extends Car {
public static final int PEO_CAR = 1;
private int peopleCount;
//private int type = PEO_CAR;
public peopleCar(int peoCount,int price,String name) {
	this.peopleCount = peoCount;
	this.price = price;
	this.name = name;
	this.isExist = true;
	this.type = PEO_CAR;
}
public int getPeopleCount() {
	return peopleCount;
}
public void setPeopleCount(int peopleCount) {
	this.peopleCount = peopleCount;
}
public int getType() {
	return type;
}

}
