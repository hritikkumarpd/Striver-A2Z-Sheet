import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer Value:");
        int a = sc.nextInt();                              // Integer Example: 25

        System.out.println("Enter The Long Value:");
        long b = sc.nextLong();                            // Long Example: 1234567890L

        System.out.println("Enter the Double Value:");
        double c = sc.nextDouble();                       // Double Example: 12.34

        System.out.println("Enter the Character:");
        char d = sc.next().charAt(0);               // Character Example: A

        System.out.println("Enter String (One Word):");
        String word = sc.next();                          // String (Single Word) Example: Hritik
        sc.nextLine();                                    // Consume leftover newline

        System.out.println("Enter String (Full Line):");
        String fullLine = sc.nextLine();                  // String (Full Line) Example: Hritik Kumar TMSL

        sc.close();

        System.out.println("Integer: " + a);
        System.out.println("Long: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + d);
        System.out.println("String (Single Word): " + word);
        System.out.println("String (Full Line): " + fullLine);
    }
}




/*
 Java Data Types

1. What are Data Types?
- Definition: Data types tell Java what kind of data a variable can store.
- Categories:
  1. Primitive Data Types → predefined in Java (8 total)
  2. Non-Primitive Data Types → created by user or Java library (e.g., String, arrays, classes)

2. Primitive Data Types (8 total)

Data Type   | Size    | Default Value | Range                                           | Example                  | Scanner Input
---------------------------------------------------------------------------------------------------------------
byte        | 1 byte  | 0             | -128 to 127                                    | byte x = 10;             | sc.nextByte()
short       | 2 bytes | 0             | -32,768 to 32,767                              | short y = 200;           | sc.nextShort()
int         | 4 bytes | 0             | -2,147,483,648 to 2,147,483,647               | int z = 1000;            | sc.nextInt()
long        | 8 bytes | 0L            | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | long big = 100000L; | sc.nextLong()
float       | 4 bytes | 0.0f          | ~7 decimal digits precision                    | float pi = 3.14f;        | sc.nextFloat()
double      | 8 bytes | 0.0d          | ~15 decimal digits precision                   | double d = 3.14159;      | sc.nextDouble()
char        | 2 bytes | '\u0000'      | 0 to 65,535 (Unicode)                          | char ch = 'A';           | sc.next().charAt(0)
boolean     | ~1 bit  | false         | true / false                                   | boolean flag = true;     | sc.nextBoolean()

Most commonly used → int, long, double, char, String

3. Non-Primitive Data Types

Type      | Description             | Example                   | Input
---------------------------------------------------------------------------
String    | sequence of characters  | String s = "hello";       | sc.next() (word), sc.nextLine() (sentence)
Array     | collection of similar data | int arr[] = {1,2,3};   | loop + scanner
Class     | blueprint of objects    | class Student {}          | custom
*/
