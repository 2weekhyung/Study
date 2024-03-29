SELECT USER
FROM DUAL;
--==>> HR

DESC EMPLOYEES;

--�� %TYPE

-- 1. Ư�� ���̺� ���ԵǾ� �ִ� �÷��� ������Ÿ��(�ڷ���)�� �����ϴ� ������Ÿ��

-- 2. ���� �� ����
-- ������ VARCHAR2(30);
-- ������ ���̺�.�÷���%TYPE [:= �ʱⰪ];

SET SERVEROUTPUT ON;

-- HR.EMPLOYEES ���̺��� Ư�� �����͸� ������ ����
DECLARE
    --V_NAME VARCHAR2(20);
    V_NAME EMPLOYEES.FIRST_NAME%TYPE;
BEGIN
    SELECT FIRST_NAME INTO V_NAME
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 103;
    
     DBMS_OUTPUT.PUT_LINE(V_NAME);
END;
--==>> Alexander

--�� EMPLOYEES ���̺��� ������� 108�� ���(NANCY)��
--   SALARY �� ������ ��� ����ϴ� PL/SQL ������ �ۼ��Ѵ�.
DECLARE
    V_SALARY EMPLOYEES.SALARY%TYPE;
BEGIN
    SELECT SALARY INTO V_SALARY
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 108;
    
    DBMS_OUTPUT.PUT_LINE(V_SALARY);
END;
--==>> 12008

--�� EMPLOYEES ���̺��� Ư�� ���ڵ� �׸� ���� ���� ������ ����
--   103�� ����� FIRST_NAME, PHONE_NUMBER, EMAIL �׸��� ������ �����Ͽ� ���
SELECT FIRST_NAME, PHONE_NUMBER, EMAIL
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 103;

DECLARE
    V_FIRSTNAME EMPLOYEES.FIRST_NAME%TYPE;
    V_PHONENUMBER EMPLOYEES.PHONE_NUMBER%TYPE;
    V_EMAIL EMPLOYEES.EMAIL%TYPE;
BEGIN
    SELECT FIRST_NAME, PHONE_NUMBER, EMAIL INTO V_FIRSTNAME, V_PHONENUMBER, V_EMAIL
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 103;
    
    DBMS_OUTPUT.PUT_LINE(V_FIRSTNAME||','||V_PHONENUMBER||','||V_EMAIL);
END;
--==>>
/*
Alexander,590.423.4567,AHUNOLD


PL/SQL ���ν����� ���������� �Ϸ�Ǿ����ϴ�.
*/

--�� %ROWTYPE

-- 1. ���̺��� ���ڵ�� ���� ������ ����ü ������ ����(���� ���� Į��)

-- 2. ���� �� ����
-- ������ ���̺��%ROWTYPE;

DECLARE
    --V_FIRSTNAME       EMPLOYEES.FIRST_NAME%TYPE;
    --V_PHONENUMBER     EMPLOYEES.PHONE_NUMBER%TYPE;
    --V_EMAIL           EMPLOYEES.EMAIL%TYPE;
    
    V_EMP   EMPLOYEES%ROWTYPE;
BEGIN
    SELECT FIRST_NAME, PHONE_NUMBER, EMAIL 
           INTO V_EMP.FIRST_NAME, V_EMP.PHONE_NUMBER, V_EMP.EMAIL
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 103;
    
    --DBMS_OUTPUT.PUT_LINE(V_FIRSTNAME||','||V_PHONENUMBER||','||V_EMAIL);
    DBMS_OUTPUT.PUT_LINE(V_EMP.FIRST_NAME||','||V_EMP.PHONE_NUMBER||','||V_EMP.EMAIL);
END;

--�� EMPLOYEES ���̺��� ��ü ���ڵ� �׸� ���� ���� ������ ����
--   ��� ����� FIRST_NAME, PHONE_NUMBER, EMAIL �׸��� ������ �����Ͽ� ���

DECLARE
    V_EMP   EMPLOYEES%ROWTYPE;
BEGIN
    SELECT FIRST_NAME, PHONE_NUMBER, EMAIL
            INTO V_EMP.FIRST_NAME, V_EMP.PHONE_NUMBER, V_EMP.EMAIL
    FROM EMPLOYEES;
    
    DBMS_OUTPUT.PUT_LINE(V_EMP.FIRST_NAME || ',' || V_EMP.PHONE_NUMBER || ' , ' || V_EMP.EMAIL);
END;
--==>> ���� �߻�
-- (ORA-01422: exact fetch returns more than requested number of row)

--> ���� ���� ��(ROWS) ������ ���� �������� �ϸ�
-- ���� ������ �����ϴ� �� ��ü�� �Ұ���������.
































































