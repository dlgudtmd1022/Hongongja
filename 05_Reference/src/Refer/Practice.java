package Refer;

import java.util.Calendar;

public class Practice {

	public static void main(String[] args) {
		// 예제1
		String strVar1 = "장연식";
		String strVar2 = "장연식";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2의 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2의 참조가 다름");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2의 문자열이 같음");
		}
		
		String strVar3 = new String("신동준");
		String strVar4 = new String("신동준");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4의 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4의 참조가 다름");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4의 문자열이 같음");
		}
		System.out.println();
		
		// 예제2
		int[]scores = {83, 90, 87};
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		double avg = (double) sum / 3;
		System.out.println(avg);
	
		System.out.println();
	
		// 예제3
		int[] scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i = 0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);
	
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println(sum2);
		
		public static int add(int[]scores) {
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
		System.out.println();
		
		// 예제4
		int[]arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println(i + arr1[i]);	
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println(i + arr1[i]);
		}
		double[]arr2 = new double[3];
		for(int i = 0; i<3; i++) {
			System.out.println(i + arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println(i + arr2[i]);
		}
		
		String[]arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println(i + arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println(i + arr3[i]);
		}
		System.out.println();
		
		// 예제5
		int[]scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		double avg = (double) sum / scores.length;
		System.out.println(avg);

		System.out.println();
		
		// 예제6
		if(args.length != 2) {
			System.out.println("값의 수가 부족");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + num2 + result);
		
		System.out.println();
		
		// 예제7
		int[][]mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println(i + mathScores[i][k]);
				
			}
		}
		System.out.println();
		
		int[][]englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println(i + k + englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][]javaScores = {{95, 80}, {92, 96, 80}};
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println(i + k + javaScores[i][k]);
			}
		}
		System.out.println();		
		
		// 예제7
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		
		System.out.println();		
		
		// 예제8
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i = 0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i]);
		}
		
		System.out.println();
		
		// 예제9
		String[]oldStrArray = {"java", "array", "copy"};
		String[]newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);;
		
		for(int i=0; i<newStrArray.length;i++) {
			System.out.println(newStrArray[i]);
		}
		
		System.out.println();
		
		// 예제10
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		
		double avg = (double) sum / scores.length;
		System.out.println(avg);
		
		System.out.println();
		
		// 예제11
		public enum Week{
			Monday,
			Tuesday,
			Wednesday,
			Thursday,
			Friday,
			Saturday,
			Sunday
		}
		
		System.out.println();
		
		// 예제12
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.Sunday; break;
		case 2:
			today = Week.Monday; break;
		case 3:
			today = Week.Tuesday; break;
		case 4:
			today = Week.Wednesday; break;
		case 5:
			today = Week.Thursday; break;
		case 6:
			today = Week.Friday; break;
		case 7:
			today = Week.Saturday; break;
		}
		System.out.println(today);
		
		if(today == Week.Sunday) {
			System.out.println("일요일은 축구");
		}else {
			System.out.println("자바 열공");
		}
		
				
		
	}
}

