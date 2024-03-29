SELECT USER
FROM DUAL;
--==>> SCOTT

--�� EMP ���̺�� DEPT ���̺��� �������
--   ������ MANAGER �� CLERK �� ����鸸
--   �μ���ȣ, �μ���, �����, ������, �޿� �׸��� ��ȸ�Ѵ�.

SELECT E.DEPTNO "�μ���ȣ", D.DNAME "�μ���", ENAME "�����", JOB "������", SAL "�޿�"
FROM EMP E JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE E.JOB IN ('CLERK','MANAGER');
--==>>
/*
10	ACCOUNTING	CLARK	MANAGER	2450
10	ACCOUNTING	MILLER	CLERK	1300
20	RESEARCH	ADAMS	CLERK	1100
20	RESEARCH	JONES	MANAGER	2975
20	RESEARCH	SMITH	CLERK	800
30	SALES	    BLAKE	MANAGER	2850
30	SALES	    JAMES	CLERK	950
*/

-- �μ���ȣ, �μ���, �����, ������, �޿�
-- DEPTNO    DNAME   ENAME   JOB    SAL
-- E,D      D       E       E       E

SELECT �μ���ȣ, �μ���, �����, ������, �޿�
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO;

SELECT DEPTNO, DNAME, ENAME, JOB, SAL
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO;

--==>> ���� �߻�
--     ORA-00918: column ambiguously defined
-->    �� ���̺� �� �ߺ��Ǵ� �÷��� ����
--     �Ҽ� ���̺��� �������(��������) �Ѵ�.

SELECT E.DEPTNO, DNAME, ENAME, JOB, SAL
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO;
--==>> �� �θ� �����ڽ� �׷��Ƿ� �� DEPT D�� �θ�
-- 
SELECT *
FROM DEPT;
--==>>
/*
DEPTNO
10
20
30
40

�̷��� DEPTNO�� 4���� ���� ������ �ִµ�,

JOIN �� ����� ����
SELECT E.DEPTNO, DNAME, ENAME, JOB, SAL
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO;
--==>>

DEPTNO
10
10
10
20
20
20
20
20
30
30
30
30
30
30

JOIN�� ��� �� �� ���� �����͵��� ������ �ֱ� ������ �θ� DEPT(�� �θ� �����ڽ�)
*/

--�� �� ���̺� �� �ߺ��Ǵ� �÷��� ���� �Ҽ� ���̺��� ����ϴ� ���
--   �θ� ���̺��� �÷��� ������ �� �ֵ��� ó���ؾ� �Ѵ�.

--  �θ��� D �� ���� ���� ��Ģ~!!! (��� ��ȸ�� ������ ������, �θ� ����)
    SELECT D.DEPTNO "�μ���ȣ", DNAME "�μ���", ENAME "�����", JOB "������", SAL "�޿�"
    FROM EMP E JOIN DEPT D
    ON E.DEPTNO = D.DEPTNO
    WHERE E.JOB IN ('CLERK','MANAGER');
    
-- ����
SELECT E.DEPTNO, DNAME, ENAME, JOB, SAL
FROM EMP E, DEPT D
WHERE E.DEPTNO(+) = D.DEPTNO;
--==>>
/*
:
(NULL)	OPERATIONS ~			
*/

SELECT D.DEPTNO, DNAME, ENAME, JOB, SAL
FROM EMP E, DEPT D
WHERE E.DEPTNO(+) = D.DEPTNO;
--==>>
/*
:
40	OPERATIONS ~    �� CHECK~!!!(�θ���� ����ؾ� �μ���ȣ�� ����� ����)			
*/
-- �� ���̺� ��� ���ԵǾ� �ִ� �ߺ��� �÷��� �ƴϴ���
-- �÷��� �Ҽ� ���̺��� ����� �� �� �ֱ⸦ �����Ѵ�.

SELECT D.DEPTNO "�μ���ȣ", D.DNAME "�μ���", E.ENAME "�����", E.JOB "������", E.SAL "�޿�"
FROM EMP E JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE E.JOB IN ('CLERK','MANAGER');

