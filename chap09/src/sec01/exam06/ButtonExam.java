package sec01.exam06;

public class ButtonExam {// 버튼 이벤트 처리

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();

	}

}
