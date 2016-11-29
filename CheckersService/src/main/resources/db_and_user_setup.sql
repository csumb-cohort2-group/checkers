-- Create new checkers database if it doesn't already exist.
CREATE DATABASE IF NOT EXISTS cst438_checkers;

-- Grant the database user "cst438" full access to the database. The user is
-- created implicitly if they are not already created. 
GRANT ALL PRIVILEGES
  ON cst438_checkers.* To 'cst438'@'localhost'
  IDENTIFIED BY 'cst438';
