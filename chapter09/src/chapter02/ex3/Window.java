package chapter02.ex3;

public class Window {

	Button b1 = new Button();
	Button b2 = new Button();

	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
			
		}
	};
	
	Window(){
		b1.setOnClickListener(listener);
		b2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {

				System.out.println("메세지를 보냅니다.");
				
			}
		}	
		);
	}

}
