# Pseudocode of Questions 

---

```
Question 1 - Add All Digits
----------------------------
DECLARE n :INTEGER
DECLARE a :INTEGER
DECLARE b :INTEGER
SET b:=0 , SUM:=0
READ n
WHILE n>0
    a:=n MOD 10
    N:= N/10
    SUM :=SUM +a
END WHILE
PRINT SUM
```

---

```
Question 2 - Add All Elements Of Array
---------------------------------------
DECLARE n :ARRAY[0:4] OF INTEGER
DECLARE sum :INTEGER
SET SUM :=0
FOR I:=0 TO 4
    READ a[i]
END FOR
FOR i=0 TO 4
    sum:= sum+a[i]
END FOR
PRINT sum
```

---

```
Question 3 - Even Odd
----------------------
DECLARE a : INTEGER
READ a
IF a MOD 2==0 THEN
    PRINT "a is even"
ELSE
    PRINT "a is odd"
END IF
```

---

```
Question 4 - Greatest Of Two Numbers (Basic)
---------------------------------------------
DECLARE a : INTEGER
DECLARE b : INTEGER
READ a
READ b
IF a > b THEN
    PRINT "a is greater than b"
ELSE
    PRINT "b is greater than a"
END IF
```

---

```
Question 5 - How Many Digit Present
-------------------------------------
DECLARE n :INTEGER
DECLARE cnt :INTEGER
DECLARE d :INTEGER
SET cnt:=0
READ n
READ d
WHILE n >0
    a:=n MOD 10
    n:=n/10
    IF a==d THEN
        INCREMENT cnt
    END IF
END WHILE
PRINT cnt
```

---

```
Question 6 - Max Array
-----------------------
DECLARE a : ARRAY[0:5] OF INTEGER
DECLARE max : INTEGER
FOR I:=0 TO 4
    READ a[i]
END FOR
SET max:= a[0]
FOR I:=0 TO 4
    IF a[i]>max THEN
        max:=a[i]
    END IF
END FOR
PRINT max
```

---

```
Question 7 - Question (Loop Tracing)
--------------------------------------
DECLARE p :INTEGER
DECLARE q :INTEGER
DECLARE r :INTEGER
SET q=13
FOR (EACH p FROM 1 TO 4)
    r = q MOD p
    p = p+5
    q = p+r
END FOR
r = q/5
PRINT q, r
```

---

```
Question 8 - Reverse Number
-----------------------------
DECLARE n : INTEGER
DECLARE a : INTEGER
DECLARE b : INTEGER
SET b=0
READ n
WHILE n>0
    a:= n MOD 10
    n:= n/10
    b:= b*10+a
END WHILE
PRINT b
```

---

```
Question 9 - User Password
----------------------------
DECLARE uid : STRING
DECLARE pass : STRING
READ uid
READ pass
IF uid=="admin" THEN
    IF pass=="admin" THEN
        PRINT "Welcome"
    ELSE
        PRINT "Incorrect Password"
    END IF
ELSE
    PRINT "Incorrect user ID"
END IF
```

---

```
Question 10 - Area Of Circle
------------------------------
DECLARE radius : REAL
DECLARE area : REAL
CONSTANT PI = 3.14
READ radius
area := PI * radius * radius
PRINT area
```

---

```
Question 11 - Palindrome
--------------------------
FUNCTION palindrome (n: INTEGER) : BOOLEAN
DECLARE a : INTEGER
DECLARE b : INTEGER
SET b := 0
WHILE n > 0 LOOP
    a := n MOD 10
    n := n / 10
    b := b * 10 + a
END WHILE
IF n==b THEN
    RETURN True
ELSE
    RETURN False
END IF
END palindrome
PRINT palindrome(151)
PRINT palindrome(12)
```

---

```
Question 12 - Factorial
-------------------------
FUNCTION factorial (n: INTEGER) : INTEGER
DECLARE fact : INTEGER
SET fact := 1
FOR i=n STEP -1 TO 1
    fact := fact * i
END FOR
RETURN fact
END FUNCTION
PRINT factorial(5)
```

---

```
Question 13 - Absolute Value
------------------------------
FUNCTION absvalue(a: INTEGER)
IF a>0 THEN
    RETURN a
ELSE
    RETURN -a
END IF
END FUNCTION
PRINT absvalue(-5)
PRINT absvalue(7)
```

---

