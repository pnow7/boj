-- 코드를 입력하세요 
-- 보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회
-- 보호 시작일이 빠른 순으로 조회
-- 입양, 입양 보낸
SELECT 
    T1.ANIMAL_ID,
    T1.NAME
FROM ANIMAL_INS T1
    JOIN ANIMAL_OUTS T2
        ON T1.ANIMAL_ID = T2.ANIMAL_ID
WHERE T1.DATETIME > T2.DATETIME
    ORDER BY T1.DATETIME;
        