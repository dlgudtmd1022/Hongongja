package sec02.exam05;

public class ForMultiplicationTableExam {

	public static void main(String[] args) {
		// 구구단 2~9단 출력해보는 코드
		for(int m=2; m<=9; m++) {//바깥 for문
			System.out.println("*** "+m+"단 ***");
			for(int n=1; n<=9; n++) {// 중첩for문
				System.out.println(m+"x"+n+"="+(m*n));
			}
		}

	}

}
