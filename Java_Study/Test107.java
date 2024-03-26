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

// ���� ����(Seclection Sort)

// ���� ��)
// Source Data : 52 42 12 62 60
// Sorted Date : 12 42 52 60 62
// ����Ϸ��� �ƹ� Ű�� ��������...
public class Test107
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};

		/*
		52, 42, 12, 62, 60
		==  -- 

		42 52   12
		==		--
		
		*/
		/*
		System.out.print("Source Data : ");
		for (int i=0 ; i < a.length ; i++)
		{	
			System.out.printf("%4d",a[i]);
		}

		System.out.println();
		
		for (int i=0 ; i < a.length-1 ; i++ )
		{
			for (int j=i+1 ; j < a.length ; j++)
			{
				if (a[i] > a[j])
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}

		System.out.print("Source Data : ");

		for (int i=0 ; i < a.length ; i++)
		{	
			System.out.printf("%4d",a[i]);
		}

		System.out.println();
		
		*/

		int i, j;
		
		System.out.print("Source Data : ");

		/*
		for (i=0 ; i < a.length ; i++)
		{	
			System.out.print(a[i] + " ");
		}

		System.out.println();
		//--==>> Source Data :   52  42  12  62  60
		*/

		// ���� for��(foreach ����)
		for (int n : a )
		{
			System.out.print(n + " ");
		}
		System.out.println();
		//--==>> Source Data : 52 42 12 62 60

		// ����
		// �� Seclection Sort
		for (i=0; i<a.length-1 ; i++ )		// ��~~~~~~~ �� �񱳱��� ������ (0			1			2			3)
		{
			for (j=i+1 ; j<a.length ; j++ )	// ������ �� �񱳴�� ������(1 2 3 4) (2 3 4)     (3 4)			(4)
			{
				// ũ���
				if (a[i] > a[j])				// �������� ����
				//if (a[i] < a[j])				// ��������
				{
					// �ڸ� �ٲٱ�
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}

		//������
		System.out.print("Sorted Data : ");
		/*
		for (i=0 ; i<a.length ; i++ )
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/
		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();

		
		
	}
}

/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/