/*=========================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ���(for��) �ǽ� �� ����
=========================================*/

// return �ǽ�

// �� return Ű���尡 ���ϴ� �� ���� �ǹ�
//    1. ���� ��ȯ
//	  2. �޼ҵ� ����

import java.io.*;

public class Test066
{
	public static void main(String[] args)	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n , s;

		System.out.print("������ ���� �Է�(10 �̻�) : ");
		n = Integer.parseInt(br.readLine());
		
		if(n<10)
		{
			System.out.println("10 �̻��� ������ �Է��ؾ� �մϴ�.");
			return;
			//-- �޼ҵ� ���� �� return ���� �����ϰ� �ִ� �޼ҵ� �� main() �޼ҵ� �� ���α׷� ����
		}

		s = 0;
		for (int i=1; i<=n ; i++)
		{
			s += i;
		}

		System.out.println("��� : " + s);
	}
}