/*=====================================================================
	■■■ 클래스와 인스턴스 ■■■
	- 메소드 오버로딩(Method OverLoading)이 가능한 형태와 불가능한 형태
=======================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print('A');	//--check~!!! 자동 형 변환 주의

		print(20);

		print(3.14);

		double result = print(3.14);
	}

	public static void print() {}
	//public static void print() {}		//--(X)
	public static void print(int i) {}
	//public static void print(int j) {}	//--(X) 매개변수 이름이 다르다고 해서 되는게 아님
	public static void print(char c) {}		//-- 자동 형 변환 규칙 check~!!!
	public static void print(int i, int j) {}
	public static void print(double d) {} //-- 자동 형 변환 규칙 check~!!!
	//public static void print(double e) {return 10.0;}	//--(X) 정의 불가
	//public static double print(double e) {return 10.0;} //반환자료형이 다르다는것은 메소드를 호출 한 후에 처리하는 것이기 때문에 식별할 때는 차이가 없다. check~!!! 
}