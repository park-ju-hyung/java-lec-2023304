// 1. 자바 소스의 구조
// a) 자바는 모두 클래스 / 인터페이스로 정의
// b) 클래스는 속성 / 메소드로 이루어진다
// c) 

/* 
class + 클래스명{
	b-1) 속성은 변수/상수 그 클래스의 상태를 결정하는 내용 ex) int age;
	b-2) 메소드는 행위 
	리턴타입 메소드명(){
	
	}
	
}

interface + 인터페이스명{
	

}
*/

// 2. 주석
// 한줄 주석 / 여러줄 주석 

// <-- 한줄주석
/*
 * <-- 여러줄 주석
 */



//클래스
public class Day03_first {
	//메인메소드 -> 최소한개의 메인메소드느 필요
	public static void main(String args[]) {
		System.out.println("하악하악");
		for(int i = 3; i<10; i+=3) {
			for(int i2 = 1; i2<10; i2++ ) {
				if(i<i2) {
					break;
				}
				System.out.println(i + "X" + i2 + "=" + i*i2);
			}
		}
	}
}