SELECT * FROM `likelion-db`.nation_wide_hospitals;
SELECT road_name_address, hospital_name
FROM `likelion-db`.nation_wide_hospitals
WHERE road_name_address
LIKE '수원시%'
AND hospital_name LIKE '피부과%';
SELECT business_type_name, hospital_name, road_name_address
FROM `likelion-db`.nation_wide_hospitals
where business_type_name in ('보건소', '보건지소');
SELECT *
FROM `likelion-db`.nation_wide_hospitals
where business_type_name in ('보건소', '보건지소', '보건진료소')
and road_name_address like '%광진구';
SELECT hospital_name, patient_room_count FROM `likelion-db`.nation_wide_hospitals
where patient_room_count between 10 and 19
order by patient_room_count desc;