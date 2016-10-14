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
		System.out.println("���������⳵������(<"+cars.size()+"):");
		int count = in.nextInt();
		hireCar(count);
		
	}
}
private static void init(){
	Car car0 = new peopleCar(4, 500,"����");
	cars.add(car0);
	Car car1 = new peopleCar(2, 2000,"����");
	cars.add(car1);
	Car car2 = new peopleCar(4, 200,"��־");
	cars.add(car2);
	Car car3 = new Truck(20, 1000, "��ά��");
	cars.add(car3);
	Car car4 = new peoTruck(2, 5, 700, "Ƥ��");
	cars.add(car4);
}

private static void printCars(){
	for (int i = 0; i < cars.size(); i++) {
		Car car = cars.get(i);
		switch (car.type) {
		case peopleCar.PEO_CAR:
			peopleCar peopleCar = (peopleCar)car;
			System.out.println(i+",  "+car.getName()+"  "+car.getPrice()+
					"Ԫ/��   ���ˣ�"+peopleCar.getPeopleCount()+"��");
			break;
			case Truck.TRUCK:
				Truck truck = (Truck)car;
				System.out.println(i+",  "+car.getName()+"  "+car.getPrice()+
						"Ԫ/��   �ػ���"+truck.getWeight()+"��");
				break;
				default:
					peoTruck peoTruck = (peoTruck)car;
					System.out.println(i+",  "+car.getName()+"  "+car.getPrice()+
							"Ԫ/��   ���ˣ�"+peoTruck.getPeopleCount()+"�ػ�:"+peoTruck.getWeight()+"��");
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
		System.out.println("�������"+i+"���������");
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
	System.out.println("�������⳵����:");
	int day = cin.nextInt();
	System.out.println("�����˵�:"+day*price_Sum+"");
	System.out.println("������:"+people_Sum+"��");
	System.out.println("���ػ�:"+weight_Sum+".0��");
}

}
