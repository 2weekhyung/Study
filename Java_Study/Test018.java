/*=========================================
	���� �ڹ��� �⺻ ���α׷��� ����
	- ������ �ڷ���
	- �ڹ��� �⺻ ����� : System.util.Scanner
=========================================*/

// �� java.utill.Scanner
//	  �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ� (�����ڿ� ���� ���е� ��)
//	  ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//	  �ۼ��� ���� ��ū�� ��next()�� �޼ҵ� ���
//	  �ٸ� ����(�ڷ�����) ������ ��ȯ�� �� �ִ�.

//import java.util.Scanner;
//import java.util.*;		//-- �ٶ��� ���� �ʴ�.

public class Test018
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		// ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�̸� ���� ���� ���� �Է�(���鱸��) : ");
		//-- ""������ 90 80 70"

		//- ����ڰ� �Է��� �����͸� ������ ������ ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// - ���� ����
		tot = kor + eng + mat;


		// ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + tot);

		
	}
}

// ���� ���
/*
�̸� ���� ���� ���� �Է�(���鱸��) : ���ѿ� 90 80 70

>> �̸� : ���ѿ�
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/