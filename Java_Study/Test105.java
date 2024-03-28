/*===========================================
	���� ���� �޷� ����
	- ������ ���� ����� ���α׷��� �����Ѵ�.
=============================================*/

// ���� ��)
// ���������� �Է��ϼ��� : 2023
// �������� �Է��ϼ���   : 9

/*
	[ 2023�� 9�� ]
�� �� ȭ �� �� �� ��
====================
				1  2
3  4  5  6  7  8   9
10 11 12 13 14 15 16
17 18 19 20 21 22 23
24 25 26 27 28 29 30
====================
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;
import java.io.*;

public class Test105
{
	public static void main(String[] args) throws IOException
	{	/*
		// �ֿ亯�� ����
		int year;
		int month;
		int totalDay;
		int yoil;
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		Scanner sc = new Scanner(System.in); 
		
		// ���� �Է�
		
		
			System.out.print("���������� �Է��ϼ��� : ");
			year = sc.nextInt();
		
		
		
		// �� �Է�
		
		
			System.out.print("�������� �Է��ϼ���   : ");
			month = sc.nextInt();
		
		
		// �� ��¥ ���
		totalDay = (year-1) * 365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
 
		if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0)
		{
			months[1] = 29;
		}
		else
		{
			months[1] = 28;
		}

		for (int i=0 ; i < month-1 ; i++ )
		{
			totalDay += months[i];
		}

		totalDay += 1;

		// ���� ���

		yoil = totalDay % 7;

		// tpotalDay(�� ��¥) % 7 �� �������� 0 �� 1 �� 2 ȭ 3 �� 4 �� 5 �� 6 ��

		// ���

		System.out.println();
		System.out.printf("        [ %d�� %d�� ]",year,month);
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("  ==========================");
		
		// ������ ���� ������ ���� ���� ���ϱ��� ���� ��� �Ͽ����̸� ������� ����
		for (int i=1 ; i<= yoil ; i++ )
		{
			System.out.print("    ");
		}
		
		// �ش� ���� ��¥���� ��¥�� ������ �Ϸ羿 ���� ��Ű�� �Ͽ����� �Ǹ� ����
		for (int i=1 ; i<= months[month-1] ; i++ )
		{	
			System.out.printf("%4d",i);
			
			yoil++;

			if (yoil % 7 == 0)
			{
				System.out.println();
			}
			
		}
		// �� �� �� �����ؾ� ������, �Ͽ��Ϸ� ������ �ι� ����Ǵϱ� ���� ����
		
		if (yoil % 7 == 0)
		{
			
		}

		else
		{
			System.out.println();
		}
		

		System.out.println("  ==========================");
		*/

		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �迭 ���� �� �ʱ�ȭ
		//-- �� ���� ����ִ� ������ ��¥(�� ���� �ִ� ��¥)
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// �迭�ε��� 0   1   2   3   4   5   6   7   8   9   10   11
		// ��         1   2   3   4   5   6   7   8   9   10  11   12

		//Ȯ��
		//System.out.println(days.length)
		//--==>> 12

		//�ֿ� ���� ����
		int nalsu, y, m, w;	//-- �� �� , ��, ��, ����

		do
		{
			System.out.print("���������� �Է��ϼ���   : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
		//-- �Է¹��� ������ 1���� ���� ��� �ٽ� �Է¹ޱ�~!!!

		do
		{
			System.out.print("�������� �Է��ϼ���     : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		//-- �Է¹��� ���� 1 ���� �۰ų� 12���� ū ��� �ٽ� �Է¹ޱ�~!!!

		//----------- ������� �����ϸ� ��ȿ�� ������ ���� ����ڷκ��� �Է¹��� ����

		// �Է¹��� ������ �ش��ϴ� 2���� ������ �� ���
		if (y%4==0 && y%100!=0 || y%400==0)	// �����̶��....
		{
			days[1] =29;
		}
		//else ������
		// ���� days �迭�� 1��° ���(2��)�� 28�Ϸ� �����Ǿ� �ִ� �����̱� ������
		// ������ ������ ������ �ȴ�.

		// 1�� 1�� 1�� ~ �Է¹��� ������ ���� �⵵ 12�� 31�� ������ �� �� ���
		nalsu = (y-1) * 365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// �Է¹��� ����(�ش� ����) 1�� 1�� ~ �Է��� ���� ���� �������� �� �� ���
		for (int i=0 ; i<(m-1) ; i++ )
		{
			nalsu += days[i];
		}
		
		// �Է¹��� ���� 1���� �� �� ���� ����
		nalsu += 1;		// ++nalsu;

		//------------------------------------ ������� �����ϸ� ��� �� ���� ���� ���� ó�� �Ϸ�

		// ���� Ȯ��
		//-- �Է¹��� ���� �Է¿��� 1���� ���� �������� Ȯ���ϱ� ���� ����
		w = nalsu % 7;
		//-- w:0 �� �Ͽ���
		//-- w:1 �� ������
		//-- w:2 �� ȭ����
		//-- w:3 �� ������
		//-- w:4 �� �����
		//-- w:5 �� �ݿ���
		//-- w:6 �� �����
		
		// Ȯ��
		//System.out.println("w : " + w);
		//--==>> ���������� �Է��ϼ���   : 2024
		//		 �������� �Է��ϼ���   : 5
		//		  w : 3
		//		 2024�� 5�� 1���� ������(3)�̶�� �ǹ�

		//-------------------------------------------- ������� �����ϸ� �ش� ���� �ش� ���� 1���� ������������ Ȯ�� �Ϸ�

		// ���(�޷� �׸���)

		System.out.println();		//-- ����
		System.out.printf("\t[ %d�� %d��]",y,m);
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");

		// Ư�� ���Ϻ��� 1���� ����� �� �ֵ��� ���� �߻�(����)
		for (int i=1 ; i<= w ; i++ )
		{
			System.out.print("    ");
		}

		// Ȯ��
		//System.out.printf("%4d", 1);

		//�ش� ��(�Է��� ��)�� ��¥�� ��µ� �� �ֵ��� �ݺ��� ����
		for (int i=1; i<=days[m-1]; i++ )
		{
			System.out.printf("%4d", i);
			w++;
			//-- �ݺ����� ���� ��¥�� ó���ϴ� ����
			//   �׸�ŭ�� ���ϵ� �Բ� ������ �� �ֵ��� ó��~!!!

			// �Ͽ����� �����Ϸ��� ���...
			// (��, �̹��� ����ϰ��� �ϴ� ��¥�� �Ͽ����� ���....)
			if (w % 7 == 0)
			{
				//����
				System.out.println();
			}
		}
		// ���� ������ ��¥�� ��� ������ ��� ä���� ���
		// (��, ����ϱ��� ���� ��ü ����� �̷������ �ܿ�)
		// �̹� �Ͽ��� ������ �̷������ ������
		// �� ��쿡�� �߰� ������ ���� �ʵ��� ó��~!!!
		if (w%7 != 0)
		{
			System.out.println();			//-- ����
		}

		System.out.println("============================");
	

	}
}

// ���� ���

/*
���������� �Է��ϼ��� : 2023
�������� �Է��ϼ���   : 9

        [ 2023�� 9�� ]
  ��  ��  ȭ  ��  ��  ��  ��
  ==========================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  ==========================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���������� �Է��ϼ���   : 2023
�������� �Է��ϼ���     : 10

        [ 2023�� 10��]
  ��  ��  ȭ  ��  ��  ��  ��
============================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/