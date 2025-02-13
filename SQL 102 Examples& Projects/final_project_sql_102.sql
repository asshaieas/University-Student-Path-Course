-- Create a table for top-performing students from the students' table, including only those with a GPA higher than 90.
-- Create a table for failing students from the students' table, including only those with a GPA below 60.
CREATE TABLE top_performing_students AS 
SELECT * FROM student_info WHERE cumulative_GPA > 90.00;

CREATE TABLE failing_students AS 
SELECT * FROM student_info WHERE cumulative_GPA < 60.00;

-- Display the names of top-performing students in level 6 who have a GPA of exactly 100
SELECT student_full_name FROM student_info 
WHERE cumulative_GPA = 100.00 AND student_level = 6;

-- Display students in level 1 whose ages are between 15 and 16
SELECT student_full_name FROM student_info 
WHERE student_level = 1 
AND YEAR(CURDATE()) - YEAR(date_of_birth) BETWEEN 15 AND 16;

-- . Display the number of students in level 2
SELECT COUNT(*) AS total_students_in_level_2 
FROM student_info 
WHERE student_level = 2;

-- Retrieve the distinct tracks of students in the school without duplicates
SELECT DISTINCT track FROM student_info;

-- Display the names of subjects in uppercase
SELECT UPPER(subject_name) AS subject_name_uppercase FROM subjects;

-- Calculate the average GPA and round it down to the nearest integer
SELECT FLOOR(AVG(cumulative_GPA)) AS rounded_avg_GPA FROM student_info;

-- Update gender values from 'F' to 'Female' and 'M' to 'Male'
UPDATE student_info 
SET gender = CASE 
    WHEN gender = 'F' THEN 'Female'
    WHEN gender = 'M' THEN 'Male'
END;
--  Increase the GPA by 5 points for students whose GPA is below 60
UPDATE student_info 
SET cumulative_GPA = cumulative_GPA + 5 
WHERE cumulative_GPA < 60;



