/*=======================================
 ■■■ 클래스 고급 ■■■
 - 인터페이스(Interface)
 ========================================*/

//인터페이스
interface Ademo
{
	public void write();
}

//인터페이스
interface Bdemo
{
	public void print();
}

// ※ 인터페이스는 2개 이상을 구현(implements)할 수 있다.
//	  → 클래스에서 다중 상속이 되지 않는 부분을 보완(보충)하는 개념

// 클래스
// class DempImpl
// class DempImpl extends Ademo, Bdemo	//--(X)
// class DempImpl implements Ademo, Bdemo
// ↓
// 추상 클래스 - 두 인터페이스를 구현하는 추상 클래스
// abstract class DempImpl implements Ademo, Bdemo
// ↓
// 클래스 - 두 인터페이스를 구현한 후 → 두 인터페이스의 모든 메소드를 Overriding → 일반 클래스
class DemoImpl implements Ademo, Bdemo
{	
	// JDK 1.5(5.0)에서는 인터페이스 메소드를
	// 오버라이딩(Overriding)할 때
	// 『@Override』 어노테이션(annotation)을 사용할 수 없다.
	// JDK 1.6(6.0) 이후부터 적용 가능한 문법이다.
	// 단 상속받은 클래스의 메소드를 오버라이딩(Overriding) 할 때에는
	// JDK 1.5(5.0)에서도 어노테이션(annotation) 사용이 가능하다.
	@Override
	public void write()
	{
		System.out.println("Ademo 인터페이스 메소드 write()...");
	}
	
	@Override
	public void print()
	{
		System.out.println("Bdemo 인터페이스 메소드 print()...");
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test118
{
	public static void main(String[] args)
	{
		//Ademo ob1 = new Ademo();		//-- 인터페이스 → 인스턴스 생성 불가
		//Bdemo ob2 = new Bdemo();		//-- 인터페이스 → 인스턴스 생성 불가

		// Ademo, Bdemo 인터페이스를 구현(implements)한
		// 클래스(→ Demoimpl) 기반의 인스턴스 생성
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		//--==>> Ademo 인터페이스 메소드 write()...

		ob1.print();
		//--==>> Bdemo 인터페이스 메소드 print()...
		
		// 업 캐스팅
		Ademo ob2= new DemoImpl();
		Bdemo ob3= new DemoImpl();

		//ob2.print();
		//--==>> 에러 발생(컴파일 에러)

		//ob3.write();
		//--==>> 에러 발생(컴파일 에러)

		ob2.write();
		//--==>> Ademo 인터페이스 메소드 write()...
		ob3.print();
		//--==>> Bdemo 인터페이스 메소드 print()...

		((Bdemo)ob2).print();
		//--==>> Bdemo 인터페이스 메소드 print()...
		((Ademo)ob3).write();
		//--==>> Ademo 인터페이스 메소드 write()...
		//-- ※ DemoImpl 클래스가 두 인터페이스(Ademo, Bdemo)를 모두 구현했기 때문에
		//		이와 같은 처리가 가능하다.
		//		만약, DemoImpl 클래스가 두 인터페이스들 중 한 인터페이스만 구현했다면
		//		이 구문은 런타임 에러가 발생하는 구문이 된다.
		
		// 다운 캐스팅
		((DemoImpl)ob3).write();
	}	
}