/*=========================================
	���� Ŭ������ �ν��Ͻ� ����					
=========================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// (Calculate Ŭ���� ����)

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 100 51
// ������ ������(+ - * /)		  : +

// >> 100 + 51 = 151
// ����Ϸ��� �ƹ� Ű�� ��������

import java.util.*;

import java.io.IOException;

class Calculate
{	/*
	int num1, num2;
	char op;

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("������ ������(+ - * /)		 : ");
		op = (char)System.in.read(); 

		
	}

	int cal()
	{	
		int result = 0;
		
		switch (op)
		{	
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
		
		}
		return result;
	}

	void print(int eq)
	{
		System.out.printf("\n>> %d %c %d = %d", num1, op, num2, eq);
	}
	*/
	// �ֿ� ��������
	int su1, su2;
	char op;

	// �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������(+ - * /)		 : ");
		op = (char)System.in.read();
	}

	// �޼ҵ� ����(��� : ����) �� ������ ���굵 ���� ������� ó��
	int cal()
	{
		int result = -1;

		switch (op)
		{	
			case '+': result = su1 + su2; break;
			case '-': result = su1 - su2; break;
			case '*': result = su1 * su2; break;
			case '/': result = su1 / su2; break;
			//default : result = -1;
		
		}

		return result;
	}

	// �޼ҵ� ����(��� : ���)
	void print(int s)
	{
		System.out.printf("\n>> %d %c %d = %d\n", su1, op, su2, s);
	}

}
public class Test073
{
	public static void main(String[] args) throws IOException
	{	
		// Calculate �ν��Ͻ� ����
		Calculate cal = new Calculate();	
		
		cal.input();		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��

		int r = cal.cal();	// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��


		cal.print(r);	// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��

	}	
}

// ���� ���

/*
������ �� ���� �Է�(���� ����) : 200 50
������ ������(+ - * /)           : -

>> 200 - 50 = 150
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/