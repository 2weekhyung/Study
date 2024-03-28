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

// �� ����
//	  ����ڷκ��� ������ ���ڸ� �ϳ� �Է¹޾�
//	  ���ĺ� �빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ�
//	  ���ĺ��� �ƴ� ��Ÿ ���ڸ� �Է� ���� ó���ϴ�
//	  ���α׷��� �����Ѵ�.

// ���� ��)
// �� ���� �Է� : A
// >> A �� a
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : b
// >> b �� B
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : 3
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����

		int ch;

		System.out.print("�� ���� �Է� : ");
		ch = System.in.read();

		// ó�� �� ����� ��� ���
		if (ch >= 65 && ch <= 90)	// ASCII �ڵ� ������ �빮�� �Ǻ� (A <= ch <= Z)
		{
			System.out.println((char)ch + " �� " + ((char)(ch+32))); // ex) A(65) + 32 = a(97) 
		}
		else if (ch >= 97 && ch <= 122) // // ASCII �ڵ� ������ �빮�� �Ǻ� (a <= ch <= z)
		{
			System.out.println((char)ch + " �� " + ((char)(ch-32))); // ex) a(97) - 32 = A(65)
		}
		else // ���ĺ��� �ƴ� ���
		{
			System.out.println(">> �Է� ����~!!!");
		}
	}
}

// ���� ���

/*
�� ���� �Է� : A
A �� a
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : b
b �� B
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : 3
>> �Է� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/