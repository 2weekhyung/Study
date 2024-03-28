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

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� ó���Ѵ�.

// 90�� �̻�			: A
// 80 �� �̻� 90�� �̸� : B
// 70 �� �̻� 80�� �̸� : C
// 60 �� �̻� 70�� �̸� : D
// 60 �� �̸�			: F

// ��, BufferedReader �� Ȱ���� �����͸� �Է¹��� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// �̸� �Է� :
// ���� ���� :
// ���� ���� :
// ���� ����:
//
// >> ����� �̸��� ����� �Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240 �̰�, ����� 80.00 �Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������

import java.io.*;
public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		String name;
		int kor;
		int eng;
		int mat;
		int sum;
		double avg;
		char g;

		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		
		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		sum = kor + eng + mat;
		avg = sum / 3.0;

		System.out.println();

		System.out.printf("����� �̸��� %s�Դϴ�\n ", name);
		System.out.printf("���� ������ %d,\n", kor);
		System.out.printf("���� ������ %d,\n", eng);
		System.out.printf("���� ������ %d,\n", mat);
		System.out.printf("������ %d�̰�, ����� %.2f�Դϴ�\n", sum, avg);

		if (avg >= 90)
		{
			System.out.println("����� A�Դϴ�.");
		}
		else if (avg >= 80)
		{
			System.out.println("����� B�Դϴ�.");
		}
		else if (avg >= 70)
		{
			System.out.println("����� C�Դϴ�.");
		}
		else if (avg >= 60)
		{
			System.out.println("����� D�Դϴ�.");
		}
		else // 60 �̸��� ���
		{
			System.out.println("����� F�Դϴ�.");
		}
		*/

		// 1. ����ڷκ��� �̸��� �Է¹޴´�.
		System.out.print("�̸� �Է� : ");
		String strName = br.readLine();

		// 2. ����ڷκ��� ����, ����, ���� ������ �Է¹޴´�.
		System.out.print("���� ���� : ");
		String strKor = br.readLine();

		System.out.print("���� ���� : ");
		String strEng = br.readLine();

		System.out.print("���� ���� : ");
		String strMat = br.readLine();
		
		// 3. ���ڿ� ���·� �Է¹��� ���� ������ ���� ���·� ��ȯ�Ѵ�.
		int nKor = Integer.parseInt(strKor);
		int nEng = Integer.parseInt(strEng);
		int nMat = Integer.parseInt(strMat);

		// 4. ��� ������ ���� ������ ����� ���� �Ѵ�.
		int nTot = nKor + nEng + nMat;		//-- ����
		double fAvg= nTot / 3.0;			//-- ��� check~!!!

		// 5. ��޿� ���� ���� �˻縦 �����Ѵ�.
		char grade;		//-- ���

		if (fAvg >= 90)
		{
			grade = 'A';
		}
		//else if (fAvg >= 80 && fAvg < 90)
		else if (fAvg >= 80)		//-- ����� 90�� �̸� ���� ����
		{
			grade = 'B';
		}
		else if (fAvg >= 70)		//-- ����� 80�� �̸� ���� ����
		{
			grade = 'C';
		}
		else if (fAvg >= 60)		//-- ����� 70�� �̸� ���� ����
		{
			grade = 'D';
		}
		else // check~!!! �������� �ǵ����̸� else if�� �ƴ϶� else ������
		// else if �� �����ٰ� �ϸ�, char grade = 'F'; ������ �̸� ������ �ʱ�ȭ ����
		{
			grade = 'F';
		}

		// 6. ���� ��� ���
		System.out.printf("\n>> ����� �̸��� %s �Դϴ�.\n", strName);
		System.out.printf(">> ���� ������ %s,\n", strKor);
		System.out.printf(">> ���� ������ %s,\n", strEng);
		System.out.printf(">> ���� ������ %s,\n", strMat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", nTot, fAvg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);






	}
}

// ���� ���

/*
�̸� �Է� : ���ѿ�
���� ���� : 20
���� ���� : 30
���� ���� : 10

����� �̸��� ���ѿ��Դϴ�
 ���� ������ 20
���� ������ 30
���� ������ 10
������ 60�̰�, ����� 20.00�Դϴ�
����� F�Դϴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/