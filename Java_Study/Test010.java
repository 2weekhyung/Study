/*=========================================
	���� �ڹ��� ���� �� Ư¡ ����
=========================================*/

// �� ����
//	������ �ο��� ������ ������ ����
//	���� ���̿� �ѷ��� ���ϴ� ���α׷��� �����Ѵ�.
//  �� ������ : 10

// �� ���� ���� : ������ * ������ * 3.141592
//    ���� �ѷ� : ������ * 2 * 3.1415192

// ���� ��)
// ���� : xxx
// �ѷ� : xxx
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test010
{
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println("���� : " + a*a*3.141592);
		System.out.println("�ѷ� : " + 2*a*3.141592);

		// ���� ���
		// ���� : 314.1592
		// �ѷ� : 62.83184
		// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

		// �ٸ� ����� Ǭ ����
		// int a = 10;
		// double b = a * a * 3.141592;
		// double c = a * 2 * 3.141592;

		// System.out.println("���� : " + b);
		// System.out.println("�ѷ� : " + c);

		// �Բ� Ǯ���� ���� ---------------------------
		
		// �ֿ� ���� ����
		int r = 10;						//-- ������(r)
		//double pi = 3.141592;			//-- ������(��)
		//final double pi = 3.141592;	//-- ������(��)
		final double PI = 3.141592;		//-- ������(��)
		//-- ��final�� Ű���� : ������ ���ȭ~!!!
		//-- ���ȭ�� Ű������� �빮�ڷ� �ۼ�

		// rainbowColor �� RAINBOWCOLOR �� RAINBOW_COLOR
		// userNAME �� USERNAME �� USER_NAME
		// applePrice �� AAPLEPRICE �� APPLE_PRICE
		// ���ȭ�� Ű������� ���� �빮��ȭ �ϸ� �������� �������� ����� ����� (_) ���

		double area, length;		//-- ���� ����. �ѷ�


		// ���� �� ó��
		// �� ���� ����
		//	  ���� ���� : ������ * ������ * 3.141592
		area = r * r * PI;

		// �� �ѷ� ����
		//    ���� �ѷ� : ������ * 2 * 3.1415192
		length = r * 2 * PI;

		// ��� ���
		//System.out.println("���� : " + area);
		System.out.printf("���� : %.3f%n" , area);
		//System.out.println("�ѷ� : " + length);
		System.out.printf("�ѷ� : %.3f%n" , length);

		System.out.printf("���� : %.3f%n�ѷ� : %.3f%n" , area, length);

	}
}

// ���� ���

/*
���� : 314.159
�ѷ� : 62.832
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/