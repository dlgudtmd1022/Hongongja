package sec02.exam09;

public class ArrayCopyExam {

	public static void main(String[] args) {
		//System.arraycopy();로 배열복사
		String[] oldStrArray= {"java","array","copy"};
		String[] newStrArray=new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+",");
		}
		//복사되지 않은 항목은 String[]배열의 초기값 null이 그대로 유지된다.

	}

}
