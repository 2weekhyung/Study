/*=======================================
 ���� Ŭ���� ��� ����
 - �������̽�(Interface)
 ========================================*/

//�������̽�
interface Ademo
{
	public void write();
}

//�������̽�
interface Bdemo
{
	public void print();
}

// �� �������̽��� 2�� �̻��� ����(implements)�� �� �ִ�.
//	  �� Ŭ�������� ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ����

// Ŭ����
// class DempImpl
// class DempImpl extends Ademo, Bdemo	//--(X)
// class DempImpl implements Ademo, Bdemo
// ��
// �߻� Ŭ���� - �� �������̽��� �����ϴ� �߻� Ŭ����
// abstract class DempImpl implements Ademo, Bdemo
// ��
// Ŭ���� - �� �������̽��� ������ �� �� �� �������̽��� ��� �޼ҵ带 Overriding �� �Ϲ� Ŭ����
class DemoImpl implements Ademo, Bdemo
{	
	// JDK 1.5(5.0)������ �������̽� �޼ҵ带
	// �������̵�(Overriding)�� ��
	// ��@Override�� ������̼�(annotation)�� ����� �� ����.
	// JDK 1.6(6.0) ���ĺ��� ���� ������ �����̴�.
	// �� ��ӹ��� Ŭ������ �޼ҵ带 �������̵�(Overriding) �� ������
	// JDK 1.5(5.0)������ ������̼�(annotation) ����� �����ϴ�.
	@Override
	public void write()
	{
		System.out.println("Ademo �������̽� �޼ҵ� write()...");
	}
	
	@Override
	public void print()
	{
		System.out.println("Bdemo �������̽� �޼ҵ� print()...");
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test118
{
	public static void main(String[] args)
	{
		//Ademo ob1 = new Ademo();		//-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		//Bdemo ob2 = new Bdemo();		//-- �������̽� �� �ν��Ͻ� ���� �Ұ�

		// Ademo, Bdemo �������̽��� ����(implements)��
		// Ŭ����(�� Demoimpl) ����� �ν��Ͻ� ����
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		//--==>> Ademo �������̽� �޼ҵ� write()...

		ob1.print();
		//--==>> Bdemo �������̽� �޼ҵ� print()...
		
		// �� ĳ����
		Ademo ob2= new DemoImpl();
		Bdemo ob3= new DemoImpl();

		//ob2.print();
		//--==>> ���� �߻�(������ ����)

		//ob3.write();
		//--==>> ���� �߻�(������ ����)

		ob2.write();
		//--==>> Ademo �������̽� �޼ҵ� write()...
		ob3.print();
		//--==>> Bdemo �������̽� �޼ҵ� print()...

		((Bdemo)ob2).print();
		//--==>> Bdemo �������̽� �޼ҵ� print()...
		((Ademo)ob3).write();
		//--==>> Ademo �������̽� �޼ҵ� write()...
		//-- �� DemoImpl Ŭ������ �� �������̽�(Ademo, Bdemo)�� ��� �����߱� ������
		//		�̿� ���� ó���� �����ϴ�.
		//		����, DemoImpl Ŭ������ �� �������̽��� �� �� �������̽��� �����ߴٸ�
		//		�� ������ ��Ÿ�� ������ �߻��ϴ� ������ �ȴ�.
		
		// �ٿ� ĳ����
		((DemoImpl)ob3).write();
	}	
}