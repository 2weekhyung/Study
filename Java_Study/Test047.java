/*=========================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ��� �ǽ� �� ����
=========================================*/

// 1���� 100���� ������ ���� ���ϵ�...
// 10�� ����� �� �� ����...
// �� ���������� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 1 ~ 10 ������ �� : xx
// 1 ~ 20 ������ �� : xxx
// 1 ~ 30 ������ �� : xxx
//	 :
// 1 ~ 100 ������ �� : xxx
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test047
{
	public static void main(String[] args)
	{	
		/*
		int n = 1;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		int sum7 = 0;
		int sum8 = 0;
		int sum9 = 0;
		int sum10 = 0;

		while (n<=100)
		{
			if (n<=10)
			{
				sum1 += n;
			}
			if (n<=20)
			{
				sum2 += n;
			}
			if (n<=30)
			{
				sum3 += n;
			}
			if (n<=40)
			{
				sum4 += n;
			}
			if (n<=50)
			{
				sum5 += n;
			}
			if (n<=60)
			{
				sum6 += n;
			}
			if (n<=70)
			{
				sum7 += n;
			}
			if (n<=80)
			{
				sum8 += n;
			}
			if (n<=90)
			{
				sum9 += n;
			}
			if (n<=100)
			{
				sum10 += n;
			}
			n++;
		}

		System.out.println("1 ~ 10 ������ �� : " + sum1);
		System.out.println("1 ~ 20 ������ �� : " + sum2);
		System.out.println("1 ~ 30 ������ �� : " + sum3);
		System.out.println("1 ~ 40 ������ �� : " + sum4);
		System.out.println("1 ~ 50 ������ �� : " + sum5);
		System.out.println("1 ~ 60 ������ �� : " + sum6);
		System.out.println("1 ~ 70 ������ �� : " + sum7);
		System.out.println("1 ~ 80 ������ �� : " + sum8);
		System.out.println("1 ~ 90 ������ �� : " + sum9);
		System.out.println("1 ~ 100 ������ �� : " + sum10);
		*/

		int n=1, sum=0;
		//--n �� 1 ���� 1�� ������ ����
		//	sum �� �������� ��Ƴ� ����

		while (n<=100) // 1 2 3 4 ... 100 �� 100�� �ݺ�
		{
			sum += n;

			if (n%10==0)
			{
				System.out.printf("1 ~ %d ������ �� : %d\n", n, sum);
			}

			n++;
		}


	}
}