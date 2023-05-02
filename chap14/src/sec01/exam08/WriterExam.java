package sec01.exam08;
//배열 전체 출력
import java.io.FileWriter;
import java.io.Writer;

public class WriterExam {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array= {'A','B','C'};
		
		writer.write(array);
		
		writer.flush();
		writer.close();

	}

}
