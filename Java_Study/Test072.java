/*=========================================
	���� Ŭ������ �ν��Ͻ� ����					
=========================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1 ���� �Է¹��� �� ������ ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, ���ݱ���ó�� main() �޼ҵ忡 ��� ����� �����ϴ� ���� �ƴ϶�
// Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�,
// (Hap Ŭ���� ����)
// ����, ������ �Է� ó�� �������� BufferedReader �� readLine() �� ����ϸ�,
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.
// ���� ��)
// ������ ���� �Է�(1~1000) : 1200
// ������ ���� �Է�(1~1000) : -50
// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.io.*;

class Hap
{	/*
	int num;
	int r;
	int sum;

	void input() throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num < 0 || num > 1000);
	}

	int cal()
	{
		for (r=1; r <= num ; r++) 
		{
			
			sum += r;
			
		}

		return sum;
	}

	void print()
	{
		System.out.printf("1~%d ������ �� : %d\n", num, sum);
	}
	*/

	// �ֿ� ���� ����(������� �Է°��� ��Ƴ� ����)
	int su;

	// �Է� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su < 1 || su > 1000);
		
	}

	// ���� ó�� �޼ҵ� ����
	int calculate()
	{
		int result = 0;

		for (int i=1 ; i<= su ; i++ )
		{
			result += i;
		}

		return result;
	}


	// ��� ��� �޼ҵ� ����
	void print(int sum)
	{
		System.out.printf("\n>> 1 ~ %d ������ �� : %d\n", su, sum);
	}
}

public class Test072
{
	public static void main(String[] args) throws IOException
	{	
		// Hap �ν��Ͻ� ����
		Hap ob = new Hap();
		
		//������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		//---------------------------------------
		//  �������� Ȱ��
		ob.input();	//-- new Hap().input();
		
		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		int s = ob.calculate();
		
		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		ob.print(s);
	}
}

// ���� ���

/*
������ ���� �Է�(1~1000) : 2536
������ ���� �Է�(1~1000) : 1001
������ ���� �Է�(1~1000) : 500

>> 1 ~ 500 ������ �� : 125250
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/