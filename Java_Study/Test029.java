/*=========================================
	���� ������(Operator) ����
	- ���� ������ == ���� ������
=========================================*/

// ����ڷκ����� ������ ���� �ϳ��� �Է¹޾�
// ���ĺ� �빮���̸� �ҹ��ڷ�...
// ���ĺ� �ҹ����̸� �빮�ڷ�...
// ���ĺ��� �ƴ� ��Ÿ ���ڶ�� �� ���ڸ� �״��...
// ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� ���� �Է� : A
// A �� a
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : b
// b �� B
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : 7
// 7 �� 7
// ����Ϸ��� �ƹ� Ű�� ��������...

/*
											���ĺ� �빮�ڵ� �ҹ��ڵ� �ƴ� ��Ȳ

���ĺ��빮�� ? ���ĺ��ҹ��ڷκ�ȯ : (���ĺ��ҹ��� ? ���ĺ��빮�ڷκ�ȯ : �ִ±״��);
									-------------	------------------	 -----------
------------	-----------------	------------------------------------------------
	1					2								3
*/
import java.io.*;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int i;
		int b;
		char c;

		System.out.print("�� ���� �Է� : ");
		i = br.read();
		
		b = (65 <= i && i <= 90) ? (i + 32) : ((97 <= i && i <= 122) ? (i -32) : (i));
		c = (char)b;

		System.out.printf("%c �� %c\n", (char)i, c);
		

		char temp;

		System.out.print("�� ���� �Է� : ");
		temp = (char)System.in.read();

		//System.out.println("�Է¹��� �� Ȯ�� : " + temp);

		// �빮��? �빮�� �ƴ�?
		// temp == 'A' �� 65
		// temp == 'B' �� 66
		// temp == 'C' �� 67
		//	:
		// temp == 'Z' �� 90

		//String result = temp >=65 && temp <=90 ? "�빮��" : "�빮�ھƴ�";
		//System.out.println("��� : " + result);
		
		//String result = temp >='A' && temp <='Z' ? "�빮��" : "�빮�ھƴ�";
		//System.out.println("��� : " + result);

		//String result = temp >='a' && temp <='z' ? "�ҹ���" : "�ҹ��ھƴ�";
		//System.out.println("��� : " + result);

		// �빮�� �� �ҹ���
		// 'A'(65) �� 'a'(97)  ==>> +32
		// 'B'(66) �� 'b'(98)  ==>> +32
		// 'C'(67) �� 'c'(99)  ==>> +32
		//		:
		// 'Z'(90) �� 'z'(122)  ==>> +32

		// �ҹ��� �� �빮��
		// 'a'(97) �� 'A'(65)  ==>> -32
		// 'b'(98) �� 'B'(66)  ==>> -32
		// 'c'(99) �� 'C'(67)  ==>> -32
		//		:
		// 'z'(122) �� 'Z'(90)  ==>> -32
		*/

		char ch, result;
		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();

		// result = () ? () : ();
		// result = (�Է°��빮��) ? (�ҹ��ڷκ�ȯ) : (�Է°� �ҹ���?) ? (�빮�ڷκ�ȯ) : (�״��);

		result = (ch>='A'&&ch<='Z') ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);

		// 'Q' (�� 81)
		// result = (81>=65&&ch<=90) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (true&&81<=90) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = ((char)(81+32))
		// result = ((char)(113))
		// result = 'q'

		// 'm' (�� 109)
		// result = (109>=65&&ch<=90) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (true&&ch<=90) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (true&&flase) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (109>='97'&&109<='z') ? ((char)(ch-32)) : (ch);
		// result = (true&&109<=122) ? ((char)(ch-32)) : (ch);
		// result = (true&&true) ? ((char)(ch-32)) : (ch);
		// result = ((char)(109-32))
		// result = ((char)(77))
		// result = 'M';

		// '8' (�� 56)
		// result = (56>='65'&&ch<='Z') ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (flase&&ch<='Z') ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (flase) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (56>='97'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (flase'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (flase) ? ((char)(ch-32)) : (ch);
		// result = (ch);
		// result = '8';

		System.out.println(ch + " �� " + result);
		




	}
}

// ���� ���
/*

�� ���� �Է� : 1
1 �� 1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : A
A �� a
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : a
a �� A
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
