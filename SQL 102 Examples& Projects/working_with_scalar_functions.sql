-- Step 1: Select the database
USE company;

-----------------------------------------------------------
-- Scalar Functions: Numeric Functions
-----------------------------------------------------------
-- 1. POW(x, y) - Raises x to the power of y
-- Example: 3^4 = 81
SELECT POW(3, 4) AS power_result;

-- Tip: POW is useful for exponential calculations like compound interest.
-- Example: Calculate future value after 5 years with principal=1000, rate=5%, compounding annually:
SELECT 1000 * POW(1 + 0.05, 5) AS future_value;

-- 2. MOD(x, y) - Returns the remainder of x divided by y
-- Example: 10 % 3 = 1
SELECT MOD(10, 3) AS remainder;

-- Tip: Useful in cyclic operations, like determining even/odd numbers.
-- Example: Check if a number is even
SELECT MOD(10, 2) = 0 AS is_even;

-- 3. ABS(x) - Returns the absolute value of x
-- Example: |-1234| = 1234
SELECT ABS(-1234) AS absolute_value;

-- Tip: Useful when calculating distances regardless of direction.

-- 4. DIV - Integer division (quotient)
-- Example: 12 DIV 5 = 2 (remainder ignored)
SELECT 12 DIV 5 AS division_result;

-- Tip: Use when only the quotient matters, like grouping items into batches.

-----------------------------------------------------------
-- Step 2: Scalar Functions: String Functions
-----------------------------------------------------------
-- 1. ASCII(char) - Returns the ASCII value of the first character
-- Example: ASCII('A') = 65
SELECT ASCII('A') AS ascii_value;

-- Tip: Useful in character encoding and validation tasks.

-- 2. BIN(x) - Converts a number to binary representation
-- Example: BIN(5) = 101
SELECT BIN(5) AS binary_representation;

-- Tip: Useful in low-level programming and network protocols.

-- 3. CONCAT(str1, str2, ...) - Concatenates strings
-- Example: CONCAT('Hello', ' ', 'World') = 'Hello World'
SELECT CONCAT('Hello', ' ', 'World') AS full_greeting;

-- Tip: Use CONCAT_WS(separator, str1, str2) for separator-based concatenation.

-- 4. HEX(x) - Converts a string or number to hexadecimal
-- Example: HEX('A') = 41
SELECT HEX('A') AS hex_value;

-- Tip: Commonly used in encryption and color codes.

-- 5. LOWER(str) - Converts string to lowercase
-- Example: LOWER('Hello WORLD') = 'hello world'
SELECT LOWER('Hello WORLD') AS lowercase_text;

-- Tip: Useful in case-insensitive comparisons.

-- 6. UPPER(str) - Converts string to uppercase
-- Example: UPPER('Hello world') = 'HELLO WORLD'
SELECT UPPER('Hello world') AS uppercase_text;




