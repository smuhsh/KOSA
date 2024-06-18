package oop09.interface02;

import org.junit.jupiter.params.converter.DefaultArgumentConverter;

public class Pitcher implements BodySign{
	
	@Override
	public void throwBall(int how) {
		String str = null;
	
		switch(how) {
			case BodySign.CENTER : 
				str = "가운데"; 
				break;
			case BodySign.LEFT : 
				str = "왼"; 
				break;
			case BodySign.RIGHT: 
				str = "오른"; 
				break;
			default : 
				str = "잘못된"; 
				break;
		}
	
	}

}
