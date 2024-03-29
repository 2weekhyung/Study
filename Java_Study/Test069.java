/*=========================================
	■■■ 지역변수와 전역변수 ■■■
	- 지역 변수의 초기화 테스트 및 관찰						
=========================================*/

// Test068.java 와 비교~!!!

// ※ 지역 변수는 초기화 과정을 거치지 않으면 사용할 수 없다.
//    (즉, 자바가 자동으로 초기화를 수행해 주거나 하지 않는다.)

public class Test069
{	
	// 클래스의 영역
	
	// 전역 변수 a 선언
	int a;
	//-- 자동으로 0으로 초기화

	boolean b;
	
	char c;

	double d;

	public static void main(String[] args)
	{
		// 메소드의 영역
		//System.out.println("a : " + a);
		//--==>> 에러 발생(컴파일 에러)
		//		 non-static variable a cannot be referenced from a static context -- 지금은 인스턴스 생성이 안되어서 나는 오류라고 생각
		
		// Test069 클래스를 기반으로 인스턴스 생성
		Test069 ob = new Test069();

		System.out.println("ob.a : "+ ob.a);
		//--==>> ob.a : 0

		System.out.println("ob.b : "+ ob.b);
		//--==> ob.b : false

		System.out.println("ob.c : "+ ob.c);
		//--==>> ob.c :
		
		System.out.println("ob.d : "+ ob.d);
		//--==>> ob.d : 0.0


	}
}