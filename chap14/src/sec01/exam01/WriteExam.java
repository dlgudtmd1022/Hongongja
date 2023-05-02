package sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

//1byte씩 출력하기
public class WriteExam {
	public static void main(String[] args) throws Exception {
		//데이터 도착지를 test1.db로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}

}
