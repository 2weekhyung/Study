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

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 3
// �� ��° ���� �Է� : 17
// ������ �Է�[+ - * l]: =

// >> 3 - 17 = - 14
// ����Ϸ��� �ƹ�Ű�� ...

import java.io.*;

public class Test042
{
	public static void main(String[] args) throws IOException
	{	/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result=0;

		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է� ��+ - * /��: ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': result = a + b; break; // case�� int ���� �ƴѰ�� char ���³�, String ���·� �ٲ� �� �ִ�.
		
		case '-': result = a - b; break;

		case '*': result = a * b; break;

		case '/': result = a / b; break;
		
		}

		System.out.printf("\n %d %c %d = %d\n", a, op, b, result);
		*/

		// ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int a, b, result;
		int op;
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է� ��+ - * /��: ");
		op = System.in.read();
		
		// + �� op = 43, - �� op = 45, * �� op = 42, / �� op = 47

		switch (op)
		{
		case 43: result = a + b; break;
		
		case 45: result = a - b; break;

		case 42: result = a * b; break;

		case 47: result = a / b; break;
		
		default: return;		//-- 1. ���� ��ȯ
								//-- 2. �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
								//	    ����� ������ �ڵ�� ������� ���α׷� ����(����Ϸ��� �ƹ�Ű�� ��������....)
		
		}
		System.out.println();
		System.out.printf("%d %c %d = %d\n", a, op, b, result);
		*/

		/*
		// ��
		int a, b, result;
		char op;

		System.out.print("ù ���� ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': result = a + b; break;
		
		case '-': result = a - b; break;

		case '*': result = a * b; break;

		case '/': result = a / b; break;

		default : return;
		
		}

		System.out.printf("\n %d %c %d = %d\n", a, op, b, result);
		*/

		// ��
		int a, b, result;
		String op;

		System.out.print("ù ���� ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = br.readLine();

		switch (op)
		{
		case "+": result = a + b; break;
		
		case "-": result = a - b; break;

		case "*": result = a * b; break;

		case "/": result = a / b; break;

		default : return;
		
		}

		System.out.printf("\n %d %s %d = %d\n", a, op, b, result);
	}
}

// ������
/*
ù ��° ���� �Է� : 3
�� ��° ���� �Է� : 17
������ �Է� ��+ - * /��: -

 3 - 17 = -14
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/