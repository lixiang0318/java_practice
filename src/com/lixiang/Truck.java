package com.lixiang;

public class Truck extends Car {
public static final int TRUCK = 2;
private int weight;
//private int type = TRUCK;
public Truck(int weight,int price,String name) {
	// TODO Auto-generated constructor stub
	this.weight = weight;
	this.price = price;
	this.name = name;
	this.isExist = true;
	this.type = TRUCK;
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
