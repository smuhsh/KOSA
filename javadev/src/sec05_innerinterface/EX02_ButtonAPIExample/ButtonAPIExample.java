package sec05_innerinterface.EX02_ButtonAPIExample;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p448
 * 		일반적인 UI API의 구조예시(버튼)
 * 
 * */
public class ButtonAPIExample {

	public static void main(String[] args) {
		//개발자 1. 클릭하면 음악 재생
		Button btn1 = new Button();
		btn1.setOnclickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자 1:음악재생");
			}
		});
		btn1.onClick();
		
		//개발자 2.클릭하면 네이버 접속
		Button btn2 = new Button();
		btn2.setOnclickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자 2: 네이버 접속");
			}
		});
		btn2.onClick();

	}

}
