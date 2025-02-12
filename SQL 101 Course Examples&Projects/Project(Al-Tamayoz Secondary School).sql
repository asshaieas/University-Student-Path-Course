-- First: Create a database for the project called "tamayoz_school_db"
CREATE DATABASE tamayoz_school_db;

-- Second: Use the created database
USE tamayoz_school_db;

-- Show all available databases in the current MySQL instance
-- SHOW DATABASES;  

-- Table: student_info to store student details
CREATE TABLE student_info (
    student_id INT PRIMARY KEY,         -- Primary key for student records
    student_full_name VARCHAR(225),     -- Full name of the student
    date_of_birth DATE,                 -- Date of birth (in YYYY-MM-DD format)
    gender CHAR(1),                     -- Gender ('M' for Male, 'F' for Female)
    enrollment_date DATE,               -- Date when the student enrolled
    email VARCHAR(225),                 -- Email address of the student
    academic_level TINYINT,             -- Academic level (1 to 6)
    track ENUM('Scientific', 'Humanities'), -- Track of the student (either Scientific or Humanities)
    cumulative_GPA DECIMAL(5,2)         -- Cumulative GPA (up to two decimal points)
);

-- Show all the tables in the current schema
SHOW TABLES;

-- Table: teacher_info to store teacher details
CREATE TABLE teacher_info (
    teacher_id INT PRIMARY KEY,         -- Primary key for teacher records
    teacher_full_name VARCHAR(225),     -- Full name of the teacher
    date_of_birth DATE,                 -- Date of birth (in YYYY-MM-DD format)
    gender CHAR(1),                     -- Gender ('M' for Male, 'F' for Female)
    email VARCHAR(225),                 -- Email address of the teacher
    office_number VARCHAR(10)           -- Office number of the teacher (e.g., 'Room 101')
);

-- Table: subject_info to store subject details
CREATE TABLE subject_info (
    subject_id INT PRIMARY KEY,         -- Primary key for subject records
    subject_name VARCHAR(225)           -- Subject name (e.g., 'Math', 'History')
);

