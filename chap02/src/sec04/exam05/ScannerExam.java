package sec04.exam05;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData=scan.nextLine();
			System.out.println("입력된 문자열: \""+inputData+"\"");
			if(inputData.equals("p")) {
				break;
			}
		}
		System.out.println("종료");
	}

}
