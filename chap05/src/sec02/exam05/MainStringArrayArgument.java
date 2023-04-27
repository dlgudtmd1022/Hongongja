package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length !=2) {// 입력된 데이터 개수가 2개가 아닐경우
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);// 프로그램 강제종료
		}
		
		String strNum1=args[0];//첫번째 데이터 얻기
		String strNum2=args[1];//두번째 데이터 얻기
		
		int num1=Integer.parseInt(strNum1);//문자열을 정수로 변환
		int num2=Integer.parseInt(strNum2);//문자열을 정수로 변환
		
		int result = num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		
		//프로그램 실행시 매개값을 주소 실행하려면
		//상단의 [Run]-[Run Configuration]메뉴선택
		//[Run Configuration]대화상자의 [Main]탭에서 [Project]-[Main Class]확인
		//[Arguments]탭 클릭 [Program arguments] 입력란에 10(띄어쓰기)20입력후 하단[Apply]클릭
		//[Run]아이콘 클릭하면 콘솔에 실행된다.
	}

}
