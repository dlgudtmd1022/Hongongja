package chapter02;

public class for문으로배열복사 {

	public static void main(String[] args) {
		int[] oIA = {1, 2, 3};
		int[] nIA = new int[5];
		
		for(int i = 0; i<oIA.length; i++) {
			nIA[i] = oIA[i];
		}
		
		for(int i = 0; i < nIA.length; i++) {
			System.out.print(nIA[i] + ", ");
		}
	}
}
