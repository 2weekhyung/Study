/*===========================================
	���� ����(sort) �˰��� ����
=============================================*/
/*
�� ����
	: �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������,��������)

�� ������ ����
    : ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
	  �� ���� ����... ã�� ����...�˻��� ���ϰ�...

�� ������ ����
    : ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ���� .....
*/

// ���� ���� ����(Seclection Sort)

// �տ��� �� Selection Sort(Test107.java)�� Bubble Sort(Test108.java)�� ������ ����.
//	(�� ���ɿ� ���� ���� �ٰ� : �ݺ����� ������ Ƚ��)
//   ������, ���� Bubble Sort �� ��� �������� ������ ����
//   �Ϲ� Bubble sort �� Selection Sort �� ���� ������ ���� �� �ִ�.

// ���� ������ : 61 15 20 22 30
/*
61 15 20 22 30
15 20 22 30 61 - 1ȸ�� (���� �߻� �� ture) �� ���� ȸ�� ���� ��
15 20 22 30 61 - 2ȸ�� (���� �߻� �� false) �� ���� ȸ�� ���� X
*/

//--==> 1ȸ�� ����... 2ȸ�� ����... �� �� �� �Ҵ���..
//		2ȸ������ ����(�ڸ��ٲ�)�� ���� �Ͼ�� �ʾұ� ������
//		���ʿ��� �߰� ����(�� �̻��� ȸ��)�� ���ǹ��� ������ �Ǵ��Ͽ�
//		�������� �ʴ´�.

// ���� ��)
// Source Data : 10, 50 ,20, 30, 40
// Sorted Date : 10, 20 ,30, 40, 50
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test109
{
	public static void main(String[] args)
	{	

		int[] a = {10, 50 ,20, 30, 40};
		/*
		10 50 20 30 40

		10 50 20 30 40
		1
		0 20 50  30 40
		10 20 30  50 40

		10 20 30 40 50
		------------------------ 1ȸ�� �� ���ҹ߻�

		10 20 30 40 50
		10 20 30 40 50
		10 20 30 40 50
		10 20 30 40 50
		10 20 30 40 50
		*/
		/*
		int i, j;
		System.out.print("Source Data : ");
		for (int n : a)
		{	
			System.out.print(n + " ");
		}

		System.out.println();

		boolean flag = false;
		
		
		for (i=1 ; i < a.length ; i++ )		
		{	
			
											
			for (j=0; j < a.length-i ; j++)	
			{	
				if (a[j] > a[j+1])			
				{	
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];

					flag = true;
					
				}
			}
			
			System.out.println("�ݺ� Ƚ�� : " + i);
			
			if (flag)
			{
				break;
			}

		}
		*/
		
		/*
		System.out.print("Sorted Data : ");

		for (int n : a)
		{	
			System.out.print(n + " ");
		}

		System.out.println();
		*/
		
		
		//����
		// �� ���� Bubble sort
		boolean flag;
		int pass=0;
		
		System.out.print("Source Data : ");
		for (int n : a)
		{	
			System.out.print(n + " ");
		}

		System.out.println();
		
		do
		{
			flag = false;	//-- �̹� ȸ������ �ڸ��ٲ��� �߻����� ���� ���̴�.
			pass++;

			for (int i=0;i<a.length-pass ;i++ )
			{
				// �׽�Ʈ
				//System.out.println("��");

				if (a[i] > a[i+1])
				{
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i+1]^a[i];
					a[i] = a[i]^a[i+1];

					flag = true;
					//-- �� �� �� �̶� ����(�ڸ��ٲ�)�� �߻��ϰ� �Ǹ�
					//   flag ������ true �� ����~!!!
				}
			}
		}
		while (flag);
		//-- flag ������ false ��°���
		//   ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� ���� ����
		//   �� �̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ� ����~!!!
	
		
		System.out.print("Sorted Data : ");

		for (int n : a)
		{	
			System.out.print(n + " ");
		}

		System.out.println();
	}
}

/*
Source Data : 10 50 20 30 40
Sorted Data : 10 20 30 40 50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/