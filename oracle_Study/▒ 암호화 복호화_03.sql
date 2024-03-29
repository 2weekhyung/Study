SELECT USER
FROM DUAL;
-->SCOTT

--���� ��ȣȭ �� ��ȣȭ 03 ����


-- ���̺� ����
CREATE TABLE TBL_PACKAGETEST
( ID    NUMBER 
, KEY  VARCHAR2(40)
, PW  VARCHAR2(40)
);
--> Table TBL_PACKAGETEST��(��) �����Ǿ����ϴ�.


--�� ������ �Է�(�� ��ȣȭ)
INSERT INTO TBL_PACKAGETEST(ID,PW) VALUES(1,'abcd1234');
--> 1 �� ��(��) ���ԵǾ����ϴ�.


--�� Ȯ��
SELECT *
FROM TBL_PACKAGETEST;
--> 1	NULL  abcd1234


--�� �ѹ�
ROLLBACK;

--�� �ٽ� ������ �Է�(��ȣȭ)
INSERT INTO TBL_PACKAGETEST(ID,KEY,PW) VALUES(1, 'abcd1234', cryptpack.ENCRYPT('abcd1234','abcd1234'));
-- 'abcd1234' (�н�����)��
-- 'abcd1234' (Ű)�� ��ȣȭ ó��
-- 1 �� ��(��) ���ԵǾ����ϴ�.

--�� Ȯ��  (��ȣȭ ������ �������� �ʰ� �Ϲ����� ��ȸ�� ����)
SELECT *  
FROM TBL_PACKAGETEST;
--> 1	abcd1234	c":5?


--�� ������ ��ȸ(��ȣȭ) (��ȣȭ -> ��ȣȭ �������� ������ KEY�� �ƴ� �߸��� KEY�� ���� ��ȣȭ)
SELECT ID, CRYPTPACK.DECRYPT(PW,'1111') AS  "���Ȯ��"
FROM TBL_PACKAGETEST;
--> 1	?f+??

--�� ������ ��ȸ(��ȣȭ) (��ȣȭ -> ��ȣȭ �������� ������ KEY�� �ƴ� �߸��� KEY�� ���� ��ȣȭ)
SELECT ID, CRYPTPACK.DECRYPT(PW,'ABCD') AS  "���Ȯ��"
FROM TBL_PACKAGETEST;
--> 1	1	Bh?'??



--�� ������ ��ȸ(��ȣȭ) (��ȣȭ -> ��ȣȭ �������� ������ KEY�� ���� ��ȣȭ)
SELECT ID, CRYPTPACK.DECRYPT(PW,'abcd1234') AS  "���Ȯ��"
FROM TBL_PACKAGETEST;
--> 1	abcd1234










