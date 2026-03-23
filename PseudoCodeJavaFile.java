package pseudo_college;

import java.util.Scanner;
public class PseudoCodeJavaFile {

        static Scanner sc = new Scanner(System.in);

        // ============================================================
        // Question 1 - Add All Digits
        // ============================================================
        static void addAllDigits() {
            int n = sc.nextInt();
            int sum = 0;
            while (n > 0) {
                int a = n % 10;
                sum = sum + a;
                n = n / 10;
            }
            System.out.println(sum);
        }


        // ============================================================
        // Question 2 - Add All Elements Of Array
        // ============================================================
        static void addAllElementsOfArray() {
            int[] a = new int[5];
            int sum = 0;
            for (int i = 0; i <= 4; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i <= 4; i++) {
                sum = sum + a[i];
            }
            System.out.println(sum);
        }


        // ============================================================
        // Question 3 - Even Odd
        // ============================================================
        static void evenOdd() {
            int a = 25;
            if (a % 2 == 0) {
                System.out.println("a is even");
            } else {
                System.out.println("a is odd");
            }
        }


        // ============================================================
        // Question 4 - Greatest Of Two Numbers (Basic)
        // ============================================================
        static void greatestOfTwoNumbersBasic() {
            int a = 10;
            int b = 15;
            if (a > b) {
                System.out.println("a is greater than b");
            } else {
                System.out.println("b is greater than a");
            }
        }


