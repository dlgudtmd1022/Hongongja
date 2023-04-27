import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// 1번 예제
		int value = 0;
		int result = value + 10;
		System.out.println(result);
		System.out.println();
		
		// 2번 예제
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		System.out.println();
		
		// 3번 예제
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
		System.out.println();
		
		// 4번 예제
		int v1 = 15;
		if(v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;  // v2는 if문 안에서만 활성화된 변수임
		System.out.println();
		
		// 5번 예제
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;
		
		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println();
		
		// 6번 예제
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		byte var6 = 128;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println();
		
		// 7번 예제
		long var1 = 10;
		long var2 = 20L;
	// long var3 = 100000000000;
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println();
		
		// 8번 예제
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println();
		
		// 9번 예제
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		System.out.println();
		
		// 10번 예제
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.print("봄\\여름\\가을\\겨울");
		System.out.println();
		
		// 11번 예제
		// float var1 = 3.14;
		float var2 = 3.14f;
		double var3 = 3.14;
		
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);
		
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8);
		System.out.println();
		
		// 12번 예제
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		System.out.println();
		
		// 13번 예제
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		intValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		System.out.println();
		
		// 14번 예제
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		System.out.println();
		
		// 15번 예제
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
		System.out.println();
		
		// 16번 예제
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double)x/y;
		System.out.println(result);
		System.out.println();
		
		// 17번 예제
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4);
		System.out.println();
		
		// 18번 예제
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		System.out.println();
		
		// 19번 예제
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		double area = 3.14159 * 10* 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		System.out.println();
		
		// 20번 예제
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		System.out.println();
		
		// 21번 예제
		int keyCode;
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
		System.out.println();
		
		// 22번 예제
		int keyCode;
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		System.out.println("종료");	
		System.out.println();

		// 23번 예제
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
					System.out.println("입력된 문자열: \"" + inputData + "\"");
					if(inputData.equals("q")) {
						break;
					}
			}
		System.out.println("종료");
		System.out.println();
		
		}
		
	}
	

