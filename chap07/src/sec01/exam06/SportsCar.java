package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		speed +=10;
	}
	
	/*
	 * @Override
	 * public void stop(){
	 * 		System.out.println("스포츠카 멈춤");
	 * 		speed=0;
	 * } 재정의 불가
	 */

}
