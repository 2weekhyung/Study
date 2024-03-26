/*=========================
 ■■■ 클래스 고급 ■■■
 -상속(Inheritance)
 =========================*/

 // ※ 메소드 오버라이딩(Method Overriding)의 특징

 //    - 메소드 이름, 리턴 타입, 파라미터 수나 타입이 완전히 일치해야 한다.
 //	   - 반드시 상속 관계가 있어야 한다.
 //    - 재정의된 하위 클래스의 메소드 접근제어지시자는
 //    상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
 //	   예를 들어, 상위 클래스 메소드의 접근제어시지자가 『protected』인 경우
 //    하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
 //	    접근제어지시자는 『public』 또는 『protected』 이어야 한다.
 //    -『static』 『final』 『private』 메소드는
 //    오버라이딩(Overriding) 할 수 없다.
 //    -Exception의 추가가 불가능하다.
 //    즉, 상위 메소드가 가지고 잇는 기존의 예외 사항에
 //    새로운 Exception을 추가하는 것은 불가능하다는 것이다.


// 부모 클래스(상위 클래스, super class)
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super Write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// 자식 클래스(하위 클래스, sub class)
class SubTest114 extends SuperTest114
{
	/*
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super Write() 메소드 : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub Write() 메소드 : " + a + " : " + b + " : " + c);
		//--==>> 에러 발생(컴파일 에러)
		//-- 슈퍼클래스에서 선언된 변수 a에는 접근할 수 없ㄷ.
		//   → private 변수이기 때문에....

		System.out.println("Sub print() 메소드 : " + b + " : " + c);
		//--==>>Sub print() 메소드 : 100 : 20
		
		System.out.println("Sub print() 메소드 : " + b);
		//--==>> Sub print() 메소드 : 100
		
		System.out.println("Sub print() 메소드 : " + this.b);		//SubTest114.b
		//--==>> Sub print() 메소드 : 100
		
		System.out.println("Sub print() 메소드 : " + super.b);		//SuerTest114.b
		//--==>> Sub print() 메소드 : 10

		//-- 변수 b는 접근 방법에 따라 다른 b로 접근 및 출력이 이루어 진다.
		//   슈퍼클래스에서 선언된 b, 서브클래스에서 선언된 b

		System.out.println("Sub print() 메소드 : "+c);
		//--==>> Sub print() 메소드 : 20

		System.out.println("Sub print() 메소드 : "+this.c);
		//--==>> Sub print() 메소드 : 20

		System.out.println("Sub print() 메소드 : "+super.c);
		//--==>> Sub print() 메소드 : 20
		// 변수 c는 접근하는데 아무런 제약과 제한이 없다.
		// 슈퍼클래스에서 선언된 c
		
	}//end print
	/*
	@override
	public void write()
	{
		System.out.println("Sub Write() 메소드 : " + a + " : " + b + " : " + c);
	}
	*/
	//--==>> 에러 발생(컴파일 에러)
	//       자식이 재정의 해서 private a에 접근 할 수가 없음

	@Override
	public void write()
	{
		System.out.println("Sub Write() 메소드 : "  + b + " : " + c);
	}
	
}

//main() 메소드를 포함하는 외부의 다른 클래스
public class Test114
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest114) 인스턴스 생성
		SubTest114 ob = new SubTest114();

		ob.print();

		ob.write();
		//--==>> Super Write() 메소드 : 5 : 10 : 20
		//--==>> Sub Write() 메소드 : 100 : 20

		System.out.println("----------------------------- 구분선");

		System.out.println(ob.b);
		//--==>> 100

		System.out.println(((SuperTest114)ob).b);
		//--==>> 10
		// ※ 슈퍼 부름~!!!

		ob.write();
		//--==>> Sub Write() 메소드 : 100 : 20

		((SuperTest114)ob).write();
		//--==>> Sub Write() 메소드 : 100 : 20

		// check~!!!
		// ※ 문법적으로 틀리지는 않지만 메소드의 경우는 다름
		// 메소드와 변수를~!!! 꼭~!!! 구분하여 정리할 것~!!!
	}
}

//실행결과

/*
Sub print() 메소드 : 100 : 20
Sub print() 메소드 : 100
Sub print() 메소드 : 100
Sub print() 메소드 : 10
Sub print() 메소드 : 20
Sub print() 메소드 : 20
Sub print() 메소드 : 20
Sub Write() 메소드 : 100 : 20
----------------------------- 구분선
100
10
Sub Write() 메소드 : 100 : 20
Sub Write() 메소드 : 100 : 20
계속하려면 아무 키나 누르십시오 . . .
*/