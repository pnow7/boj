-- JULY 테이블은 다 가져와야함

-- ORACLE
SELECT
    T3.FLAVOR
FROM (
      SELECT
          T1.FLAVOR,
          T1.TOTAL_SUM + T2.TOTAL_ORDER AS TOTAL
      FROM (
            SELECT
                FLAVOR,
                SUM(TOTAL_ORDER) AS TOTAL_SUM
            FROM JULY
            GROUP BY FLAVOR
      ) T1
      LEFT JOIN FIRST_HALF T2
      ON T1.FLAVOR = T2.FLAVOR
      ORDER BY TOTAL DESC
) T3
WHERE ROWNUM <= 3