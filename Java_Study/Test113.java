/*=========================
 ���� Ŭ���� ��� ����
 -���(Inheritance)
 =========================*/

// ������ ���� ���α׷��� �����Ѵ�.
// �� ����� ������ �����Ͽ� �ۼ� �� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 10
// ������ �Է�(+ - * /) : -
// >> 20 - 10 = 10
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

class Aclass
{
	protected int x,y;
	protected char op;
	
	Aclass()
	{
		
	}
	

	void write(double result)
	{
		System.out.printf("\n>> %d %c %d = %.2f\n", x , op, y, result);
	}
}

// Aclass �� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{	/*
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /:) ");
		op = (char)System.in.read();
	}

	double cal()
	{	
		double result = 0;

		switch (op)
		{
		case '+': result = x + y; break;
		
		case '-': result = x - y; break;

		case '*': result = x * y; break;

		case '/': result = x / (double)y; break;
		
		}

		return result;
	}
	*/
	
	/*
	protected int x,y;
	protected char op;
	
	void write(double result)
	{
		System.out.printf("\n>> %d %c %d = %.2f\n", x , op, y, result);
	}
	*/

	Bclass()
	{
		// super();	
	}

	//void input()
	boolean input() throws IOException
	{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : ");	//"20 10"
		String temp = br.readLine();

		// �� ���ڿ�.split("������");

		//	  ���ڿ�.split("\\s");		//-- ������ �� ����
		//
		//	  ex) "10 20 30 40 50".split("\\s");
		//			�� ��ȯ �� {"10","20","30","40","50"}

		//	  ex) "010-1234-4567".split("-");
		//			�� ��ȯ �� {"010","1234","4567"};

		String[] strArr = temp.split("\\s");	// "20 10" �� String[] strArr = {"20", "10"}
		
		
		//if(temp.length() != 2) -- X
		if (strArr.length != 2)
		{
			return false;
			//false�� ��ȯ�ϸ� input() �żҵ� ����
			//�� ������ �����Ͽ� if���� �����ϰ� �� ���...
			//�Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
			//�����(�� flase)�� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.
		}

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);
		//this.x = Integer.parseInt(strArr[0]);
		//super.x = Integer.parseInt(strArr[0]);
		
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		/*
		if (op!='+' && op!='-' && op!='*' && op!='/')
		{
			return false;
		}
		*/

		if (op=='+' ||  op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		return false;

	}//end input()

	double calc()
	{
		double result = 0;

		switch (op)
		{
		case '+': result = x + y; break;
		
		case '-': result = x - y; break;

		case '*': result = x * y; break;

		//case '/': result = x / y; break;
		//case '/': result = x / y;
		case '/': result = (double)x / y;
		
		}

		return result;
	}// end calc()
	/*
    print()
	{
		
	}
	*/

}

//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test113
{
	public static void main(String[] args) throws IOException
	{	/*
		Bclass ob = new Bclass();

		ob.input();
		double i = ob.cal();
		ob.write(i);
		*/

		Bclass ob = new Bclass();

		//ob.input();
		
		/*
		boolean resp = ob.input();

		if (resp != ture)
		{
			System.out.println("Error....");
			return;			// ���α׷� ����
		}
		*/
		/*
		boolean resp = ob.input();

		if (!resp)
		{
			System.out.println("Error....");
			return;			// ���α׷� ����
		}
		*/

		if (!ob.input())
		{
			System.out.println("Error....");
			return;			// ���α׷� ����
		}
		
		double result = ob.calc();

		ob.write(result);
		
	}
}

// ���� ���

/*
������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : *

>> 20 * 15 = 300.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/