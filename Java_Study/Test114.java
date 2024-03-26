/*=========================
 ���� Ŭ���� ��� ����
 -���(Inheritance)
 =========================*/

 // �� �޼ҵ� �������̵�(Method Overriding)�� Ư¡

 //    - �޼ҵ� �̸�, ���� Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.
 //	   - �ݵ�� ��� ���谡 �־�� �Ѵ�.
 //    - �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
 //    ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
 //	   ���� ���, ���� Ŭ���� �޼ҵ��� ������������ڰ� ��protected���� ���
 //    ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
 //	    �������������ڴ� ��public�� �Ǵ� ��protected�� �̾�� �Ѵ�.
 //    -��static�� ��final�� ��private�� �޼ҵ��
 //    �������̵�(Overriding) �� �� ����.
 //    -Exception�� �߰��� �Ұ����ϴ�.
 //    ��, ���� �޼ҵ尡 ������ �մ� ������ ���� ���׿�
 //    ���ο� Exception�� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�.


// �θ� Ŭ����(���� Ŭ����, super class)
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super Write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
}

// �ڽ� Ŭ����(���� Ŭ����, sub class)
class SubTest114 extends SuperTest114
{
	/*
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super Write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub Write() �޼ҵ� : " + a + " : " + b + " : " + c);
		//--==>> ���� �߻�(������ ����)
		//-- ����Ŭ�������� ����� ���� a���� ������ �� ����.
		//   �� private �����̱� ������....

		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);
		//--==>>Sub print() �޼ҵ� : 100 : 20
		
		System.out.println("Sub print() �޼ҵ� : " + b);
		//--==>> Sub print() �޼ҵ� : 100
		
		System.out.println("Sub print() �޼ҵ� : " + this.b);		//SubTest114.b
		//--==>> Sub print() �޼ҵ� : 100
		
		System.out.println("Sub print() �޼ҵ� : " + super.b);		//SuerTest114.b
		//--==>> Sub print() �޼ҵ� : 10

		//-- ���� b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷�� ����.
		//   ����Ŭ�������� ����� b, ����Ŭ�������� ����� b

		System.out.println("Sub print() �޼ҵ� : "+c);
		//--==>> Sub print() �޼ҵ� : 20

		System.out.println("Sub print() �޼ҵ� : "+this.c);
		//--==>> Sub print() �޼ҵ� : 20

		System.out.println("Sub print() �޼ҵ� : "+super.c);
		//--==>> Sub print() �޼ҵ� : 20
		// ���� c�� �����ϴµ� �ƹ��� ����� ������ ����.
		// ����Ŭ�������� ����� c
		
	}//end print
	/*
	@override
	public void write()
	{
		System.out.println("Sub Write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
	*/
	//--==>> ���� �߻�(������ ����)
	//       �ڽ��� ������ �ؼ� private a�� ���� �� ���� ����

	@Override
	public void write()
	{
		System.out.println("Sub Write() �޼ҵ� : "  + b + " : " + c);
	}
	
}

//main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest114) �ν��Ͻ� ����
		SubTest114 ob = new SubTest114();

		ob.print();

		ob.write();
		//--==>> Super Write() �޼ҵ� : 5 : 10 : 20
		//--==>> Sub Write() �޼ҵ� : 100 : 20

		System.out.println("----------------------------- ���м�");

		System.out.println(ob.b);
		//--==>> 100

		System.out.println(((SuperTest114)ob).b);
		//--==>> 10
		// �� ���� �θ�~!!!

		ob.write();
		//--==>> Sub Write() �޼ҵ� : 100 : 20

		((SuperTest114)ob).write();
		//--==>> Sub Write() �޼ҵ� : 100 : 20

		// check~!!!
		// �� ���������� Ʋ������ ������ �޼ҵ��� ���� �ٸ�
		// �޼ҵ�� ������~!!! ��~!!! �����Ͽ� ������ ��~!!!
	}
}

//������

/*
Sub print() �޼ҵ� : 100 : 20
Sub print() �޼ҵ� : 100
Sub print() �޼ҵ� : 100
Sub print() �޼ҵ� : 10
Sub print() �޼ҵ� : 20
Sub print() �޼ҵ� : 20
Sub print() �޼ҵ� : 20
Sub Write() �޼ҵ� : 100 : 20
----------------------------- ���м�
100
10
Sub Write() �޼ҵ� : 100 : 20
Sub Write() �޼ҵ� : 100 : 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/