SELECT * FROM `likelion-db`.nation_wide_hospitals;
SELECT road_name_address, hospital_name
FROM `likelion-db`.nation_wide_hospitals
WHERE road_name_address
LIKE '수원시%'
AND hospital_name LIKE '피부과%';