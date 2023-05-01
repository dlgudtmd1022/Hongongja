package sec01.exam14;

import java.io.UnsupportedEncodingException;

//바이트 배열로 변환
public class StringGetBytesExam {
	public static void main(String[] args) {
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		String str1 = new String(bytes1);
		System.out.println(str1);// 기본 문자셋으로 인코딩과 디코딩
		
		try {
			
			byte[] bytes2=str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println(str2);// "EUC-KR"을 이용해서 인코딩 및 디코딩
			
			byte[] bytes3=str.getBytes("UTF-8");
			System.out.println(bytes3.length);
			String str3 = new String(bytes3,"UTF-8");
			System.out.println(str3);// "UTF-8"을 이용해서 인코딩 및 디코딩
			
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
