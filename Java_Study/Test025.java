/*=========================================
	���� ������(Operator) ����
	- ��Ʈ ���� ������
	=========================================*/

public class Test025
{
	public static void main(String[] args)
	{
		int x = 128; // 00000000	00000000	00000000 100000000
		
		System.out.printf("x << 3 : %d\n", x << 3);
		// 00000000	00000000	00000100 000000000
		// �� 1024
		System.out.printf("x * 8 : %d\n", x * 8);

		System.out.printf("x >> 3 : %d\n", x >> 3);
		// 00000000	00000000	00000000 000010000
		// �� 16

		System.out.printf("x / 8 : %d\n", x / 8);

		System.out.printf("x << 24 : %d\n", x << 24);
		// 10000000 00000000 00000000 00000000
		//--==>> x << 24 : -2147483648
		
		System.out.printf("x << 25 : %d\n", x << 25);
		System.out.printf("x << 26 : %d\n", x << 26);
		System.out.printf("x << 27 : %d\n", x << 27);
		System.out.printf("x << 31 : %d\n", x << 31);
		System.out.printf("x << 32 : %d\n", x << 32);
		//x << 25 : 0
		//x << 26 : 0
		//x << 27 : 0
		//x << 31 : 0
		//x << 32 : 128

		// int�� 32��Ʈ�� ǥ�� ������ �Ѿ�� �ڽ��� �ڸ��� ã�������� �ẹ

		

	}
}