/*=========================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ��� �ǽ� �� ����
=========================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ�����... �ƴ���... �� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε�
//			 ������ �������� �ʴ� ��,
//			 ��, 1�� �Ҽ� �ƴ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.*;

public class Test050
{
	public static void main(String[] args) throws IOException
	{	/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;		// ����� �� �Է�
		int d = 2;		// ������
		boolean p = true;	// �Ǻ�


		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		while ( n > d)
		{	
			if (n % d == 0)
			{
				p = false ;
				break;
			}


			d++;
			
		}

		
	
		if (p && n != 1 && n > 0)
		{
			System.out.printf("\n%d �� �Ҽ�\n", n);
		}
		else
		{
			System.out.printf("\n%d �� �Ҽ��� �ƴ�\n", n);
		}
		*/

		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;		//-- ������� �Է°��� ��Ƴ� ����
		int n =2;		//-- �Է°��� ������� ������ ������ ���� �� ����
						//   2���� �����ؼ� 1�� ����
						//   ex) �Է°� 27 �� n : 2 3 4 5 6 7 8 ... 23 24 25 26

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		// � ���� �Է¹��� �������� �� �� ������
		// �� �Է°��� �Ҽ��� �����Ѵ�.
		//String result = "�Ҽ���";
		boolean flag = true; //-- num(����ڰ� �Է°�)�� �Ҽ��� ���̴�~!!!
		/*
		while (n < num)
		{	
			// �׽�Ʈ
			//System.out.println("�ݺ��� ���� �� n " + n);

			// Ȯ�� ����
			//-- n ���� num �� ������ ���������� Ȯ�� �� �������� 0 ���� Ȯ��

			if (num == 1)	// ��, ������ �������� ��Ȳ
			{
				flag = false;
			}
			else if (num % n == 0)
			{
				flag = false;

				break;
			}
			
			
			n++;
		}
		// �׽�Ʈ
		//System.out.println("flag : " + flag);
		

		// ��� ���
		// (���� ����� ����ϱ� ���� �߰� Ȯ�� �� 1���� �ƴ����� ���� �߰� ����)
		if (flag)
		{
			// ���������� �Ҽ�
			System.out.printf("%d �� �Ҽ�\n", num);
		}
		else
		{
			// ���������� �Ҽ� �ƴ�
			System.out.printf("%d �� �Ҽ��ƴ�\n", num);
		}
		*/

		if ( num == 1)
		{
			System.out.printf("%d �� �Ҽ��ƴ�\n", num);
		}

		else if (num % n == 0)
		{
			while (n < num)
			{
				n++;
			}
			System.out.printf("%d �� �Ҽ��ƴ�\n", num);

		}
		else
		{
			System.out.printf("%d �� �Ҽ�\n", num);
		}
		
	}
}

// ���� ���

/*
������ ���� �Է� : 990
990 �� �Ҽ��ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 991
991 �� �Ҽ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 1
1 �� �Ҽ��ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/