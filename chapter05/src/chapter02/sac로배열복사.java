package chapter02;

public class sac로배열복사 {

	public static void main(String[] args) {
		String[]oSA = {"java", "array", "copy"};
		String[] nSA = new String[5];
		
		System.arraycopy(oSA, 0, nSA, 0, oSA.length);
		
		for(int i = 0; i < nSA.length; i++) {
			System.out.print(nSA[i] + ", ");
		}
	}
}
