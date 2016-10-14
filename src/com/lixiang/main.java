package com.lixiang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
private static List<Car> cars =new ArrayList<Car>();
public static void main(String[] args) {
	init();
	
	Scanner in = new Scanner(System.in);
	int flag = in.nextInt();
	if(flag==1){
		printCars();
		System.out.println("请您输入租车的数量(<"+cars.size()+"):");
		int count = in.nextInt();
		hireCar(count);
		
	}
}
private static void init(){
	Car car0 = new peopleCar(4, 500,"本田");
	cars.add(car0);
	Car car1 = new peopleCar(2, 2000,"拉法");
	cars.add(car1);
	Car car2 = new peopleCar(4, 200,"标志");
	cars.add(car2);
	Car car3 = new Truck(20, 1000, "依维柯");
	cars.add(car3);
	Car car4 = new peoTruck(2, 5, 700, "皮卡");
	cars.add(car4);
}

private static void printCars(){
	for (int i = 0; i < cars.size(); i++) {
		Car car = cars.get(i);
		switch (car.type) {
		case peopleCar.PEO_CAR:
			peopleCar peopleCar = (peopleCar)car;
			System.out.println(i+",  "+car.getName()+"  "+car.getPrice()+
					"元/天   载人："+peopleCar.getPeopleCount()+"人");
			break;
			case Truck.TRUCK:
				Truck truck = (Truck)car;
				System.out.println(i+",  "+car.getName()+"  "+car.getPrice()+
						"元/天   载货："+truck.getWeight()+"吨");
				break;
				default:
					peoTruck peoTruck = (peoTruck)car;
					System.out.println(i+",  "+car.getName()+"  "+car.getPrice()+
							"元/天   载人："+peoTruck.getPeopleCount()+"载货:"+peoTruck.getWeight()+"吨");
			break;
		}
	}
	
}
private static void hireCar(int count) {
	Scanner cin = new Scanner(System.in);
	int price_Sum=0;
	int people_Sum=0;
	int weight_Sum = 0;
	for(int i = 0;i<count;i++)
	{
		System.out.println("请输入第"+i+"辆车的序号");
		int tmp = cin.nextInt();
		
		Car car = cars.get(tmp);
		switch (car.type) {
		case peopleCar.PEO_CAR:
			peopleCar peopleCar = (peopleCar)car;
			price_Sum+=peopleCar.getPrice();
			people_Sum+=peopleCar.getPeopleCount();
			peopleCar.setExist(false);
			break;
		case Truck.TRUCK:
			Truck truck = (Truck)car;
			price_Sum+=truck.getPrice();
			weight_Sum+=truck.getWeight();
			truck.setExist(false);
			break;
		default:
			peoTruck peoTruck = (peoTruck)car;
			price_Sum+=peoTruck.getPrice();
			people_Sum+=peoTruck.getPeopleCount();
			weight_Sum+=peoTruck.getWeight();
			peoTruck.setExist(false);
			break;
		}
		
	}
	System.out.println("请输入租车天数:");
	int day = cin.nextInt();
	System.out.println("您的账单:"+day*price_Sum+"");
	System.out.println("共载人:"+people_Sum+"人");
	System.out.println("共载货:"+weight_Sum+".0吨");
}

}