        // ============================================================
        // Question 5 - How Many Digit Present
        // ============================================================
        static void howManyDigitPresent() {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int cnt = 0;
            while (n > 0) {
                int a = n % 10;
                n = n / 10;
                if (a == d) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }


        // ============================================================
        // Question 6 - Max Array
        // ============================================================
        static void maxArray() {
            int[] a = new int[5];
            int max;
            for (int i = 0; i <= 4; i++) {
                a[i] = sc.nextInt();
            }
            max = a[0];
            for (int i = 0; i <= 4; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println(max);
        }


        // ============================================================
        // Question 7 - Question (Loop Tracing)
        // ============================================================
        static void loopTracing() {
            int p, q, r;
            q = 13;
            for (p = 1; p <= 4; p++) {
                r = q % p;
                p = p + 5;
                q = p + r;
            }
            r = q / 5;
            System.out.println(q + " " + r);
        }


        // ============================================================
        // Question 8 - Reverse Number
        // ============================================================
        static void reverseNumber() {
            int n = sc.nextInt();
            int a = 0;
            int b = 0;
            while (n > 0) {
                a = n % 10;
                n = n / 10;
                b = b * 10 + a;
            }
            System.out.println(b);
        }


        // ============================================================
        // Question 9 - User Password
        // ============================================================
        static void userPassword() {
            System.out.println("Enter a user ID : ");
            String uid = sc.nextLine();
            System.out.println("Enter a password : ");
            String pass = sc.nextLine();
            if (uid.equals("userId")) {
                if (pass.equals("Password")) {
                    System.out.println("Welcome");
                } else {
                    System.out.println("Incorrect Password");
                }
            } else {
                System.out.println("Incorrect User ID");
            }
        }


        // ============================================================
        // Question 10 - Area Of Circle
        // ============================================================
        static void areaOfCircle() {
            System.out.print("Enter radius: ");
            float radius = sc.nextFloat();
            float pi = 3.14f;
            float area = pi * radius * radius;
            System.out.println(area);
        }


        // ============================================================
        // Question 11 - Palindrome
        // ============================================================
        static boolean palindrome(int n) {
            int num = n;
            int a;
            int b = 0;
            while (n > 0) {
                a = n % 10;
                n = n / 10;
                b = b * 10 + a;
            }
            return num == b;
        }

        static void checkPalindrome() {
            System.out.println(palindrome(151));
            System.out.println(palindrome(12));
        }


        // ============================================================
        // Question 12 - Factorial
        // ============================================================
        static int factorial(int n) {
            int fact = 1;
            for (int i = n; i >= 1; i--) {
                fact = fact * i;
            }
            return fact;
        }

        static void checkFactorial() {
            System.out.println(factorial(5));
        }


        // ============================================================
        // Question 13 - Absolute Value
        // ============================================================
        static int absvalue(int a) {
            if (a >= 0) {
                return a;
            } else {
                return -a;
            }
        }

        static void checkAbsoluteValue() {
            System.out.println(absvalue(-5));
            System.out.println(absvalue(7));
        }


        // ============================================================
        // Question 14 - Greatest Of Two Numbers (Function)
        // ============================================================
        static int max(int a, int b) {
            int c;
            if (a > b) {
                c = a;
            } else {
                c = b;
            }
            return c;
        }

        static void checkGreatestOfTwoNumbers() {
            System.out.println(max(23, 6));
        }


        // ============================================================
        // Question 15 - Cube
        // ============================================================
        static int cube(int a) {
            return a * a * a;
        }

        static void checkCube() {
            System.out.println(cube(3));
        }


        // ============================================================
        // Question 16 - Area Of Triangle
        // ============================================================
        static float aot(float b, float h) {
            return 0.5f * b * h;
        }

        static void checkAreaOfTriangle() {
            System.out.println(aot(3.4f, 6));
        }


        // ============================================================
        // Question 17 - Counting Even Odd (Matrix)
        // ============================================================
        static void countEvenOddInMatrix() {
            int[][] arr = new int[3][3];
            int even = 0;
            int odd = 0;
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print("Enter Elements at [" + r + "][" + c + "]: ");
                    arr[r][c] = sc.nextInt();
                }
            }
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    if (arr[r][c] % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                }
            }
            System.out.println("Number of even numbers: " + even);
            System.out.println("Number of odd numbers:  " + odd);
        }


        // ============================================================
        // Question 18 - Sum Of 2D Array
        // ============================================================
        static void sumOf2DArray() {
            int[][] arr = new int[2][2];
            int sum = 0;
            for (int r = 0; r < 2; r++) {
                for (int c = 0; c < 2; c++) {
                    System.out.print("Enter Elements at [" + r + "][" + c + "]: ");
                    arr[r][c] = sc.nextInt();
                }
            }
            for (int r = 0; r < 2; r++) {
                for (int c = 0; c < 2; c++) {
                    sum += arr[r][c];
                }
            }
            System.out.println(sum);
        }


        // ============================================================
        // Question 19 - Min In Array
        // ============================================================
        static void minInArray() {
            int[] arr = new int[10];
            int min;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Minimum value is: " + min);
        }


        // ============================================================
        // Question 20 - Circumference Of Circle
        // ============================================================
        static void circumferenceOfCircle() {
            System.out.print("Enter radius: ");
            float radius = sc.nextFloat();
            float pi = 3.14f;
            float circumference = 2 * pi * radius;
            System.out.println(circumference);
        }


        // ============================================================
        // Question 21 - Area Of Rectangle
        // ============================================================
        static void areaOfRectangle() {
            System.out.print("Enter length: ");
            float length = sc.nextFloat();
            System.out.print("Enter breadth: ");
            float breadth = sc.nextFloat();
            float area = length * breadth;
            System.out.println(area);
        }


        // ============================================================
        // Question 22 - Perimeter Of Rectangle
        // ============================================================
        static void perimeterOfRectangle() {
            System.out.print("Enter length: ");
            float length = sc.nextFloat();
            System.out.print("Enter breadth: ");
            float breadth = sc.nextFloat();
            float perimeter = 2 * (length + breadth);
            System.out.println(perimeter);
        }


        // ============================================================
        // Question 23 - Swap Two Numbers (Using Temp)
        // ============================================================
        static void swapUsingTemp() {
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            int temp = a;
            a = b;
            b = temp;
            System.out.println("Value of a: " + a);
            System.out.println("Value of b: " + b);
        }


        // ============================================================
        // Question 24 - Swap Two Numbers (Without Temp)
        // ============================================================
        static void swapWithoutTemp() {
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("Value of a: " + a);
            System.out.println("Value of b: " + b);
        }


        // ============================================================
        // Question 25 - Average
        // ============================================================
        static void average() {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int avg = (a + b) / 2;
            System.out.println(avg);
        }


        // ============================================================
        // Question 26 - Fibonacci
        // ============================================================
        static void fibonacci() {
            System.out.print("Enter value of n: ");
            int n = sc.nextInt();
            int prev = 0;
            int next = 1;
            int sum = 0;
            System.out.println(prev);
            System.out.println(next);
            System.out.println(sum);
            while (sum <= n) {
                sum = prev + next;
                System.out.println(sum);
                prev = next;
                next = sum;
            }
        }


        // ============================================================
        // Question 27 - Armstrong Number
        // ============================================================
        static void armstrongNumber() {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int num = n;
            int a, b = 0;
            while (n > 0) {
                a = n % 10;
                n = n / 10;
                b = b + (a * a * a);
            }
            if (b == num) {
                System.out.println("Armstrong");
            } else {
                System.out.println("Not Armstrong");
            }
        }


        // ============================================================
        // Main Method — Call any question method here to run it
        // ============================================================
        public static void main(String[] args) {

            // Uncomment the method you want to run:

            // addAllDigits();
            // addAllElementsOfArray();
            // evenOdd();
            // greatestOfTwoNumbersBasic();
            // howManyDigitPresent();
            // maxArray();
            // loopTracing();
            // reverseNumber();
            // userPassword();
            // areaOfCircle();
            // checkPalindrome();
            // checkFactorial();
            // checkAbsoluteValue();
            // checkGreatestOfTwoNumbers();
            // checkCube();
            // checkAreaOfTriangle();
            // countEvenOddInMatrix();
            // sumOf2DArray();
            // minInArray();
            // circumferenceOfCircle();
            // areaOfRectangle();
            // perimeterOfRectangle();
            // swapUsingTemp();
            // swapWithoutTemp();
            // average();
            // fibonacci();
            // armstrongNumber();
        }

    }


