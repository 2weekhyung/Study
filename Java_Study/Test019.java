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

import java.util.*;

public class Test019
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		// ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(��,�� ����) : ");
		// �̸�,����,����,����(��,�� ����) : ä�ټ�,90,80,70

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//				-----------
		//			"ä�ټ�,90,80,70"
		// new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//							.�����ڻ��();
		//										"\\s*,\\s*"
		//										  \s*,\s*
		// ���
		// Ȳ�ݵ����������������ϴ�

		//- ����ڰ� �Է��� �����͸� ������ ������ ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		// ��� ���
		System.out.println("\n>> �̸� : " + name);
		System.out.println(">> ���� : " + tot);


	}
}

// ���� ���
/*
�̸�,����,����,���� �Է�(��,�� ����) : ���ѿ�,90,80,70

>> �̸� : ���ѿ�
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/