--�� SELF JOIN (�ڱ� ����)

-- EMP ���̺��� �����͸� ������ ���� ��ȸ�� �� �ֵ��� �������� �����Ѵ�.
/*
----------------------------------------------------------------------------------------
 �����ȣ       �����     ������     �����ڹ�ȣ       �����ڸ�        ������������
 ----------------------------------------------------------------------------------------
 7369           SMITH       CLERK       7902            FORD            ANALYST
 -------------------------------------------E1
                                        -----------------------------------------------E2
                                        :
*/

SELECT *
FROM EMP;

-- 1992 
SELECT E1.EMPNO "�����ȣ", E1.ENAME "�����", E1.JOB "������", E1.MGR" �����ڹ�ȣ", E2.ENAME "�����ڸ�", E2.JOB "������������"
FROM EMP E1, EMP E2
WHERE E1.MGR = E2.EMPNO(+)
ORDER BY 1;

-- 1999
SELECT E1.EMPNO "�����ȣ", E1.ENAME "�����", E1.JOB "������", E1.MGR" �����ڹ�ȣ", E2.ENAME "�����ڸ�", E2.JOB "������������"
FROM EMP E1 LEFT JOIN EMP E2
ON E1.MGR = E2.EMPNO
ORDER BY 1;

--==>>
/*
7369	SMITH	CLERK	    7902	FORD	ANALYST
7499	ALLEN	SALESMAN	7698	BLAKE	MANAGER
7521	WARD	SALESMAN	7698	BLAKE	MANAGER
7566	JONES	MANAGER	    7839	KING	PRESIDENT
7654	MARTIN	SALESMAN	7698	BLAKE	MANAGER
7698	BLAKE	MANAGER	    7839	KING	PRESIDENT
7782	CLARK	MANAGER	    7839	KING	PRESIDENT
7788	SCOTT	ANALYST	    7566	JONES	MANAGER
7839	KING	PRESIDENT	(null)	(null)	(null)
7844	TURNER	SALESMAN	7698	BLAKE	MANAGER
7876	ADAMS	CLERK	    7788	SCOTT	ANALYST
7900	JAMES	CLERK	    7698	BLAKE	MANAGER
7902	FORD	ANALYST	    7566	JONES	MANAGER
7934	MILLER	CLERK	    7782	CLARK	MANAGER
*/

SELECT �����ȣ, �����, ������, �����ڹ�ȣ, �����ڸ�, ������������
FROM EMP;

SELECT EMPNO "�����ȣ", ENAME "�����", JOB "������", MGR "�����ڹ�ȣ", ENAME "�����ڸ�", JOB "������������"
FROM EMP;

SELECT E1.EMPNO "�����ȣ", E1.ENAME "�����", E1.JOB "������", E1.MGR "�����ڹ�ȣ", E2.ENAME "�����ڸ�", E2.JOB "������������"
FROM EMP E1 JOIN EMP E2
ON E1.MGR = E2.EMPNO;

SELECT E1.EMPNO "�����ȣ", E1.ENAME "�����", E1.JOB "������", E2.MGR "�����ڹ�ȣ", E2.ENAME "�����ڸ�", E2.JOB "������������"
FROM EMP E1 JOIN EMP E2
ON E1.MGR = E2.EMPNO;

--==>> �� �� ����

-- 1999
SELECT E1.EMPNO "�����ȣ", E1.ENAME "�����", E1.JOB "������", E1.MGR "�����ڹ�ȣ", E2.ENAME "�����ڸ�", E2.JOB "������������"
FROM EMP E1 LEFT JOIN EMP E2
ON E1.MGR = E2.EMPNO
ORDER BY 1;

-- 1992 
SELECT E1.EMPNO "�����ȣ", E1.ENAME "�����", E1.JOB "������", E1.MGR" �����ڹ�ȣ", E2.ENAME "�����ڸ�", E2.JOB "������������"
FROM EMP E1, EMP E2
WHERE E1.MGR = E2.EMPNO(+)
ORDER BY 1;

































































































