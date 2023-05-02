package sec02.exam03;

import java.io.*;
//라인 단위로 문자열 읽기
public class ReadLineExam {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader(
			ReadLineExam.class.getResource("language.txt").getPath()
			);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data=br.readLine();
			if(data==null) break;
			System.out.println(data);
		}
		
		br.close();
				

	}

}
