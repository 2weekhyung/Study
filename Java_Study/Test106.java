/*===========================================
	���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
=============================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����

	�� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	   123456 - 1234567 (�ֹι�ȣ)
	   ******   ******	---------- �� �ڸ����� ���ϱ�
	   234567   892345  (�� �ڸ����� ������ ��)

	�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5
		�� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15 = 217

	�� ������ ������� 11�� ������ ������������ ���Ѵ�.
		19 �� ��(X)
		-------
	11 | 217
		 11
		------
		107
		 99
		 ---
		 8 �� ������(��)

	�� 11���� ������(8)�� �� ������� ���Ѵ�.

	11 - 8 �� 3

	�̰� ������ �ڸ��� �����ؾ� ��ȿ�� �˻�

	�� ���� ó�� �������� �������� 0�� ��� �� 11 - 0 �� 11
	   ���� ó�� �������� �������� 1�� ��� �� 11 - 1 �� 10

	   �̸� �ٽ� 10���� ������ �������� ���Ѵ� 11 �� 1
	   										   10 �� 0
	
	�� ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
	   ��ġ�ϴ����� ���θ� ���Ͽ� Ȯ���Ѵ�.

	   ��ġ �� ��ȿ�� �ֹι�ȣ
	   ����ġ �� �߸��� �ֹι�ȣ
		
*/

// ���� ��)
// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456 - 12345678 //-- �Է� ���� �ʰ�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456 -123456 //-- �Է� ���� �̴�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ�Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 750615-1252085 //-- ��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ�Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 750615-1252085 //-- �߸��� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ�Ű�� ��������...

// �� ���� �ذ��� ���� �߰� ��~!!!

//	  �迭.length	�� �迭�� ����(�迭���� ����) ��ȯ
//    ���ڿ�.length() �� ���ڿ��� ���� ��ȯ
//    ���ڿ�.substring(m , n)�� ���ڿ� ����
//    ���ڿ� m��° ��ġ���� n-1��° ��ġ���� ����(�ε����� 0����)
//
//	  ���ڿ�.substring(m) �� ���ڿ� ����
//    ���ڿ� m��° ��ġ���� ���ڿ��� ������ ����(�ε����� 0����)

import java.util.Scanner;
import java.io.*;

public class Test106
{
	public static void main(String[] args) throws IOException
	{	
		
		
		/*

		//�׽�Ʈ
		//String strTemp = "������";
		//System.out.println(strTemp.length());
		//--==>> 3

		//String strTemp = "������������������";
		//System.out.println(strTemp.length());
		//--==>> 9

		//String strTemp = "���ع��� ��λ��� ������ �⵵��";
		//System.out.println(strTemp.length());
		//--==>> 17 -���� ����

		//String strTemp = "study-hard";
		//System.out.println(strTemp.length());
		//--==>> 10
		
		String strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		//--== >> MOPQ

		//System.out.println(strTemp.substring(13,53));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//		 StringIndexOutOfBoundsException

		System.out.println(strTemp.substring(13));
		//--==>> NOPQRSTUVWXYZ
		String idNum;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : ");
		idNum = sc.next();
		
		if (idNum.length() != 14)
		{
			System.out.println(">>�Է� ����~!!!");
			return;
		}

		int[] arr1 = {2, 3, 4, 5, 6, 7,0, 8, 9, 2, 3, 4, 5};
		int[] arr2 = new int[13];

	
		arr2[0]= Integer.parseInt(idNum.substring(0,1));
		
		
	
		
	
		
		
		
		

		
		
		for (int i=0 ; i < arr2.length ; i++ )
		{	if (i != 6)
			{
				arr2[i] = Integer.parseInt(idNum.substring(i,i+1));
			}
			
		}

		
		

		int gob=0;

		for (int i=0; i < arr1.length ; i++ )
		{
			gob += arr1[i] * arr2[i];
		}
		
		int namuji;
		namuji = gob % 11;

		if (namuji == 0)
		{
			namuji = 10;
		}

		if (namuji == 1)
		{
			namuji = 11;
		}

		if ((11-namuji) == Integer.parseInt(idNum.substring(13,14)))
		{
			System.out.println("��Ȯ�� �ֹι�ȣ~!!!");
		}
		else
		{
			System.out.println("�߸��� �ֹι�ȣ~!!!");
		}
		*/
		
		// BufferedReader �ν��Ͻ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�Է¹��� �ֹι�ȣ(���ڿ� ����)�� ��Ƶ� ���� ����
		String str;

		//���Ŀ� ���� �ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �� �迭 ���·� ����
		int[] chk = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//			7 5 0 6 1 5 - 1 2 5 2 0 8 5
		//					  ----
		//					check~!!!

		// ���� ���� �� ������ ��(�� ������ ����� ���س�����...)
		//				-----
		int tot = 0;

		System.out.print("�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : ");	// "750615-1252085"
		//Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> �Է� ����~!!!");
			return; //-- �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}

		//�׽�Ʈ
		System.out.println("�ڸ��� ����~!!!");
		
		//ex) "750615-1252085"
		for (int i=0 ; i < 13 ; i++ )		// -- i �� 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			//�׽�Ʈ
			//System.out.print(i + " ");
			//--==>> 0 1 2 3 4 5 6 7 8 9 10 11 12
			
			// i�� 6�� ������ �޺κ� �����ϰ� ����ض�
			if (i == 6)
			{
				continue;		//-- �޺κ� �����ϰ� ����ض�~!!!
			}

			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));		//-- �޺κ�
		}

		// �׽�Ʈ
		//System.out.println("tot" + tot);
		//--==> �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 750615-1252085
		//�ڸ��� ����~!!!
		//tot182

		//---------------------------- ������� �����ϸ� ���� ������ ��� �踦 ��� ���� ��Ȳ�̸�
		//							   ��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		//							   ���� tot�� ����ִ� ���°� �ȴ�.
		
		int su = 11 - tot % 11;

		//--------------------- ������� �����ϸ� ���� ������ ��� �긦 ��� ���� ��Ȳ�̸�
		//						su�� ���� ���� ����� �� �ڸ��� ������ ���� ���
		//						�ֹι�ȣ ������ �ڸ��� ���ڿ� �񱳸� ������ �� ���� ��Ȳ.
		
		su = su % 10;		// su %= 10;
		
		// �ֹι�ȣ�� ������ �ڸ��� ���� ����� ���ٸ� �� ��Ȯ�� �ֹι�ȣ
		//										  �ƴ϶�� �� �߸��� �ֹι�ȣ

		if(su == Integer.parseInt(str.substring(13)))
		{
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		}
		else
		{
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");
		}
		

		
	}
}
// ������

/*
�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 121212-1234567
�ڸ��� ����~!!!
>> ��Ȯ�� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-123456
>> �Է� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-12345678
>> �Է� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/