/*=========================================
	���� Ŭ������ �ν��Ͻ� ����
	- ������(Constructor)
	- �޼ҵ� �����ε�
=========================================*/

public class Test076
{
	int x;

	// �� �������� �̸��� �׻� ���ܾ��� Ŭ������ �̸��� �����ؾ� �ϸ�
	//	  �ʿ��� ��� �μ��� �޾Ƶ��̴� �͵� �����ϴ�.(�μ��� �Ű������� ���� ��)
	//    ���� �̸��� �޼ҵ带 �����ϴ� �ߺ����ǰ� ����������
	//    ���ϰ�(��ȯ��)�� ���� �� ����.

	// �� �����ڴ� �ٸ� �Ϲ� �޼ҵ�ó�� ȣ��� �� ����,
	//    ��new�� �����ڸ� �̿��Ͽ� ��ü�� �����ϱ� ���� ȣ��Ǹ�,
	//    �� Ŭ������ �ν��Ͻ��� ��ü�� ������ �Ŀ�
	//    ������ ��ü�� ����� �ʱ�ȭ ��Ű�� �۾��� �����ϰ� �ȴ�.



	// ������
	Test076()		
	{	
		// �� ������ ���ο��� �ٸ� �����ڸ� ȣ���ϴ� ���� �����ϴ�. �ٸ� �Ϲ� �޼ҵ�ó��....
		//    ������, ������ ���ο��� ���� ���� ����Ǿ�� �Ѵ�. check~!!!
		//Test076(200);
		this(200);
		//-- ������ ���ο��� �Ǵٸ� �����ڸ� ȣ���ϴ� ����
		
		this.x=10;
		System.out.println("���� ���� ������"); 
		System.out.println("Test076�� �����ִ� x : " + this.x);

		
	}
	
	// ������
	//Test076(int num)
	Test076(int x)
	{	
		//x = num;
		
		//x = x;	//-- �� �� �������� x

		//Test076.x = x; - �̰� �ٸ� ������ �����ؼ� �Ұ���
		
		this.x = x;
		//   ��
		// �������� x

		// �������� �ؼ� �� Test076.x = x;
		System.out.println("���ڰ� �ϳ��� ������");
		//System.out.println("Test076�� �����ִ� x : " + x);
		System.out.println("Test076�� �����ִ� x : " + this.x);
	}

	// �޼ҵ��� �Ű������� ���������� ������ this.x �� �� ����Ѵٸ� this.x �� �������� x�� �ʱ�ȭ �ȴ�.

	public static void main(String[] args)
	{
		// Test076 Ŭ���� ��� �ν��Ͻ� ����
		Test076 ob1 = new Test076(); 
		Test076 ob2 = new Test076(100);
		//--==>> ���� ���� ������
		//		 Test076�� �����ִ� x : 10
		//		 ���ڰ� �ϳ��� ������
		//		 Test076�� �����ִ� x : 100

		System.out.println();
		System.out.println("main ���� ob1.x :" + ob1.x);
		System.out.println("main ���� ob2.x :" + ob2.x);

		/*
		�޼ҵ� �����ε�(overloading)�̶� ���� �̸��� �޼ҵ带 �ߺ��Ͽ� �����ϴ� ���� �ǹ��մϴ�.

		�ڹٿ����� ���� �� Ŭ���� ���� ���� �̸��� �޼ҵ带 �� �̻� ���� �� �����ϴ�.

		������ �Ű������� ������ Ÿ���� �ٸ��� �ϸ�, �ϳ��� �̸����� �޼ҵ带 �ۼ��� �� �ֽ��ϴ�.

		��, �޼ҵ� �����ε��� ���� �ٸ� �ñ״�ó�� ���� ���� �޼ҵ带 ���� �̸����� �����ϴ� ���̶�� �� �� �ֽ��ϴ�.

		�̷��� �޼ҵ� �����ε��� ��������ν� �޼ҵ忡 ���Ǵ� �̸��� ������ �� �ֽ��ϴ�.
		*/

		// return �� ���� �޼ҵ带 ����
		// this �� ���� class �� ����

		
	}
}

//������

/*
���ڰ� �ϳ��� ������
Test076�� �����ִ� x : 200
���� ���� ������
Test076�� �����ִ� x : 10
���ڰ� �ϳ��� ������
Test076�� �����ִ� x : 100

main ���� ob1.x :10
main ���� ob2.x :100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/