-- 입양을 간 동물 중(animal_outs), 
-- 보호기간이 가장 길었던 동물 두마리의 아이디와 이름을 조회(animal_ints)
SELECT
    T3.animal_id,
    T3.name
FROM (
      SELECT 
          T1.animal_id,
          T1.name,
          T2.datetime - T1.datetime AS stay_days
      FROM animal_ins T1
      INNER JOIN animal_outs T2
      ON T1.animal_id = T2.animal_id
      ORDER BY stay_days DESC
     ) T3
WHERE ROWNUM <= 2