/*=========================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- if��
	- if ~ else �� �ǽ�
=========================================*/

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if~else��, ���ǿ�����, ����if��(if�� ��ø), switch���� �ִ�.

// 2. if���� if ������ ������ ��(true)�� ���
//    Ư�� ������ ���ؾư��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//ù ��° ���� �Է� : 753
//�� ��° ���� �Է� : 22
//�� ��° ���� �Է� : 124
//
// >> ���� ��� : 22 124 753
// ����Ϸ��� �ƹ� Ű�� ��������...

/*
	8	21	74
	------
	--		--
		------

	7	25	99
	------
	--		--
		------

	13	25	87
	------
	--		--
		-------

// �� ù ��° ���� vs �� ��° ���� ũ�� ��
	  �� ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

   �� ù ���� ���� vs ����° ���� ũ�� ��
	  �� ù ��° ������ �� ���� �������� Ŭ ���... �ڸ� �ٲ�
   
   �� �� ���� ���� vs ����° ���� ũ�� ��
	  �� �� ��° ������ �� ���� �������� Ŭ ���... �ڸ� �ٲ�

*/

import java.io.*;

public class Test036
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int num1, num2, num3;

		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num3 = Integer.parseInt(br.readLine());
		
		
		if (num1 >= num2 && num1 >= num3)
		{
			if (num2 >= num3)
			{
				System.out.printf("\n>> ���� ��� : %d %d %d\n", num3, num2, num1);
			}
			else
			{
				System.out.printf("\n>> ���� ��� : %d %d %d\n", num2, num3, num1);
			}
		}
		else if (num2 >= num1 && num2 >= num3)
		{
			if (num1 >= num3)
			{
				System.out.printf("\n>> ���� ��� : %d %d %d\n", num3, num1, num2);
			}
			else
			{
				System.out.printf("\n>> ���� ��� : %d %d %d\n", num1, num3, num2);
			}
		}
		else if (num3 >= num1 && num3 >= num2)
		{
			if (num1 >= num2)
			{
				System.out.printf("\n>> ���� ��� : %d %d %d\n", num2, num1, num3);
			}
			else
			{
				System.out.printf("\n>> ���� ��� : %d %d %d\n", num1, num2, num3);
			}
		}
		else 
		{
			System.out.println("���� �Ұ�");
		}
		*/

		int a, b, c;	//-- ����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����

		System.out.printf("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.printf("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.printf("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		if (a > b)		// ù ��° ������ �� ��° �������� Ŭ ���
		{
			// �ڸ� �ٲ�
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (a > c)		// ù ��° ������ �� ��° �������� Ŭ ���		//-- check~!!! ���ǽ��� if �� else if �� �������� if �θ� �������� ���
		{
			// �ڸ� �ٲ�
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b > c)		// �� ��° ������ �� ��° �������� Ŭ ���
		{
			// �ڸ� �ٲ�
			b=b^c;
			c=c^b;
			b=b^c;
		}
		
		// ���� ��� ���
		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b,c );

	}
}

// ���� �ᱫ

/*
ù ��° ���� �Է� : 300
�� ��° ���� �Է� : 200
�� ��° ���� �Է� : 100

>> ���� ��� : 100 200 300
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 200
�� ��° ���� �Է� : 100
�� ��° ���� �Է� : 300

>> ���� ��� : 100 200 300
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 200
�� ��° ���� �Է� : 100
�� ��° ���� �Է� : 100

>> ���� ��� : 100 100 200
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/