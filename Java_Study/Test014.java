/*=========================================
	���� �ڹ��� �⺻ ���α׷��� ����
	- ������ �ڷ���
	- �ڹ��� �⺻ ����� : BufferedReader Ŭ����
=========================================*/

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
//	�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : ���ѿ�
//	���� ���� �Է� : 90
//	���� ���� �Է� : 80
//	���� ���� �Է� : 70

// ===[���]===
// �̸� : ���ѿ�
// ���� : 240
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		//���� Ǯ���� �ڵ�
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor;
		int eng;
		int mat;


			


		System.out.print("�̸��� �Է��ϼ��� : ");
		
		name = br.readLine();

		System.out.print("���� ���� �Է� : ");

		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");

		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");

		mat = Integer.parseInt(br.readLine());

		 

		System.out.println("\n ===[���]===");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + sum);
		*/
		

// ���� ���
/*
�̸��� �Է��ϼ��� : ���ѿ�
���� ���� �Է� : 90
���� ���� �Է� : 90
���� ���� �Է� : 90

 ===[���]===
�̸� : ���ѿ�
���� : 270
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

	// �Բ� Ǯ���� �ڵ�

	// �ֿ� ���� ����

	// BufferedReader �ν��Ͻ� ����
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	String strName; //-- �̸� ����
	int nKor, nEng, nMat; //-- ��������, ��������, �������� ����
	int nTot; // ���� ����
	String strTemp; //-- ���ڿ� �ӽ� ���� ����


	// ���� �� ó��
	// - ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
	System.out.print("�̸��� �Է��ϼ���: ");

	// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
	strName = br.readLine();

	// - ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
	System.out.print("���� ���� �Է� : ");

	// ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
	strTemp = br.readLine();
	
	// - ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
	nKor = Integer.parseInt(strTemp);

	// - ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
	System.out.print("���� ���� �Է� : ");

	// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
	strTemp= br.readLine();

	// - ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
	nEng = Integer.parseInt(strTemp);

	// - ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
	System.out.print("���� ���� �Է� : ");

	// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
	strTemp= br.readLine();

	// - ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
	nMat = Integer.parseInt(strTemp);

	// - �� ���� ������ ����ִ� ������(����ڰ� �Է��� ������)����
	//	 �����Ͽ� ������ �����ϰ� �� ����� ���� ������ ��Ƴ���
	nTot = nKor + nEng + nMat;



	// ��� ���
	System.out.println("\n=====[���]====");
	//System.out.println("�̸� : " + strName);
	System.out.printf("�̸� : %s\n", strName);
	//System.out.println("���� : " + nTot)
	System.out.printf("���� : %d\n", nTot);
	
	// ���� ���
	/*
	�̸��� �Է��ϼ���: ���ѿ�
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

=====[���]====
�̸� : ���ѿ�
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
	*/

	}
}