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

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ Ȧ������, ¦������, ������ Ȯ���Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է�: 14
// 14 �� ¦��
// ����Ϸ��� �ƹ�Ű�� ��������...

// ������ ���� �Է�: 13
// 14 �� Ȧ��
// ����Ϸ��� �ƹ�Ű�� ��������...

// ������ ���� �Է�: 0
// 0 �� 0
// ����Ϸ��� �ƹ�Ű�� ��������...

import java.io.*;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int num;

		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		if (num == 0)
		{
			System.out.println("0 �� ��");
		}
		
		else if (num % 2 == 0)
		{
			System.out.printf("%d �� ¦��\n",num);
		}
		else if (num % 2 != 0)
		{
			System.out.printf("%d �� Ȧ��\n",num);
		}
		*/

		int n;
		
		System.out.print("������ ���� �Է� : ");
		
		n = Integer.parseInt(br.readLine());
		/*
		if (n%2==0)
		{
			System.out.println(n + " �� ¦��");
		}
		else if (n%2!=0)
		{
			System.out.println(n + " �� Ȧ��");		//-- 0 �� ¦���� ���� 
		}
		else
		{
			System.out.println(n + " �� ��");
		}
		*/
		
		/*
		if (n%2!=0)
		{
			System.out.println(n + " �� Ȧ��");
		}
		else if (n==0)
		{
			System.out.println(n + " �� ��");		 
		}
		else
		{
			System.out.println(n + " �� ¦��");
		}
		*/

		String result = "�����Ұ�"; // �������̸� �̷��� ����

		if (n==0)
		{
			result = "��";
		}
		else if (n%2==0)
		{
			result = "¦��";
		}
		else if (n%2!=0)
		{
			result = "Ȧ��";
		}

		System.out.println(n + " �� " + result);

		
	}
}