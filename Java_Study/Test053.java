/*=========================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ���(while��) �ǽ� �� ����
=========================================*/

// ����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
// �ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1�� ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// �̿� ���� �ȳ��� �� �� ���α׷��� ������ �� �ֵ��� ó���Ѵ�.

// ���� ��)
// ���ϴ� ��(������) �Է� : 7
// 7 * 1 = 7
// 7 * 2 = 14
// 7 * 3 = 21
//	:
// 7 * 9 = 7
// ����Ϸ��� �ƹ� Ű�� ��������..

// ���ϴ� ��(������) �Է� : 7
// 1���� 9������ ������ �Է��� �����մϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������..

import java.io.*;

public class Test053
{
	public static void main(String[] args) throws IOException
	{	/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n=1;
		int dan;
		
		System.out.print("���ϴ� ��(������) �Է� : ");
		dan = Integer.parseInt(br.readLine());

		if (dan > 9 || dan < 1)
		{
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
		}
		else
		{
			while (n < 10)
		{
			System.out.printf("%d * %d = %d\n", dan, n, (dan * n));
			n++;
		}
		}
		*/
		
		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int dan;		// ����ڷκ��� �Է°��� ���� ���·� ��Ƶ� ����(��);

		// ���� �� ó��
		System.out.print("���ϴ� ��(������) �Է� : ");
		dan = Integer.parseInt(br.readLine());

		if (dan<1 || dan>9)
		{
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
			return;
		}

		int n=1;

		// ��� ���(�ݺ� ���)
		while (n <= 8)
		{
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, (dan * n));
		}
	}
}

//���� ���
/*
���ϴ� ��(������) �Է� : 20
1���� 9������ ������ �Է��� �����մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ϴ� ��(������) �Է� : 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/