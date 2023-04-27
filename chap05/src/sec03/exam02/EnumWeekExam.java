package sec03.exam02;

import java.util.Calendar;//Calendar 클래스는 java.util.패키지에 있으므로 import가 필요

import sec03.exam01.Week;

public class EnumWeekExam {

	public static void main(String[] args) {
		// 열거 타입과 열거 상수
		Week today=null;//열거타입 변수 선언
		
		Calendar cal=Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK);//일(1)~토(7)까지의 숫자를 리턴
		
		switch(week) {
		case 1:
			today=Week.SUNDAY; 
			break;
		case 2:
			today=Week.MONDAY; 
			break;
		case 3:
			today=Week.TUESDAY; 
			break;
		case 4:
			today=Week.WEDNESDAY; 
			break;
		case 5:
			today=Week.THURSDAY; 
			break;
		case 6:
			today=Week.FRIDAY; 
			break;
		case 7:
			today=Week.SATURDAY; 
			break;
		}
		
		System.out.println("오늘 요일: "+today);
		
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부합니다.");
		}
		//Calendar를 사용하기 위해서는 3라인의 import문이 필요하다.
		//import문은 6장에서 설명합니다. 9라인에서 Calendar를 얻고,
		//10라인에서 요일별 숫자를 얻습니다. 12~27라인의 switch문을
		//이용해서 열거 타입 변수 today에 열거 상수를 대입한다.
		//31~35라인의 if문을 이용해서 일요일인지 확인하고 출력할 내용을 결정한다.
	}

}
