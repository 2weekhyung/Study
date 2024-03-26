/*==========================
 ■■■ 클래스 고급 ■■■
 - 중첩 클래스
 ==========================*/

 /*
 ○ Annonymous 클래스(익명의 클래스 : 무명 클래스)

   - AWT 나 안드로이드 이벤트 처리에서 일반적으로 사용
   - 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
   - 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
     번거로움으로 인해 빈번하게 객체 생성이 필요할 경우
	 익명의 클래스를 생성하여 처리할 수 있다.

 ○ 형식 및 구조

 new 상위 클래스의 생성자()
 {
	 접근제어지시자 자료형 메소드()
	 {
		 ...;
	 }
 };		← check~!!! 세미콜론

 이벤트 : 프로그램이 동작 할 때 모든행위 ex) 마우스로 클릭, 드래그, 키보드 입력...

 Object 모든 클래스의 조상 클래스
 */

//import java.lang.Object;
//import java.lang.*;	// 자동 삽입

class TestObj // extends Object
{	
	/*
	Object 의 멤버들~!!!
	...;
	
	public String toString()
	{
		...;
	}

	...;
	*/
	
	/*
	@Override
	public String toString()
	{
		...;
	}
	*/

	public Object getString()
	{
		/*
		Object ob = new Object();
		ob.xx();
		ob.yyy();
		ob.zzzz();

		return ob;
		*/

		//return new Object();
		//		 ------------- Object 형

		return new Object()
		{
			//특정 메소드 재구성 → 재정의
			
			@Override
			public String toString()
			{
				return "익명의 클래스...";
			}

		};
	}

}

// import java.lang.*;

public class Test125	// extends Object
{	
	/*
	Object 의 멤버들 상속~!!!
	*/

	public static void main(String[] args)
	{
		TestObj ob = new TestObj();

		System.out.println(ob.toString());
		//--==>> TestObj@15db9742

		System.out.println(ob.getString());
		//--==>> 익명의 클래스...
		
		
		System.out.println(ob.toString());
	}
}