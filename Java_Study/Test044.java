/*=========================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ��� �ǽ� �� ����
=========================================*/

/*
�� �ݺ����� ����

   �־��� ������ �������� ���
   ������ ������ ������ �ݺ� ���� �ϴٰ�
   ���ǽ��� ���������� �Ǵ� ������ ����,
   �ݺ� ������ �ߴ��ϴ� �����̴�.
   �̷��� �ݺ������� ��while��, ��do~while��, ��for���� ���� ������
   �ݺ��� ��� ���� ��break��, ��continue������ ����ϴ� ��찡 �ִ�.

�� while ��
   
   ���ǽ��� ���� ���Ͽ�
   ���ǽ��� ó�� ����� ���� ���, Ư�� ������ �ݺ� �����ϴ� ��������
   �ݺ� Ƚ���� ������ ���� ���� ��쳪
   �ݺ� Ƚ���� ���� ��� �ַ� ����Ѵ�.
   while ���� ������ ���� ���� ���
   �ݺ��� Ŀ�� �� �� ���� ���� ���� ���� �� �ִ�.

�� while ���� ���� �� ����

   while(���ǽ�)
   {
	   ���๮;
   }

*/

// 1 ���� 100 ������ ���� �߿���
// ¦������ ���� ����Ͽ�, ������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ���ǹ��� ������� �ʵ��� �ϸ�,
// while �ݺ����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// 1 ���� 100 ������ �� �� ¦���� �� : xxx
// ����Ϸ��� �ƹ� Ű��...

// ���� �ν� �� �м�
// 2 + 4 + 6 + 8 + ... + 100
// - �ʱⰪ : 2
// - ������ : 2
// - �Ѱ谪 : 100

public class Test044
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int n=2;
		int sum=0;

		// ���� �� ó��(�ݺ� ����)
		while (n<=100)
		{
			sum+=n;	//-- sum ���� n ��ŭ ����~!!!
			n+=2;	//-- n ���� 2��ŭ ����
		}

		// ��� ���
		System.out.println("1���� 100������ �� �� ¦���� �� : " + sum);
	}	
}

// ���� ���

/*
1���� 100������ �� �� ¦���� �� : 2550
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/