/*=========================================
	���� ���������� �������� ����
	- ���� ������ �ʱ�ȭ �׽�Ʈ �� ����						
=========================================*/

// Test068.java �� ��~!!!

// �� ���� ������ �ʱ�ȭ ������ ��ġ�� ������ ����� �� ����.
//    (��, �ڹٰ� �ڵ����� �ʱ�ȭ�� ������ �ְų� ���� �ʴ´�.)

public class Test069
{	
	// Ŭ������ ����
	
	// ���� ���� a ����
	int a;
	//-- �ڵ����� 0���� �ʱ�ȭ

	boolean b;
	
	char c;

	double d;

	public static void main(String[] args)
	{
		// �޼ҵ��� ����
		//System.out.println("a : " + a);
		//--==>> ���� �߻�(������ ����)
		//		 non-static variable a cannot be referenced from a static context -- ������ �ν��Ͻ� ������ �ȵǾ ���� ������� ����
		
		// Test069 Ŭ������ ������� �ν��Ͻ� ����
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