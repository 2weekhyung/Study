SELECT USER
FROM DUAL;
--==>> HR

--���� DELETE ����--

--1. ���̺��� ������ ��(���ڵ�)�������ϴµ� ����ϴ� ����

-- 2. ���� �� ����
-- DELETE [FROM] ���̺��
-- [WHERE ������];

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID=198;

--�� EMPLOYEES ���̺��� �������� �����͸� �����Ѵ�.
--   ��, �μ����� 'IT'�� ���� �����Ѵ�.


DELETE
FROM EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID
                       FROM DEPARTMENTS
                       WHERE DEPARTMENT_NAME = 'IT');
                       

--���� ��(VIEW) ����--

-- 1. ��(VIEW)�� �̹� Ư���� �����ͺ��̽� ���� �����ϴ�
--    �ϳ� �̻��� ���̺��� ����ڰ� ��� ���ϴ� �����͵鸸��
--    ��Ȯ�ϰ� ���ϰ� �������� ���Ͽ� ������ ���ϴ� �÷��鸸�� ��Ƽ�
--    �������� ������ ���̺�� ���Ǽ� �� ���ȿ� ������ �ִ�.

--    ������ ���̺��̶�... �䰡 ������ �����ϴ� ���̺�(��ü)�� �ƴ϶�
--    �ϳ� �̻��� ���̺��� �Ļ��� �� �ٸ� ������ �� �� �ִ� ����̶�� �ǹ��̸�,
--    �� ������ �����س��� SQL �����̶�� �� �� �ִ�.

-- 2. ���� �� ����
-- CREATE [OR REPLACE] VIEW ���̸�
-- [_ALIAS[, ALIAS ...])]
-- AS
-- ��������(SUBQUERY)
-- [WITH CHECK OPTION]
-- [WITH READ ONLY]

--�� ��(VIEW)     
SELECT E.FIRST_NAME, E.LAST_NAME, D.DEPARTMENT_NAME, L.CITY
     , C.COUNTRY_NAME, R.REGION_NAME
FROM EMPLOYEES E, DEPARTMENTS D, LOCATIONS L, COUNTRIES C, REGIONS R
WHERE E.DEPARTMENT_ID =  D.DEPARTMENT_ID(+) 
AND D.LOCATION_ID = L.LOCATION_ID
AND L.COUNTRY_ID = C.COUNTRY_ID
AND C.REGION_ID = R.REGION_ID;

CREATE OR REPLACE VIEW VIEW_EMPLOYEES
AS
SELECT E.FIRST_NAME, E.LAST_NAME, D.DEPARTMENT_NAME, L.CITY
     , C.COUNTRY_NAME, R.REGION_NAME
FROM EMPLOYEES E, DEPARTMENTS D, LOCATIONS L, COUNTRIES C, REGIONS R
WHERE E.DEPARTMENT_ID =  D.DEPARTMENT_ID(+) 
AND D.LOCATION_ID = L.LOCATION_ID
AND L.COUNTRY_ID = C.COUNTRY_ID
AND C.REGION_ID = R.REGION_ID;
--==>> View VIEW_EMPLOYEES��(��) �����Ǿ����ϴ�.

