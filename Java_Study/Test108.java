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

// ���� ����(��ǰ ����, Bubble Sort)

// ���� ��)
// Source Data : 52 42 12 62 60
// Sorted Date : 12 42 52 60 62
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test108
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		42, 52, 12, 62, 60
		== --

		42, 12, 52, 62, 60
			== --
		
		42, 12, 52, 62, 60
				== --
		
		42, 12, 52, 60, 62
					== --
		------------------ 1ȸ��
		12 42 52 60 62
		== --

		*/
		
		/*
		System.out.print("Source Data : ");
		for (int i=0 ; i < a.length ; i++)
		{	
			System.out.printf("%4d",a[i]);
		}

		System.out.println();
		
		for (int i=1 ; i < a.length ; i++ )
		{
			for (int j=0; j < a.length-i ; j++)
			{
				if (a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
				}
			}
		}

		System.out.print("Sorted Data : ");

		for (int i=0 ; i < a.length ; i++)
		{	
			System.out.printf("%4d",a[i]);
		}

		System.out.println();
		*/

		int i, j;
		System.out.print("Source Data : ");
		for (int n : a)
		{	
			System.out.print(n + " ");
		}

		System.out.println();

		// ����
		// �� Bubble sort
		
		for (i=1 ; i < a.length ; i++ )		// ��~~~ i �� �ڿ��� �� ����� �ϳ��� �ٿ��ִ� ����
		{									//			  1   2  3  4					
											
			for (j=0; j < a.length-i ; j++)	// ������ j �� �񱳱��� �ε���
			{								//			0123 012 01 0
				if (a[j] > a[j+1])			// ��������
				{	
					//�ڸ��ٲ�
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
				}
			}
		}
		

		System.out.print("Sorted Data : ");

		for (int n : a)
		{	
			System.out.print(n + " ");
		}

		System.out.println();
	}
}