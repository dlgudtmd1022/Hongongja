package chapter03;

public class Cha {

	//필드
	String company = "포드";
	String model;
	String color;
	int maxSpeed;

	Cha(){}
	
	Cha(String model){
		this.model = model;
	}
	
	Cha(String model,String color){
		this.model = model;
		this.color = color;
	}
	
	Cha(String model,String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}

