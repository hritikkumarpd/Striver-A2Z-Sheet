import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Integer number: ");
        int num = sc.nextInt();

        // ✅ Check Odd or Even
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number");
        } else {
            System.out.println(num + " is Odd Number");
        }

        // ✅ IF-Else-If-Else Statements (Division System)
        if (num >= 60 && num <= 100) {
            System.out.println("1st Division Passed");
        } else if (num >= 50 && num < 60) {
            System.out.println("2nd Division Passed");
        } else if (num >= 40 && num < 50) {
            System.out.println("3rd Division Passed");
        } else if (num >= 0 && num < 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Marks (Enter between 0–100)");
        }

        sc.close();
    }
}


    /*
If-Else Statements in Java

1. What is If-Else?
- Definition: Used to make decisions in code based on conditions.
- If the condition is true → one block of code runs.
- If the condition is false → another block (else part) can run.

2. Syntax

if (condition) {
    // code if condition is true
} else {
    // code if condition is false
}

- Condition is always boolean (true / false)

3. Variations

✅ Simple if
if (a > 0) {
    System.out.println("Positive");
}

✅ if-else
if (a % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

✅ if-else if-else (multiple conditions)
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}

✅ Nested if (if inside another if)
if (a > 0) {
    if (a % 2 == 0) {
        System.out.println("Positive Even");
    }
}

4. Example Program

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}

5. Notes
- Conditions use relational operators (==, !=, <, >, <=, >=)
- Combine conditions with logical operators (&&, ||, !)
- Most DSA problems involve checking ranges or equality (e.g., even/odd, prime check, boundaries in arrays)

Example for DSA:
if (index >= 0 && index < arr.length) {
    // safe to access arr[index]
}
*/