--�� ������ VIEW ��ȸ
SELECT *
FROM VIEW_EMPLOYEES;   
--==>>
/*
Ellen	Abel	Sales	Oxford	United Kingdom	Europe
Sundar	Ande	Sales	Oxford	United Kingdom	Europe
Mozhe	Atkinson	Shipping	South San Francisco	United States of America	Americas
David	Austin	IT	Southlake	United States of America	Americas
Hermann	Baer	Public Relations	Munich	Germany	Europe
Shelli	Baida	Purchasing	Seattle	United States of America	Americas
Amit	Banda	Sales	Oxford	United Kingdom	Europe
Elizabeth	Bates	Sales	Oxford	United Kingdom	Europe
Sarah	Bell	Shipping	South San Francisco	United States of America	Americas
David	Bernstein	Sales	Oxford	United Kingdom	Europe
Laura	Bissot	Shipping	South San Francisco	United States of America	Americas
Harrison	Bloom	Sales	Oxford	United Kingdom	Europe
Alexis	Bull	Shipping	South San Francisco	United States of America	Americas
Anthony	Cabrio	Shipping	South San Francisco	United States of America	Americas
Gerald	Cambrault	Sales	Oxford	United Kingdom	Europe
Nanette	Cambrault	Sales	Oxford	United Kingdom	Europe
John	Chen	Finance	Seattle	United States of America	Americas
Kelly	Chung	Shipping	South San Francisco	United States of America	Americas
Karen	Colmenares	Purchasing	Seattle	United States of America	Americas
Curtis	Davies	Shipping	South San Francisco	United States of America	Americas
Lex	De Haan	Executive	Seattle	United States of America	Americas
Julia	Dellinger	Shipping	South San Francisco	United States of America	Americas
Jennifer	Dilly	Shipping	South San Francisco	United States of America	Americas
Louise	Doran	Sales	Oxford	United Kingdom	Europe
Bruce	Ernst	IT	Southlake	United States of America	Americas
Alberto	Errazuriz	Sales	Oxford	United Kingdom	Europe
Britney	Everett	Shipping	South San Francisco	United States of America	Americas
Daniel	Faviet	Finance	Seattle	United States of America	Americas
Pat	Fay	Marketing	Toronto	Canada	Americas
Kevin	Feeney	Shipping	South San Francisco	United States of America	Americas
Jean	Fleaur	Shipping	South San Francisco	United States of America	Americas
Tayler	Fox	Sales	Oxford	United Kingdom	Europe
Adam	Fripp	Shipping	South San Francisco	United States of America	Americas
Timothy	Gates	Shipping	South San Francisco	United States of America	Americas
Ki	Gee	Shipping	South San Francisco	United States of America	Americas
Girard	Geoni	Shipping	South San Francisco	United States of America	Americas
William	Gietz	Accounting	Seattle	United States of America	Americas
Douglas	Grant	Shipping	South San Francisco	United States of America	Americas
Nancy	Greenberg	Finance	Seattle	United States of America	Americas
Danielle	Greene	Sales	Oxford	United Kingdom	Europe
Peter	Hall	Sales	Oxford	United Kingdom	Europe
Michael	Hartstein	Marketing	Toronto	Canada	Americas
Shelley	Higgins	Accounting	Seattle	United States of America	Americas
Guy	Himuro	Purchasing	Seattle	United States of America	Americas
Alexander	Hunold	IT	Southlake	United States of America	Americas
Alyssa	Hutton	Sales	Oxford	United Kingdom	Europe
Charles	Johnson	Sales	Oxford	United Kingdom	Europe
Vance	Jones	Shipping	South San Francisco	United States of America	Americas
Payam	Kaufling	Shipping	South San Francisco	United States of America	Americas
Alexander	Khoo	Purchasing	Seattle	United States of America	Americas
Janette	King	Sales	Oxford	United Kingdom	Europe
Steven	King	Executive	Seattle	United States of America	Americas
Neena	Kochhar	Executive	Seattle	United States of America	Americas
Sundita	Kumar	Sales	Oxford	United Kingdom	Europe
Renske	Ladwig	Shipping	South San Francisco	United States of America	Americas
James	Landry	Shipping	South San Francisco	United States of America	Americas
David	Lee	Sales	Oxford	United Kingdom	Europe
Jack	Livingston	Sales	Oxford	United Kingdom	Europe
Diana	Lorentz	IT	Southlake	United States of America	Americas
Jason	Mallin	Shipping	South San Francisco	United States of America	Americas
Steven	Markle	Shipping	South San Francisco	United States of America	Americas
James	Marlow	Shipping	South San Francisco	United States of America	Americas
Mattea	Marvins	Sales	Oxford	United Kingdom	Europe
Randall	Matos	Shipping	South San Francisco	United States of America	Americas
Susan	Mavris	Human Resources	London	United Kingdom	Europe
Samuel	McCain	Shipping	South San Francisco	United States of America	Americas
Allan	McEwen	Sales	Oxford	United Kingdom	Europe
Irene	Mikkilineni	Shipping	South San Francisco	United States of America	Americas
Kevin	Mourgos	Shipping	South San Francisco	United States of America	Americas
Julia	Nayer	Shipping	South San Francisco	United States of America	Americas
Donald	OConnell	Shipping	South San Francisco	United States of America	Americas
Christopher	Olsen	Sales	Oxford	United Kingdom	Europe
TJ	Olson	Shipping	South San Francisco	United States of America	Americas
Lisa	Ozer	Sales	Oxford	United Kingdom	Europe
Karen	Partners	Sales	Oxford	United Kingdom	Europe
Valli	Pataballa	IT	Southlake	United States of America	Americas
Joshua	Patel	Shipping	South San Francisco	United States of America	Americas
Randall	Perkins	Shipping	South San Francisco	United States of America	Americas
Hazel	Philtanker	Shipping	South San Francisco	United States of America	Americas
Luis	Popp	Finance	Seattle	United States of America	Americas
Trenna	Rajs	Shipping	South San Francisco	United States of America	Americas
Den	Raphaely	Purchasing	Seattle	United States of America	Americas
Michael	Rogers	Shipping	South San Francisco	United States of America	Americas
John	Russell	Sales	Oxford	United Kingdom	Europe
Nandita	Sarchand	Shipping	South San Francisco	United States of America	Americas
Ismael	Sciarra	Finance	Seattle	United States of America	Americas
John	Seo	Shipping	South San Francisco	United States of America	Americas
Sarath	Sewall	Sales	Oxford	United Kingdom	Europe
Lindsey	Smith	Sales	Oxford	United Kingdom	Europe
William	Smith	Sales	Oxford	United Kingdom	Europe
Stephen	Stiles	Shipping	South San Francisco	United States of America	Americas
Martha	Sullivan	Shipping	South San Francisco	United States of America	Americas
Patrick	Sully	Sales	Oxford	United Kingdom	Europe
Jonathon	Taylor	Sales	Oxford	United Kingdom	Europe
Winston	Taylor	Shipping	South San Francisco	United States of America	Americas
Sigal	Tobias	Purchasing	Seattle	United States of America	Americas
Peter	Tucker	Sales	Oxford	United Kingdom	Europe
Oliver	Tuvault	Sales	Oxford	United Kingdom	Europe
Jose Manuel	Urman	Finance	Seattle	United States of America	Americas
Peter	Vargas	Shipping	South San Francisco	United States of America	Americas
Clara	Vishney	Sales	Oxford	United Kingdom	Europe
Shanta	Vollman	Shipping	South San Francisco	United States of America	Americas
Alana	Walsh	Shipping	South San Francisco	United States of America	Americas
Matthew	Weiss	Shipping	South San Francisco	United States of America	Americas
Jennifer	Whalen	Administration	Seattle	United States of America	Americas
Eleni	Zlotkey	Sales	Oxford	United Kingdom	Europe
*/
            
