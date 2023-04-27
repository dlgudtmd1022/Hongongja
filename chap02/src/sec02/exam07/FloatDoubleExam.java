package sec02.exam07;

public class FloatDoubleExam {

	public static void main(String[] args) {
		//float타입: 4byte, 32bit /정밀도(소수점 이하 자리):7자리
		//double타입: 8byte, 64bit/정밀도(소수점 이하 자리):15자리
		//double타입은 float타입보다 2배 정도 정밀도가 높기 때문에 좀 더 정확한 데이터 저장이 가능.
		
		//float var=3E6F;
		//double var=3.14;
		//double var=314e-2;
		
		//실수값 저장
		//float var1= 3.14; //컴파일 에러(double에서 float으로 변경불가)소숫점 뒤에 f 또는 F붙여야 함 
		float var2=3.14f;
		double var3=3.14;
		
		//정밀도 테스트
		float var4=0.1234567890123456789f;
		double var5=0.12345678490123456789;
		
		System.out.println("var2: "+var2);
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);
		System.out.println("var5: "+var5); // double타입인 var5가 float타입인 var4보다 2배 이상 정밀한 값으로 출력
		
		//e 사용하기
		double var6=3e6; //5.0 x 10^6
		float var7=3e6F; //3.0 x 10^6
		double var8=2e-3;//2.0 x 10^-3
		System.out.println("var6: "+var6);
		System.out.println("var7: "+var7);
		System.out.println("var8: "+var8);
		

	}

}
