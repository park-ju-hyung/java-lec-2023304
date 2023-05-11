/*
 * 1. if
 * 2. if-else if
 * 3. if else
 */

public class Control01 {

	public static void main(String args[]) {

		//1. if
		int age=40;
		
		//청년저축가입 나이 제한
		if(age < 40) {
			System.out.println("청년저축 가입 가능 합니다.");
			
		}
		
		//청년저축 가입나이는 19세 이상이고(and), 39세 이하인 사람만
		//청년저축 가입나이는 19세 이상이거나(or), 39세 이하이거나 한 사람들은
		//가입할 수 있다.
		//가입가능합니다.
		//19<=age<=39

		
	   if (age>= 19&& age <= 39) {
		System.out.println("19세 이상, 39세 이하인 분이시군요");
		System.out.println("진행시켜");
	}
	
	   if(age>39 && age<19) {
		   System.out.println("자기는 가입대상이 아녀.");
	   }
	   
	   //2.if~ else
	   
	   if (age >=19 && age <=39) {
		   System.out.println("나이:"+age);
		   System.out.println("진행시켜.");
	   } else {
		   System.out.println("집에가.");
	   }
	   
	   
	System.out.println("프로그램 종료");
		
	}
}
