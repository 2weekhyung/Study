/*=======================================
 ���� Ŭ���� ��� ����
 - �������̽�(Interface)
 ========================================*/

 // �� �ǽ� ����
 //    ���� ó�� ���α׷��� �����Ѵ�.
 //    �� �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 11
// �ο� �� �Է�(1~10) : 0
// �ο� �� �Է�(1~10) : 2

// 1��° �л��� �й� �̸� �Է�(���� ����) : 2309123 ��ٽ�
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 230925 �赿��
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 60

// 2309123 ��ٽ� 90  100  85 ���� ���.xx
//				  ��  ��   ��
// 2309123 �赿�� 85  70   60 ���� ���.xx
//				  ��  ��   ��

// ����Ϸ��� �ƹ� Ű�� ��������
// 90 �̻� �� ��
// 80 �̻� 90 �̸� �� ��
// 70 �̻� 80 �̸� �� ��
// 60 �̻� 70 �̸� �� ��
// 60 �̸� (�� ��) �� ��

import java.util.Scanner;

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record
{
	String hak, name;		//-- �й� �̸�
	int kor, eng, mat;		//-- ����, ����, ��������
	int tot;				//-- ����
	double avg;				//-- ���
}

// �������̽�
interface Sungjuk
{
	public void set();		// �ο� ����
	public void input();	// ������ �Է�
	public void print();	// ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SunghukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		String grade;

		switch (score/10)
		{
		case 10: case 9: grade="��"; break;
		 case 8: grade="��"; break;
		 case 7: grade="��"; break;
		 case 6: grade="��"; break;
		 default: grade="��"; break;
		}

		return grade;
	}

	public void set()
	{	
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];
	}

	public void input()
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println();
	
		for (int i=0 ; i < rec.length ; i++ )
		{	
			rec[i] = new Record();
			
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot/3.0;

		}
	}

	public void print()
	{
		for (int i=0 ; i < rec.length ; i++ )
		{
			System.out.printf("\n%s %s %d %3d %3d %6d   %.2f\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%16s %2s %2s\n",panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));
		}
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test121
{
	public static void main(String[] args)
	{
		Sungjuk ob;

		// ���� �ذ� �������� �ۼ��ؾ� �� ���� �� ��ü ����
		ob = new SunghukImpl();

		ob.set();
		ob.input();
		ob.print();
	}
}

// ���� ���

/*
�ο� �� �Է�(1~10) : 11
�ο� �� �Է�(1~10) : 0
�ο� �� �Է�(1~10) : 2

1��° �л��� �й� �̸� �Է�(���� ����) : 2309123 ��ٽ�
���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
2��° �л��� �й� �̸� �Է�(���� ����) : 2309345 �赿��
���� ���� ���� ���� �Է�   (���� ����) : 85 70 60

2309123 ��ٽ� 90 100  85    275   91.67
               ��  ��  ��

2309345 �赿�� 85  70  60    215   71.67
               ��  ��  ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/