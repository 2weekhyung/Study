/*=========================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ���(for��) �ǽ� �� ����
=========================================*/

// continue �ǽ�

// continue �� Ȱ���Ͽ�
// ������ ���� ó���� ����� �̷���� �� �ֵ���
// ���α׷��� �����Ѵ�.

// ���� ��)
// 1 : 1
// 3 : 4
// 5 : 9
// 7 : 16
// 9 : 25
//	:
//	:
// 99 : 2500
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test065
{
	public static void main(String[] args)
	{
		int odd=1;
		int sum=0;
		/*
		if (odd % 2 != 0)
		{
			for (odd = 1; odd <= 100 ; odd++)
			{
				sum += odd;
				odd++;
				System.out.printf("%d : %d", (odd-1), sum);
				System.out.println();
			}
		}
		*/

		for (odd=1; odd <= 100 ; odd++)
		{	
			if (odd % 2 == 0)		//-- n�� ¦�����...
			{
				continue;			//-- (�޺κ� �����ϰ�) + ����ض�
			}

			sum += odd;				//-- �޺κ�
		

			System.out.printf("%d : %d", (odd), sum);	//-- �޺κ�
			System.out.println();						//-- �޺κ�

			
		}
	}
}