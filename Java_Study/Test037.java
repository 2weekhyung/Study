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

// ����ڷκ��� ������ ���� 5���� �Է¹޾�
// ¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�.
// �� Scanner �� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �Ѵ�.

// ���� ��
// ������ ���� 5�� �Է�(���� ����) : 11 12 13 14 15

// >> ¦���� ���� 26 �̰�, Ȧ���� ���� 39 �Դϴ�.

import java.util.*;

public class Test037
{
	public static void main(String[] args) 
	{	
		/*
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, n4, n5;
		int sum1;	// ¦��
		int sum2;	// Ȧ��


		System.out.print("������ ���� 5�� �Է�(���� ����) : ");
		n1 = Integer.parseInt(sc.next());
		n2 = Integer.parseInt(sc.next());
		n3 = Integer.parseInt(sc.next());
		n4 = Integer.parseInt(sc.next());
		n5 = Integer.parseInt(sc.next());

		sum1 = 0;
		sum2 = 0;

		

		if (n1 % 2 == 0)
		{
			sum1 += n1;
		}
		else
		{
			sum2 += n1;
		}
		if (n2 % 2 == 0)
		{
			sum1 += n2;
		}
		else
		{
			sum2 += n2;
		}
		if (n3 % 2 == 0)
		{
			sum1 += n3;
		}
		else
		{
			sum2 += n3;
		}
		if (n4 % 2 == 0)
		{
			sum1 += n4;
		}
		else
		{
			sum2 += n4;
		}
		if (n5 % 2 == 0)
		{
			sum1 += n5;
		}
		else
		{
			sum2 += n5;
		}
		
		System.out.printf("\n>> ¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.\n", sum1, sum2);
		*/

		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);

		// �������� ��Ƴ� ���� �ʱ�ȭ - check~!!! ������ �϶��� 0 ���� �ʱ�ȭ / ������ �϶��� 1�� �ʱ�ȭ
		int evenSum=0;		//-- ¦���� ���� ��Ƴ� ���� ����
		int oddSum=0;		//-- Ȧ���� ���� ��Ƴ� ���� ����
		int num1, num2, num3, num4, num5;

		// ���� �� ó��
		System.out.print("������ ���� 5�� �Է�(���� ����) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
		
		if (num1 % 2 == 0) //-- num1 �� ¦���� ��...
		{
			// evenSum �� num1 ��ŭ ����
			evenSum += num1;
		}
		else	//-- num1 �� ¦���� �ƴ� ��... (Ȧ���� ��)
		{
			// oddSum �� num1 ��ŭ ����
			oddSum += num1;
		}
		if (num2 % 2 == 0) //-- num1 �� ¦���� ��...
		{
			// evenSum �� num1 ��ŭ ����
			evenSum += num2;
		}
		else	//-- num1 �� ¦���� �ƴ� ��... (Ȧ���� ��)
		{
			// oddSum �� num1 ��ŭ ����
			oddSum += num2;
		}
		if (num3 % 2 == 0) //-- num1 �� ¦���� ��...
		{
			// evenSum �� num1 ��ŭ ����
			evenSum += num3;
		}
		else	//-- num1 �� ¦���� �ƴ� ��... (Ȧ���� ��)
		{
			// oddSum �� num1 ��ŭ ����
			oddSum += num3;
		}
		if (num4 % 4 == 0) //-- num1 �� ¦���� ��...
		{
			// evenSum �� num1 ��ŭ ����
			evenSum += num4;
		}
		else	//-- num1 �� ¦���� �ƴ� ��... (Ȧ���� ��)
		{
			// oddSum �� num1 ��ŭ ����
			oddSum += num4;
		}
		if (num5 % 2 == 0) //-- num1 �� ¦���� ��...
		{
			// evenSum �� num1 ��ŭ ����
			evenSum += num5;
		}
		else	//-- num1 �� ¦���� �ƴ� ��... (Ȧ���� ��)
		{
			// oddSum �� num1 ��ŭ ����
			oddSum += num5;
		}
		*/

		// ��� ���

		System.out.printf("\n>> ¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.\n", evenSum, oddSum);
		
		


	}
}