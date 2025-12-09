-- Oracle
SELECT
    history_id,
    car_id,
    TO_CHAR(start_date, 'YYYY-MM-DD') AS start_date,
    TO_CHAR(end_date, 'YYYY-MM-DD') AS end_date,
    CASE 
        WHEN end_date - start_date >= 29 THEN '장기 대여'
        ELSE '단기 대여'
    END AS rent_type
FROM car_rental_company_rental_history
WHERE TO_CHAR(start_date, 'YYYY-MM') = '2022-09'
ORDER BY history_id DESC;