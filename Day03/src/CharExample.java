
public class CharExample {
	
	public static void main(String[] args) {
//		10;// 정수의 기본값 int
//		1.0; // 실수의 기본형 double
		char alpha2 = 65;
		int ascii=0;
		
		for(int i =0; i<26; i++) {
			alpha2 = (char)(alpha2+i);
			ascii = alpha2;
			System.out.println("문자 : " + alpha2 
					+ "는 ascii code" + 
			+ ascii + " 입니다." );
		}
	}
}
