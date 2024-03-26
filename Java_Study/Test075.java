/*=========================================
	■■■ 클래스와 인스턴스 ■■■
	- 생성자(Constructor)
=========================================*/
class NumberTest2
{
	int num;

	// 디폴트(default) 생성자
	/*
	NumberTest2()
	{
	}
	*/
	
	// ※ 사용자 정의 생성자가 정의되어 있으므로
	//	  default 생성자가 자동으로 삽입되지 않음~!!!

	// 생성자 → 사용자 정의 생성자
	NumberTest2(int n)
	{
		num = n;
		System.out.println("생성자 호출 시 매개변수 전달 : " + n);
	}

	int getNum()
	{
		return num;
	}
}

public class Test075
{
	public static void main(String[] args)
	{
		//NumberTest2 인스턴스 생성
		//NumberTest2 ob = new NumberTest2();-- 존재하지 않는 메소드를 부르고 있음	
		//--==>> 에러 발생(컴파일 에러)
		//--NumberTest2 클래스에는
		//  사용자 정의 생성자가 존재하고 있는 상황이기 때문에
		//  『default 생성자』가 자동으로 삽입되지 않으며
		//  사용자가 정의한 생성자는 매개변수를 갖는 형태이므로
		//  위와 같이 매개변수 없는 생성자를 호출하는 형태의 구문은
		//  문제를 발생시키게 된다.

		NumberTest2 ob2 = new NumberTest2(10);
		//--==>> 생성자 호출 시 매개변수 전달 : 10

		System.out.println("메소드 반환 값 : " + ob2.getNum());
		//--==>> 메소드 반환 값 : 10

		System.out.println("ob2.num : " + ob2.num);
		//--==>> ob2.num : 10

		NumberTest2 ob3 = new NumberTest2(2000);
		//--==>> 생성자 호출 시 매개변수 전달 : 2000

		System.out.println("메소드 반환 값 : " + ob3.getNum());
		System.out.println("ob3.num : " + ob3.num);
		//--==>> 메소드 반환 값 : 2000
		//		 ob3.num : 2000

		// 과일장수 클래스를 기반으로 인스턴스를 만들더라도
		// 2번 과일 장수는 사과를 10개 가지고있고, 3번 과일 장수는 사과를 2000개 가지고 있는 느낌

		
	}
}