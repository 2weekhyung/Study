/*=========================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ��� �ǽ� �� ����
=========================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// �Է¹��� �� ���� ��
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 100
// �� ��° ���� �Է� : 200
// >> 100 ~ 200 ������ �� : XXX
// ����Ϸ��� �ƹ� Ű�� ��������...

// ù ��° ���� �Է� : 1000
// �� ��° ���� �Է� : 2
// >> 2 ~ 1000 ������ �� : XXX
// ����Ϸ��� �ƹ� Ű�� ��������...

// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 10
// >> 2 ~ 1000 ������ �� : XXX
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		/*
		int n1, n2;
		int sum = 0;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
		
		if (n2 > n1)
		{
			n2=n2^n1;
			n1=n1^n2;
			n2=n2^n1;
		}

		while (n1 > n2)
		{
			sum+=n1;
			n1++;
			
		}
		
		System.out.printf("%d ~ %d ������ �� : %d\n", n1, n2, sum1);
		
		
		
		
		/*
		if (n1 > n2)
		{
			while (n1 > n2)
			{
				sum1 += n1;
				sum2 += n2;

				n1++;
				n2++;
			}
			System.out.printf("%d ~ %d ������ �� : %d\n", n1, n2, sum1+sum2);
		}
		*/
		/*
		else if (n2 > n1)
		{
			n2=n2^n1;
			n1=n1^n2;
			n2=n2^n1;

			while (n2 > n1)
			{
				sum1 += n1;
				sum2 += n2;

				n1++;
				n2++;
			}
			System.out.printf("%d ~ %d ������ �� : %d\n", n1, n2, sum1+sum2);
			
		}
		else
		{
			System.out.printf("%d ~ %d ������ �� : %d\n", n1, n2, n1);
		}
		*/
		
		/*
		if (n2 > n1)
		{
			n2=n2^n1;
			n1=n1^n2;
			n2=n2^n1;
		}

		while (n1 > n2)
		{
			sum1 += (n1+n2);
			n1++;
			n2++;
		}
		System.out.printf("%d ~ %d ������ �� : %d\n", n1, n2, sum1);
		*/

		// �ֿ� ���� ����
		int n;			// ���� ������ Ȱ���� ����
		int su1, su2;	//-- ù ��°, �ι��� ����� �Է°��� ��Ƴ� ����
		int result=0;	//-- �������� ��Ƴ� ����
		
		// ���� �� ó��

		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());
		
		// �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1 �� su2 ���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (su1 > su2)
		{
			// �ڸ� �ٲ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su1;
		}

		// �ݺ� ���� ����
		// �ݺ� ������ �����ϱ� ����
		// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		// (��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ�...)
		// �� ���� �ݺ� �������� ����ϰ� �Ǹ�...
		// ���� ó�� �Էµ� ���� Ȯ���� �� ���� ������...)

		n = su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}

		// ��� ���
		System.out.printf(">> %d ~ %d ������ �� : %d\n", su1, su2, result);
	}
}