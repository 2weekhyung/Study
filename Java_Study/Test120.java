/*=======================================
 ���� Ŭ���� ��� ����
 - �������̽�(Interface)
 ========================================*/
 
 /*
 �� ��extends�� vs. ��implements��

 	Ŭ���� extends Ŭ����
	Ŭ���� extends �߻�Ŭ����

	�������̽� extends �������̽�
	�������̽� extends �������̽�, �������̽�, ....

	�߻�Ŭ���� implements �������̽�
	�߻�Ŭ���� implements �������̽�, �������̽�, ...

	Ŭ���� implements �������̽�
	Ŭ���� implements �������̽�, �������̽�, ...

	�� �������̽��� Ŭ�����ʹ� �޸� ���� ����� �����ϸ�,
	   �������̽� ��ü�� ��� �ȴ�.

	�� �������̽��� ��� ������ �����ʹ�
	   �������������ڸ� ������ ������� �ʴ���
	   �⺻ ���(primitive constant)�� public static final �� �����ڷ� �����ȴ�.
	   Ŭ�������� �������̽��� �߰��Ͽ�(implements) ����� ���
	   �������̽� �ȿ��� ����� ��� �޼ҵ带 ������ �־�� �ϸ�
	   �������̽��� �����ϴ� Ŭ������
	   �������̽��� ���� �������̽��� �����ϴ� �߻� �޼ҵ带 ������
	   ��� �޼ҵ带 �������� ���� ���
	   �߻�(abstract) Ŭ������ �����ؾ� �Ѵ�.

	�� ����
	  - �������̽��� �޼ҵ带 ���� �ϰ� ���Ǵ� ����
	  - �������̽��� implements �� ��� �ݵ�� ���� Ŭ������
	    �������̽��� ��� �޼ҵ带 �������̵�(Overriding)�ؾ� �Ѵ�.
	  - �������̽��� �ڵ������� ������ ���� ó���ȴ�.
	   * ��� ���� : public static final
	  ��    �޼ҵ� : public abstract
	  - ���� ����� �޸�(��,����) ���еǸ�
	  �������� �������̽��� ��� �� �� �ִ�.
	  - �������̽����� ����� ���� ��extends�� Ű���带 ����Ѵ�.

	  �� �������̽��� ����
	  
	  �������̽��� Ŭ������ ���� ������ ������ �������� ������ ���̹Ƿ�
	  �޼ҵ带 ���� �ϰ� ���Ǵ� �� �� ����.
	  ����, Ŭ���������� ������ ���� ���� �� ������
	  �������̽������� ������ ���ó�� ���� ���� �� ���� ������
	  ���� �ÿ� �̸� ���� �Ҵ��� ���ƾ� �Ѵ�.

	  �� �������̽��� ����

	  �������̽��� Ŭ������ ���� ���ø��̱� ������
	  ��� ������ �������̽��� �Ǳ� ���ؼ���
	  �ڹ����α׷����� �������̽��� ������ �־�� �ϴµ�
	  �̷��� ����� �����ϴ� ���� ��implements�� ����� �̴�.

	  �� Ŭ������ ���ÿ� �� �� �̻��� �������̽���
	  implements �� �� �ִ�~!!!
 */
// �������̽�
interface Ademo
{
	public void write();
}

// �������̽�
interface Bdemo
{
	public void print();
}

// �������̽�
//interface Cdemo
// �� �������̽�(Ademo, Bdemo)�� ��ӹ��� �������̽�
interface Cdemo extends Ademo, Bdemo
{	
	// public void write();
	// public void print();

	public void test();
}

// Ŭ����
//class DemoImpl
//     ��
// �߻� Ŭ����
// �� �������̽�(ADemo, Bdemo)�� ��ӹ��� �������̽��� ������ �߻� Ŭ����
//abstract class DemoImpl implements Cdemo
//     ��
// Ŭ����
// �� �������̽�(Ademo, Bdemo)�� ��ӹ��� �������̽��� ������ �� ��� �޼ҵ带 �������� Ŭ����
// abstract class DemoImpl implements Cdemo
class DemoImpl implements Cdemo
{	
	@Override
	public void test()
	{
		System.out.println("test()...");
	}

	@Override
	public void write()
	{
		System.out.println("write()...");
	}

	@Override
	public void print()
	{
		System.out.println("print()...");
	}
}

public class Test120
{
	public static void main(String[] args)
	{
		// �ΰ��� �������̽�(ADemo, BDemo)�� ��ӹ���
		// �������̽�(CDemo)�� �����ϰ�
		// �ش� �������̽�(CDemo)�� �޼ҵ� �� �ƴ϶�
		// ��ӹ��� �������̽�(ADemo, Bdemo)�� ��� �޼ҵ带 ������(Overriding)��
		// DemoImpl Ŭ���� ����� �ν��Ͻ� ����
		DemoImpl ob = new DemoImpl();

		ob.test();
		ob.write();
		ob.print();
	}
}

// ���� ���

/*
test()...
write()...
print()...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/