-- Insert at least 30 students into the database
INSERT INTO student_info VALUES
(1, 'Abdul Baset Saleh', '2000-01-02', 'M', '2005-05-06', 'abdulbas@sale.com', 1, 'Scientific', 95.21),
(2, 'Saleh', '2010-01-02', 'M', '2015-05-06', 'salahas@sale.com', 1, 'Scientific', 96.21),
(3, 'Abdullah', '2000-11-02', 'M', '2005-06-06', 'abdullah@sale.com', 6, 'Humanities', 95.21),
(4, 'Lila', '2000-01-02', 'F', '2005-05-06', 'lila@sale.com', 1, 'Scientific', 95.23),
(5, 'Mona', '2000-01-10', 'F', '2007-05-06', 'moan@sale.com', 2, 'Scientific', 95.21),
(6, 'Sahira', '2000-01-02', 'F', '2015-05-06', 'sahira@sale.com', 2, 'Scientific', 99.21),
(7, 'Ali', '2000-01-12', 'M', '2005-05-06', 'ali@sale.com', 1, 'Scientific', 78.21),
(8, 'Ali Mohammed', '2000-10-02', 'M', '2016-05-06', 'alimohammd@sale.com', 3, 'Scientific', 95.78),
(9, 'Hassan', '2001-01-02', 'M', '2007-05-06', 'hassan@sale.com', 2, 'Scientific', 93.15),
(10, 'Fatima', '2001-12-11', 'F', '2008-04-22', 'fatima@sale.com', 4, 'Humanities', 92.84),
(11, 'Yasmin', '2002-07-14', 'F', '2010-05-11', 'yasmin@sale.com', 2, 'Humanities', 91.33),
(12, 'Khalid', '2000-04-21', 'M', '2006-09-08', 'khalid@sale.com', 3, 'Scientific', 93.67),
(13, 'Samir', '2000-02-17', 'M', '2006-05-23', 'samir@sale.com', 1, 'Scientific', 95.50),
(14, 'Omar', '1999-10-13', 'M', '2005-12-30', 'omar@sale.com', 6, 'Humanities', 91.02),
(15, 'Rana', '2001-08-19', 'F', '2012-11-09', 'rana@sale.com', 3, 'Humanities', 90.88),
(16, 'Nabil', '2000-06-04', 'M', '2009-01-15', 'nabil@sale.com', 4, 'Scientific', 94.33),
(17, 'Sarah', '2000-03-10', 'F', '2006-05-30', 'sarah@sale.com', 1, 'Humanities', 93.71),
(18, 'Mona Khalil', '2000-12-14', 'F', '2007-03-18', 'monakhalil@sale.com', 2, 'Scientific', 90.19),
(19, 'Tariq', '2000-07-06', 'M', '2005-12-04', 'tariq@sale.com', 5, 'Scientific', 97.42),
(20, 'Zainab', '2000-09-02', 'F', '2006-02-28', 'zainab@sale.com', 6, 'Humanities', 92.00),
(21, 'Layla', '2001-05-15', 'F', '2013-01-11', 'layla@sale.com', 2, 'Scientific', 91.80),
(22, 'Amina', '2000-12-02', 'F', '2007-07-29', 'amina@sale.com', 3, 'Humanities', 94.40),
(23, 'Ziad', '2002-02-03', 'M', '2009-09-25', 'ziad@sale.com', 4, 'Scientific', 92.90),
(24, 'Huda', '2001-06-01', 'F', '2007-11-19', 'huda@sale.com', 1, 'Scientific', 96.10),
(25, 'Said', '2001-01-27', 'M', '2009-08-04', 'said@sale.com', 5, 'Humanities', 91.35),
(26, 'Ahmed', '2000-04-25', 'M', '2006-11-20', 'ahmed@sale.com', 4, 'Scientific', 94.60),
(27, 'Lina', '2000-11-29', 'F', '2007-01-17', 'lina@sale.com', 2, 'Scientific', 91.10),
(28, 'Tareq', '2002-09-06', 'M', '2010-04-12', 'tareq@sale.com', 3, 'Humanities', 89.30),
(29, 'Jameela', '2000-01-19', 'F', '2005-08-22', 'jameela@sale.com', 6, 'Scientific', 93.12),
(30, 'Imran', '2000-03-13', 'M', '2011-12-03', 'imran@sale.com', 1, 'Scientific', 97.45);

-- Insert teacher information into the teacher_info table
INSERT INTO teacher_info VALUES
(1, 'Noha Ali', '1999-10-11', 'F', 'noha@tamayoz_school.com', '5'),
(2, 'Mohammed Ali', '1998-10-11', 'M', 'mohamed@tamayoz_school.com', '5'),
(3, 'Ali Saleh', '2000-10-11', 'M', 'ali@tamayoz_school.com', '7'),
(4, 'Sahira', '2006-10-11', 'F', 'sahira@tamayoz_school.com', '5'),
(5, 'Maha Hasan', '1995-08-19', 'F', 'maha@tamayoz_school.com', '12'),
(6, 'Jamil Almasri', '1985-07-23', 'M', 'jamil@tamayoz_school.com', '15'),
(7, 'Sara Ahmed', '1994-12-13', 'F', 'sara@tamayoz_school.com', '9'),
(8, 'Ibrahim Noor', '1987-02-28', 'M', 'ibrahim@tamayoz_school.com', '11'),
(9, 'Mona Kareem', '1990-05-14', 'F', 'mona@tamayoz_school.com', '13'),
(10, 'Fouad Abdallah', '1986-03-11', 'M', 'fouad@tamayoz_school.com', '8');

-- Show the content of teacher_info to verify insertion
SELECT * FROM teacher_info;

-- Insert subject information into the subject_info table
INSERT INTO subject_info VALUES
(1, 'Mathematics'),
(2, 'Physics'),
(3, 'Chemistry'),
(4, 'History'),
(5, 'English'),
(6, 'Biology'),
(7, 'Philosophy'),
(8, 'Geography'),
(9, 'Computer Science'),
(10, 'Art');

-- Show the content of subject_info to verify insertion
SELECT * FROM subject_info;
