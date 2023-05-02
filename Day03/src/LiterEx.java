/*
 * 이름 : 이종석
 * 사는곳 : 서울 금천구 
 * 직장 : 서울 금천구
 * "안녕하세요"
 */
public class LiterEx {
	
	public static void main(String[] args) {
		// 상수 
		double pi = 3.14;
		pi = 3.15;  // 오류가 나지 않음 ( PI 는 변수니깐)
		
		final double PI = 3.14; 
		//PI = 3.15; <-- 불변인 상수를 중간에 수정하고자하면 컴파일러 에러가 남
		
		final double MAX_AGE;
		MAX_AGE = 10;  // 잘못된 상수 예시 
		
		
		
		// 리터럴은 \n, \t, \ 등 문자열을 출력/저장 하고 싶을때 사용하는 규칙
		System.out.print("이름 : 이종석\n");
		System.out.print("사는곳 : 서울 금천구\n");
		System.out.print("직장 : 서울 금천구\n");
		System.out.print("\"안녕하세요\"");
		
	}
}
