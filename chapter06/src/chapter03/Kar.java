package chapter03;

public class Kar {

	//필드
	String company = "포르쉐";
	String model;
	String color;
	int maxSpeed;
	
	Kar(){
	}
	
	Kar(String model){
		this(model, "노랑", 350);
	}
	
	Kar(String model, String color){
		this(model, color , 350);
	}
	
	Kar(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;		
	}	

}

