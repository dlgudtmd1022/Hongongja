package Do;

public class DoPractice {

	public static void main(String[] args) {
		// 예제1
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);

		byte b = 100;
		//byte result3 = -b;
		int result3 = -b;
		System.out.println("result3=" + result3);
		System.out.println();
		
		// 예제2
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x);
		
		y--;
		--y;
		System.out.println("y=" + y);
		
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
        System.out.println();
		
		// 예제3
        boolean play = true;
        System.out.println(play);
        
        play = !play;
        System.out.println(play);
        
        play = !play;
        System.out.println(play);
        System.out.println();
		
		// 예제4
        int v1 = 5;
        int v2 = 2;
        
        int result1 = v1 + v2;
        System.out.println("result1=" + result1);
        
        int result2 = v1 - v2;
        System.out.println("result2=" + result2);
        
        int result3 = v1 * v2;
        System.out.println("result3=" + result3);
        
        int result4 = v1 / v2;
        System.out.println("result4=" + result4);
        
        int result5 = v1 % v2;
        System.out.println("result5=" + result5);
        
        int result6 = (double) v1 / v2;
        System.out.println("result6=" + result6);
        System.out.println();
		
		// 예제5
        char c1 = 'A' + 1;
        char c2 = 'A';
        // char c3 = c2 + 1;
        
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        // System.out.println("c3: " + c3);
        System.out.println();
		
		// 예제6
        String str1 = "JDK" + 6.0;
        String str2 = str1 + " 특징";
        System.out.println(str2);
        
        String str3 = "JDK" + 3 + 3.0;
        String str3 = 3 + 3.0 + "JDK";
        System.out.println(str3);
        System.out.println(str4);
        System.out.println();
		
		// 예제7
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
        System.out.println("result3=" + result3);
        
        char char1 = 'A'
       	char char2 = 'B'
       	boolean result4 = (char1 < char2);
        System.out.println("result4=" + result4);
        System.out.println();
		
		// 예제8
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3);
        
        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5);
        System.out.println((float)v4 == v5);
        System.out.println();
		
		// 예제9
        int charCode = 'A';
        
        if((charCode>=65) & (charCode<=90)) {
        	System.out.println("대문자");
        }
        if((charCode>=97) & (charCode<=122)) {
        	System.out.println("소문자");
        }
        if(!(charCode<48) && !(charCode>57)) {
        	System.out.println("0~9숫자");
        }
        int value = 6;
        
        if((value%2==0) | (value%3==0)) {
        	System.out.println("2 or 3의 배수");
        }
        if((value%2==0) || (value%3==0)) {
        	System.out.println("2 or 3의 배수");
        
        System.out.println();
    		
    	// 예제10
        int result = 0;
        result += 10;
        System.out.println("result=" + result);
        
        result -= 5;
        System.out.println("result=" + result);

        result *= 3;
        System.out.println("result=" + result);

        result /= 5;
        System.out.println("result=" + result);

        result %= 3;
        System.out.println("result=" + result);
        
        System.out.println();
    	
        // 예제11
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급입니다.");

	}

}
