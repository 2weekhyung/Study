/*=========================================
	���� �ڹ��� ���� �� Ư¡ ����
=========================================*/

// �� ����
// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� �ﰢ�� ���� ���ϴ� ���α׷� ��
// - �ﰢ���� �غ� �Է� : 5
// - �ﰢ���� ���� �Է� : 3

//>> �غ��� 5, ���̰� 3�� �ﰢ���� ���� : xxx
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �ν� �� �м�
//	  �ﰢ���� ���� = �غ� * ���� / 2
//	  ����ڷκ��� ������ �Է� �޾� ó�� �� BufferedReader Ȱ��
//	  BufferedReader �� ������ ���?? �� �� ���??
//									-------------


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		// ���� Ǯ���� �ڵ�
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a; // �غ�
		int b; // ����
		double c; // ����
		
		System.out.println(" �� �ﰢ�� ���̸� ���ϴ� ���α׷� ��");
		
		System.out.print("�ﰢ���� �غ� �Է�: ");

		a = Integer.parseInt(br.readLine());

		System.out.print("�ﰢ���� ���� �Է�: ");

		b = Integer.parseInt(br.readLine());

		System.out.print("\n");

		c = a * b / 2.0;

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� %.2f:\n", a, b, c);

		/*

// ���� ���
/*
 �� �ﰢ�� ���̸� ���ϴ� ���α׷� ��
�ﰢ���� �غ� �Է�: 5
�ﰢ���� ���� �Է�: 3

>> �غ��� 5, ���̰� 3�� �ﰢ���� ���� 7.50:
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . ..
*/

	    // �Բ� Ǯ���� �ڵ�
		
		// �ֿ� ���� ����

		// BufferedReader �ν��Ͻ� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �غ�, ����
		int underLength, height; //-- �غ� ����
		double area;			 //-- ����	check~!!!

		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.println(" �� �ﰢ���� ���� ���ϴ� ���α׷� ��");
		System.out.print("- �ﰢ���� �غ� �Է� : ");

		// �� ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ �� ���� underLength �� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());
		
		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("- �ﰢ���� ���� �Է�");

		// �� ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ �ĸ� ���� height �� ��Ƴ���
		height = Integer.parseInt(br.readLine());

		// �� �ﰢ���� ���� ���ϴ� ���� ó��
		//	  �ﰢ���� ���� = �غ� * ���� / 2;
		// area = underLength * height / 2;
		//		������		������	  ������
		//		-------------------------------
		//				������		/ ������	�� ���� ��� ����
		//											(�� ���� ���ϰ� �������� ����)

		area = underLength * height / 2.0;	// check~!!!
		//		������		������	�Ǽ��� �� �Ǽ� ��� ����

		// �� �Ǽ� �ڷ����� ��������� ������ ��������
		//	  �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//	  ������ ��2���� �ƴ�, �Ǽ������� ��2.0������ ������ ������ �����ϰ� �Ǹ�
		//	  �� ������ �Ǽ� ������� ó���ȴ�.

		// area = (double)underlength * height / 2;
		// area = underlength * (double)height / 2;
		// area = (double)(underLength * height) / 2;
		// area = (double)(underLength * height / 2); ---- (X)

		// ��� ����
		//System.out.println(); // ����
		//System.out.print(); //- ���� �߻�(������ ����)
		
		System.out.printf("\n>> �غ��� %d, ���̰� %d�� �ﰢ���� ���� %.2f:\n", underLength, height, area);




	}
}

// ���� ���

/*
 �� �ﰢ���� ���� ���ϴ� ���α׷� ��
- �ﰢ���� �غ� �Է� : 5
- �ﰢ���� ���� �Է�3

>> �غ��� 5, ���̰� 3�� �ﰢ���� ���� 7.50:
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/