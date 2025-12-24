SELECT
    car_id,
    TO_CHAR(ROUND(AVG(end_date - start_date + 1), 1), 'FM9999.0') AS average_duration
FROM car_rental_company_rental_history
GROUP BY car_id
HAVING AVG(end_date - start_date + 1) >= 7
ORDER BY TO_NUMBER(average_duration) DESC, car_id DESC