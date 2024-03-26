/*=========================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- swtitch�� �ǽ�
=========================================*/
/*
�� ���� ���ù� �̶� �ϸ�, switch �� ������ ���� ���� ����
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�

�� ���� �� ����
	switch(����)
	{
		case ���1 : ����1; [break;]
		case ���2 : ����2; [break;]
				:
		[default : ����n+1; [breakk;]
	}

	switch ���� �����ġ��� case�� ���������
	byte, short, int, long ���̾�� �Ѵ�.
	(+���� Ÿ�� char)
	(+���ڿ� Ÿ�� String)

	case �� �ڿ� ��break;���� ���� ������ ���
	���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. (�� �⺻ ��)
	��break;���� ������ ���
	�ش� �������� ������ ���� �� swtich ���� ����������. (�� �Ϲ� ��)
*/

// ����ڷκ��� 1 ���� 3 ������ ���� �� �ϳ��� �Է¹޾�
// �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �ΰ��� ������� ������ �� �ֵ��� �Ѵ�.

// �� switch ���� �Ϲ� ���� ����Ͽ� �����Ѵ�.
// �� switch ���� �⺻ ���� ����ϵ�,
//	  ��break���� �� �ѹ��� ����� �� �ֵ��� �����Ѵ�.

// ���� ��
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű�� ��������.

// ���� ��
// ������ ���� �Է�(1~3) : 1
// ��
// ����Ϸ��� �ƹ� Ű�� ��������.

// ���� ��
// ������ ���� �Է�(1~3) : 7
// �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������.

import java.io.*;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int num;

		System.out.print("������ ���� �Է�(1~3) : ");
		num = Integer.parseInt(br.readLine());


		// �� �Ϲ� �� break ���
		
		switch (num)
		{
		case 3: System.out.println("�ڡڡ�"); break;
		case 2: System.out.println("�ڡ�"); break;
		case 1: System.out.println("��"); break;
		default: System.out.println("�Է� ����~!!!");

		}

		// �� �⺻ �� ���
		switch (num)
		{
		default: System.out.println("�Է� ����~!!!"); break;
		case 3: System.out.println("�ڡڡ�"); 
		case 2: System.out.println("�ڡ�");
		case 1: System.out.println("��");
		
		}
		*/

		int n;
		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());

		// �� �Ϲ� �� break ���
		
		/*
		switch (n)
		{
		case 3: System.out.println("�ڡڡ�"); break;
		case 2: System.out.println("�ڡ�"); break;
		case 1: System.out.println("��"); break;
		default: System.out.println("�Է� ����~!!!");

		}
		*/
		// �� �⺻ �� ���
		switch (n)
		{
		case 3: System.out.print("��"); 
		case 2: System.out.print("��");
		case 1: System.out.print("��");
			break;
		default: System.out.println("�Է� ����~!!!");
		

		
		
		
		
		}
		System.out.println();
		
	}
}

// ���� ���
/*
������ ���� �Է�(1~3) : 1
��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 2
�ڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 4
�Է� ����~!!!

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/