--�� ��(VIEW)�� ���� ��ȸ
DESC VIEW_EMPLOYEES;
--==>>
/*
�̸�              ��?       ����           
--------------- -------- ------------ 
FIRST_NAME               VARCHAR2(20) 
LAST_NAME       NOT NULL VARCHAR2(25) 
DEPARTMENT_NAME          VARCHAR2(30) 
CITY            NOT NULL VARCHAR2(30) 
COUNTRY_NAME             VARCHAR2(40) 
REGION_NAME              VARCHAR2(25) 
*/

--�� ��(VIEW) �ҽ� Ȯ��   CHECK~!!!
SELECT *
FROM USER_VIEWS
WHERE VIEW_NAME='VIEW_EMPLOYEES';
--==>>
/*
"SELECT E.FIRST_NAME, E.LAST_NAME, D.DEPARTMENT_NAME, L.CITY
     , C.COUNTRY_NAME, R.REGION_NAME
FROM EMPLOYEES E, DEPARTMENTS D, LOCATIONS L, COUNTRIES C, REGIONS R
WHERE E.DEPARTMENT_ID =  D.DEPARTMENT_ID(+) 
AND D.LOCATION_ID = L.LOCATION_ID
AND L.COUNTRY_ID = C.COUNTRY_ID
AND C.REGION_ID = R.REGION_ID"
*/
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       