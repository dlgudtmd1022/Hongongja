package chapter03;

public class 자동타입변환 {

	public static void main(String[] args) {
		
		byte bV = 10;
		int iV = bV;
		System.out.println("iV: " + iV);
		
		char cV = '가';
		iV = cV;
		System.out.println("가의 유니코드 :" + iV);
		
		iV = 50;
		long lV = iV;
		System.out.println("lV :" + lV);
		
		lV = 100;
		float fV = lV;
		System.out.println("fV :" + fV);
		
		fV = 100.5F;
		double dV = fV;
		System.out.println("dV :" + dV);
		
		
	}
}