```
Question 14 - Greatest Of Two Numbers (Function)
--------------------------------------------------
FUNCTION max (a: INTEGER, b: INTEGER) : INTEGER
DECLARE c: INTEGER
IF a>b THEN
    c:=a
ELSE
    c:=b
END IF
RETURN c
END FUNCTION
PRINT max(23, 6)
```

---

```
Question 15 - Cube
--------------------
FUNCTION cube(a : INTEGER): INTEGER
RETURN a*a*a
END FUNCTION
PRINT cube(3)
```

---

```
Question 16 - Area Of Triangle
--------------------------------
FUNCTION aot(b: REAL, h: REAL): REAL
RETURN 0.5*b*h
END FUNCTION
PRINT aot(3, 4)
```

---

```
Question 17 - Counting Even Odd (Matrix)
------------------------------------------
DECLARE a: Array[3][3] Integer
DECLARE even: INTEGER
DECLARE odd: INTEGER
SET even=0, odd=0
FOR r:=0 TO 2
    FOR c:=0 TO 2
        READ a[r][c]
    END FOR
END FOR
FOR r:=0 TO 2
    FOR c:=0 TO 2
        IF a[r][c] MOD 2==0 THEN
            INCREMENT even
        ELSE
            INCREMENT odd
        END IF
    END FOR
END FOR
PRINT even
PRINT odd
```

---

```
Question 18 - Sum Of 2D Array
-------------------------------
DECLARE arr : Array[2][2] of integer
DECLARE sum : INTEGER
SET sum := 0
FOR r:=0 TO 1
    FOR c:=0 TO 1
        READ arr[r][c]
    END FOR
END FOR
FOR r:=0 TO 1
    FOR c:=0 TO 1
        sum := sum + arr[r][c]
    END FOR
END FOR
PRINT sum
```

---

```
Question 19 - Min In Array
----------------------------
DECLARE a: ARRAY[10] OF INTEGER
DECLARE min : INTEGER
FOR i:=0 TO 9
    READ a[i]
END FOR
SET min := a[0]
FOR i:=0 TO 9
    IF a[i] < min THEN
        min := a[i]
    END IF
END FOR
PRINT min
```

---

```
Question 20 - Circumference Of Circle
---------------------------------------
DECLARE radius : REAL
DECLARE circumference : REAL
CONSTANT PI = 3.14
READ radius
circumference := 2 * PI * radius
PRINT circumference
```

---

```
Question 21 - Area Of Rectangle
---------------------------------
DECLARE length : REAL
DECLARE breadth : REAL
DECLARE area : REAL
READ length
READ breadth
area := length * breadth
PRINT area
```

---

```
Question 22 - Perimeter Of Rectangle
--------------------------------------
DECLARE length : REAL
DECLARE breadth : REAL
DECLARE perimeter : REAL
READ length
READ breadth
perimeter := 2 * (length + breadth)
PRINT perimeter
```

---

```
Question 23 - Swap Two Numbers (Using Temp)
---------------------------------------------
DECLARE a : INTEGER
DECLARE b : INTEGER
READ a
READ b
DECLARE temp : INTEGER
temp = a
a = b
b = temp
PRINT a
PRINT b
```

---

```
Question 24 - Swap Two Numbers (Without Temp)
----------------------------------------------
DECLARE a : INTEGER
DECLARE b : INTEGER
READ a
READ b
a := a + b
b := a - b
a := a - b
PRINT a
PRINT b
```

---

```
Question 25 - Average
-----------------------
DECLARE a : INTEGER
DECLARE b : INTEGER
DECLARE average : INTEGER
READ a
READ b
average = (a + b)/2
PRINT average
```

---

```
Question 26 - Fibonacci
-------------------------
DECLARE n: INTEGER
DECLARE prev: INTEGER
DECLARE next: INTEGER
DECLARE sum: INTEGER
SET prev:= 0
SET next:= 1
SET sum:= 0
PRINT prev
PRINT next
PRINT sum
WHILE sum <= n
    sum:= prev + next
    PRINT sum
    prev:= next
    next:= sum
END WHILE
```

---

```
Question 27 - Armstrong Number
--------------------------------
DECLARE n: INTEGER
DECLARE num: INTEGER
DECLARE b: INTEGER
DECLARE a: INTEGER
SET b:= 0
READ n
SET num:= n
WHILE n > 0
    a:= n MOD 10
    n:= n / 10
    b:= b + a*a*a
END WHILE
IF b==num THEN
    PRINT "Armstrong"
ELSE
    PRINT "Not Armstrong"
END IF
```
