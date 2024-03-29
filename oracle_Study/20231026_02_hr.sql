SELECT USER
FROM DUAL;
--==>> HR

--○ 세 개 이상의 테이블 조인(JOIN, 결합)

-- 형식 1. (SQL 1992 CODE)
SELECT 테이블명1.컬럼명, 테이블명2.컬럼명, 테이블명3.컬럼명
FROM 테이블명1, 테이블명2, 테이블명3
WHERE 테이블명1.컬럼명1 = 테이블2.컬럼명1
    AND 테이블명2.컬럼명2 = 테이블명3.컬럼명2;

-- 형식 2. (SQL 1999 CODE)
SELECT 테이블명1.컬럼명, 테이블명2.컬럼명, 테이블명3.컬럼명
FROM 테이블명1 JOIN 테이블명2
ON 테이블명1.컬럼명1 = 테이블명2.컬럼명1
        JOIN 테이블명3
        ON 테이블명2.컬럼명2 = 테이블명3.컬럼명2;

--○ HR 계정 소유의 테이블 또는 뷰 목록 조회
SELECT *
FROM TAB;
--==>>
/*
COUNTRIES	        TABLE	
DEPARTMENTS	        TABLE	
EMPLOYEES	        TABLE	
EMP_DETAILS_VIEW	VIEW	
JOBS	            TABLE	
JOB_HISTORY	        TABLE	
LOCATIONS	        TABLE	
REGIONS	            TABLE	
*/

--○ HR.JOBS, HR.EMPLOYEES, HR.DEPARTMENTS 테이블을 대상으로
--   직원들의 데이터를
--   FIRST_NAME, LAST_NAME, JOB_TITLE, DEPARTMENT_NAME 항목으로 조회한다.

SELECT *
FROM JOBS;

SELECT *
FROM EMPLOYEES;

SELECT *
FROM DEPARTMENTS;

-- 1992
SELECT E.FIRST_NAME, E.LAST_NAME, J.JOB_TITLE, D.DEPARTMENT_NAME
FROM JOBS J, EMPLOYEES E, DEPARTMENTS D
WHERE J.JOB_ID = E.JOB_ID
AND E.DEPARTMENT_ID =  D.DEPARTMENT_ID(+);

-- 1999
SELECT E.FIRST_NAME, E.LAST_NAME, J.JOB_TITLE, D.DEPARTMENT_NAME
FROM JOBS J JOIN EMPLOYEES E
ON J.JOB_ID = E.JOB_ID
        LEFT JOIN DEPARTMENTS D
        ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;

--==>>
/*
Jennifer	Whalen	Administration Assistant	Administration
Pat	Fay	Marketing Representative	Marketing
Michael	Hartstein	Marketing Manager	Marketing
Den	Raphaely	Purchasing Manager	Purchasing
Karen	Colmenares	Purchasing Clerk	Purchasing
Guy	Himuro	Purchasing Clerk	Purchasing
Sigal	Tobias	Purchasing Clerk	Purchasing
Alexander	Khoo	Purchasing Clerk	Purchasing
Shelli	Baida	Purchasing Clerk	Purchasing
Susan	Mavris	Human Resources Representative	Human Resources
Matthew	Weiss	Stock Manager	Shipping
Adam	Fripp	Stock Manager	Shipping
Payam	Kaufling	Stock Manager	Shipping
Shanta	Vollman	Stock Manager	Shipping
Kevin	Mourgos	Stock Manager	Shipping
John	Seo	Stock Clerk	Shipping
Stephen	Stiles	Stock Clerk	Shipping
Renske	Ladwig	Stock Clerk	Shipping
Hazel	Philtanker	Stock Clerk	Shipping
Ki	Gee	Stock Clerk	Shipping
Michael	Rogers	Stock Clerk	Shipping
Jason	Mallin	Stock Clerk	Shipping
Peter	Vargas	Stock Clerk	Shipping
James	Marlow	Stock Clerk	Shipping
Mozhe	Atkinson	Stock Clerk	Shipping
Laura	Bissot	Stock Clerk	Shipping
Steven	Markle	Stock Clerk	Shipping
James	Landry	Stock Clerk	Shipping
Irene	Mikkilineni	Stock Clerk	Shipping
Julia	Nayer	Stock Clerk	Shipping
Joshua	Patel	Stock Clerk	Shipping
Trenna	Rajs	Stock Clerk	Shipping
Curtis	Davies	Stock Clerk	Shipping
Randall	Matos	Stock Clerk	Shipping
TJ	Olson	Stock Clerk	Shipping
Girard	Geoni	Shipping Clerk	Shipping
Martha	Sullivan	Shipping Clerk	Shipping
Jean	Fleaur	Shipping Clerk	Shipping
Winston	Taylor	Shipping Clerk	Shipping
Douglas	Grant	Shipping Clerk	Shipping
Donald	OConnell	Shipping Clerk	Shipping
Kevin	Feeney	Shipping Clerk	Shipping
Alana	Walsh	Shipping Clerk	Shipping
Vance	Jones	Shipping Clerk	Shipping
Samuel	McCain	Shipping Clerk	Shipping
Britney	Everett	Shipping Clerk	Shipping
Sarah	Bell	Shipping Clerk	Shipping
Randall	Perkins	Shipping Clerk	Shipping
Timothy	Gates	Shipping Clerk	Shipping
Jennifer	Dilly	Shipping Clerk	Shipping
Kelly	Chung	Shipping Clerk	Shipping
Anthony	Cabrio	Shipping Clerk	Shipping
Julia	Dellinger	Shipping Clerk	Shipping
Alexis	Bull	Shipping Clerk	Shipping
Nandita	Sarchand	Shipping Clerk	Shipping
David	Austin	Programmer	IT
Valli	Pataballa	Programmer	IT
Diana	Lorentz	Programmer	IT
Bruce	Ernst	Programmer	IT
Alexander	Hunold	Programmer	IT
Hermann	Baer	Public Relations Representative	Public Relations
Clara	Vishney	Sales Representative	Sales
Peter	Tucker	Sales Representative	Sales
David	Bernstein	Sales Representative	Sales
Peter	Hall	Sales Representative	Sales
Christopher	Olsen	Sales Representative	Sales
Nanette	Cambrault	Sales Representative	Sales
Jack	Livingston	Sales Representative	Sales
Jonathon	Taylor	Sales Representative	Sales
Alyssa	Hutton	Sales Representative	Sales
Ellen	Abel	Sales Representative	Sales
Sundita	Kumar	Sales Representative	Sales
Elizabeth	Bates	Sales Representative	Sales
William	Smith	Sales Representative	Sales
Tayler	Fox	Sales Representative	Sales
Harrison	Bloom	Sales Representative	Sales
Lisa	Ozer	Sales Representative	Sales
Amit	Banda	Sales Representative	Sales
Sundar	Ande	Sales Representative	Sales
David	Lee	Sales Representative	Sales
Mattea	Marvins	Sales Representative	Sales
Danielle	Greene	Sales Representative	Sales
Charles	Johnson	Sales Representative	Sales
Sarath	Sewall	Sales Representative	Sales
Louise	Doran	Sales Representative	Sales
Lindsey	Smith	Sales Representative	Sales
Allan	McEwen	Sales Representative	Sales
Patrick	Sully	Sales Representative	Sales
Janette	King	Sales Representative	Sales
Oliver	Tuvault	Sales Representative	Sales
Eleni	Zlotkey	Sales Manager	Sales
John	Russell	Sales Manager	Sales
Karen	Partners	Sales Manager	Sales
Alberto	Errazuriz	Sales Manager	Sales
Gerald	Cambrault	Sales Manager	Sales
Neena	Kochhar	Administration Vice President	Executive
Lex	De Haan	Administration Vice President	Executive
Steven	King	President	Executive
Nancy	Greenberg	Finance Manager	Finance
Jose Manuel	Urman	Accountant	Finance
Ismael	Sciarra	Accountant	Finance
Luis	Popp	Accountant	Finance
Daniel	Faviet	Accountant	Finance
John	Chen	Accountant	Finance
Shelley	Higgins	Accounting Manager	Accounting
William	Gietz	Public Accountant	Accounting
Kimberely	Grant	Sales Representative	
*/

