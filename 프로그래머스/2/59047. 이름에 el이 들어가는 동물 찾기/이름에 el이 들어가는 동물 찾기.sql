SELECT
    animal_id,
    name
FROM animal_ins
WHERE UPPER(name) LIKE '%EL%' AND 
      animal_type = 'Dog'
ORDER BY name;