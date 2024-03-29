SELECT USER
FROM DUAL;
--SYS

-- (���� SYS �� ����� ����)


--���� ��ȣȭ �� ��ȣȭ 01 ����


-- 1. ����Ŭ ��ȣȭ ����� ����ϱ� ���ؼ���
--   DBMS_OBFUSCATION_TOOLKIT ��Ű���� �̿��� �� �ִ�.
--   (���� ��Ű���� Ȱ������ �ʰ�, ��ȣȮ ��ȣȭ �˰����� ���� ������ ���� �ִ�.)

-- 2. DBMS_OPFUSCATION_TOOKIT ��Ű����
--    �⺻��(default)���δ� ����� �� ���� ���·� �����Ǿ� �����Ƿ�
--    �߰��� �� ��Ű���� ����� �� �ִ� ���·� ��ġ�ϴ� ������ �ʿ��ϴ�.
--    �̸� ���� ��dbmsobtk.sql�� �� ��prvtobtk.plb�� ������ ã�� ���� �ؾ� �Ѵ�.

--  BOOK ------- 2151511  ------ BOOK
--  BOOK -------  CPPL    ------ BOOK


@C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\dbmsobtk.sql
/*
Library DBMS_OBFUSCATION_LIB��(��) �����ϵǾ����ϴ�.
Library CRYPTO_TOOLKIT_LIBRARY��(��) �����ϵǾ����ϴ�.
Package DBMS_CRYPTO��(��) �����ϵǾ����ϴ�.
SYNONYM DBMS_CRYPTO��(��) �����Ǿ����ϴ�.
Package DBMS_OBFUSCATION_TOOLKIT��(��) �����ϵǾ����ϴ�.
SYNONYM DBMS_OBFUSCATION_TOOLKIT��(��) �����Ǿ����ϴ�.
Grant��(��) �����߽��ϴ�.
Package DBMS_SQLHASH��(��) �����ϵǾ����ϴ�.
SYNONYM DBMS_SQLHASH��(��) �����Ǿ����ϴ�.
*/

@C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\prvtobtk.plb
/*
Package DBMS_CRYPTO_FFI��(��) �����ϵǾ����ϴ�.
Package Body DBMS_CRYPTO_FFI��(��) �����ϵǾ����ϴ�.
Package Body DBMS_CRYPTO��(��) �����ϵǾ����ϴ�.
Package DBMS_OBFUSCATION_TOOLKIT_FFI��(��) �����ϵǾ����ϴ�.
Package Body DBMS_OBFUSCATION_TOOLKIT_FFI��(��) �����ϵǾ����ϴ�.
Package Body DBMS_OBFUSCATION_TOOLKIT��(��) �����ϵǾ����ϴ�.
Package Body DBMS_SQLHASH��(��) �����ϵǾ����ϴ�.
*/

-- 3. �� ��Ű���� 4���� ���ν����� �̷���� �ִ�.
--    VARCHAR2 Ÿ���� Encrypt/Decrypt �� �� �ִ� 2���� ���ν���
--    RAW ������ Encrypt/ Decrypt �� ���ִ� 2���� ���ν���
--    (�� �ٸ� Ÿ���� �������� �ʱ� ������
--        NUMBER �� DATE �� ���� ���� TO_CHAR() �̿� )
--  �� RAW . LONG RAW , ROWID Ÿ��\
--     �׷��� �̹����� ������ ���� ���� ����
--    HEXA- DECIMAL ( 16����) ���·� RETURN
--    LONG RAW �� LONG �� ���������� ������ ���� ���� ������ �ִ�.
--   ������� ���⸸ �����ϰ� DATA�� ���� �� �� ����.
--   ��LONG RAW�� LONG �� ���� ���� ����� ���´�.


-- ��  �ش� ��Ű���� ����� �� �ֵ��� ���� �ο�(SYS �� SCOTT ����..)
GRANT EXECUTE ON dbms_obfuscation_toolkit TO SCOTT;
--> Grant��(��) �����߽��ϴ�.
--> SCOTT �������� DBMS_OPFUSCATION_TOOKIT ��Ű����
--  ���ν����� ����� �� �ִ� ���� �ο�

-- ��  �ش� ��Ű���� ����� �� �ֵ��� ���� �ο�(SYS �� PUBLIC ����..)
GRANT EXECUTE ON dbms_obfuscation_toolkit TO PUBLIC;
--> Grant��(��) �����߽��ϴ�
--> ��� �������� DBMS_OPFUSCATION_TOOKIT ��Ű����
--  ���ν����� ����� �� �ִ� ���� �ο�







































