SELECT *
FROM DEPARTMENTS;
-- DEPARTMENT_ID -- 관계 컬럼
SELECT *
FROM EMPLOYEES;
-- JOB_ID        -- 관계 컬럼
SELECT *
FROM JOBS;

SELECT E.FIRST_NAME, E.LAST_NAME, D.DEPARTMENT_NAME
FROM EMPLOYEES E JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;

SELECT *
FROM EMPLOYEES;
--==>> 107

SELECT COUNT(*)
FROM EMPLOYEES E JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;
--==>> 106

SELECT COUNT(*)
FROM EMPLOYEES E LEFT JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;
--==>> 107

SELECT E.FIRST_NAME, E.LAST_NAME, J.JOB_TITLE, D.DEPARTMENT_NAME
FROM EMPLOYEES E LEFT JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
        JOIN JOBS J
        ON E.JOB_ID = J.JOB_ID;

/*
COUNTRIES	        TABLE	
DEPARTMENTS	        TABLE	
EMPLOYEES	        TABLE	
EMP_DETAILS_VIEW	VIEW	
JOBS	            TABLE	
JOB_HISTORY	        TABLE	
LOCATIONS	        TABLE	
REGIONS	            TABLE	
*/

--○ EMPLOYEES, DEPARTMENTS, JOBS, LOCATIONS, COUNTRIES, REGIONS 테이블을 대상으로
--   직원들의 데이터를 다음과 같이 조회한다.
--   FIRST_NAME, LAST_NAME, JOB_TITLE, DEPARMENT_NAME, CITY, COUNTRY_NAME, REGION_NAME

SELECT *
FROM EMPLOYEES;

SELECT *
FROM DEPARTMENTS;

SELECT *
FROM JOBS;

SELECT *
FROM LOCATIONS;

SELECT *
FROM COUNTRIES;

SELECT *
FROM REGIONS;
/*                  

                    REGIONS
                                    REGION_ID
                    COUNTRIES
    COUNTRY_ID 
                    LOCATIONS
                                    LOCATION_ID
    DEPARTMENT_ID   DEPARTMENTS                
    
    JOB_ID          EMPLOYEES

                    JOBS
*/                  

SELECT E.FIRST_NAME, E.LAST_NAME, J.JOB_TITLE, D.DEPARTMENT_NAME, L.CITY, C.COUNTRY_NAME, R.REGION_NAME
FROM EMPLOYEES E, DEPARTMENTS D, JOBS J, LOCATIONS L, COUNTRIES C, REGIONS R
WHERE E.DEPARTMENT_ID =  D.DEPARTMENT_ID(+) 
AND J.JOB_ID = E.JOB_ID(+)
AND D.LOCATION_ID = L.LOCATION_ID(+)
AND L.COUNTRY_ID = C.COUNTRY_ID(+)
AND C.REGION_ID = R.REGION_ID(+);


































