/*=========================================
	���� �ڹ��� �⺻ ���α׷��� ����
	- ���������
	- BufferedReader
	- printf()
=========================================*/

// ����ڷκ��� ������ ������ �� �� �Է� �޾�
// ��Ģ���� �� ������ ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ BufferdReader �� Ȱ���� �� �ֵ��� �ϰ�
// ����ϴ� ������ printf() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
// ����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2
//
// ===�������===
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2
// 10 / 2
// 10 % 2

import java.io.*;

public class Test021
{
	public static void main(String[] args) throws IOException
	{	/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1;
		int num2;

		System.out.print("ù ��° ���� �Է�: ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�: ");
		num2 = Integer.parseInt(br.readLine());

		int a = num1 + num2;
		int b = num1 - num2;
		int c = num1 * num2;
		int d = num1 / num2;
		int e = num1 % num2;

		System.out.println();

		System.out.println("====�������====");
		System.out.printf("%d + %d = %d",num1,num2,a);
		System.out.printf("\n%d - %d = %d",num1,num2,b);
		System.out.printf("\n%d * %d = %d",num1,num2,c);
		System.out.printf("\n%d / %d = %d",num1,num2,d);
		System.out.printf("\n%d %% %d = %d",num1,num2,e);
		System.out.println("\n==============");
		*/

		// ���� ���
		/*
		ù ��° ���� �Է�: 10
�� ��° ���� �Է�: 2

====�������====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
		
		// �ֿ� ���� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;		// ����� �Է°��� ���� ����
		int res1, res2, res3, res4, res5; //-- ������ ���� ����� ���� ����

		// ���� �� ó��

		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;

		



		// ��� ���
		
		System.out.println();

		System.out.println("====�������====");
		System.out.printf("%d + %d = %d", num1, num2, res1);
		System.out.printf("\n%d - %d = %d", num1, num2, res2);
		System.out.printf("\n%d * %d = %d", num1, num2, res3);
		System.out.printf("\n%d / %d = %d", num1, num2, res4);
		System.out.printf("\n%d %% %d = %d", num1, num2, res5);	// "%%" �� "%"
		System.out.println("\n==============");




		
	}
}

// ���� ���
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

====�������====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
==============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/