import java.util.Scanner;
public class BasicString {
    public static void main(String args[]){
      Scanner sc =new Scanner(System.in);

    //Input a String
    System.out.println("Enter the String");
    String str = sc.nextLine();

    //Original String
    System.out.println("Original String is: "+str);

    //Count Character
    int Count=0;
    for(int i=0; i<str.length(); i++){
        Count++;
    }
    System.out.println("Total Characters is: "+Count);

    //Count Words
    int count=0;
    boolean inWord = false;
    for(int i=0; i<str.length(); i++){
        if(str.charAt(i)!=' ' && !inWord){
            count++;
            inWord=true;
        }
        else if(str.charAt(i)==' '){
            inWord=false;
        }
    }
    System.out.println("Total Words: "+count);
    

}
}




































/*
📌 STRINGS IN JAVA

1️⃣ What is a String?
- A string is a sequence of characters.
- In Java, strings are objects of the String class.
- Strings are immutable (once created, they cannot be changed directly).

2️⃣ Creating a String
// Using string literal
String str1 = "Hello";

// Using new keyword
String str2 = new String("World");

3️⃣ Adding / Assigning Values
// Assign value at creation
String message = "Java is fun";

// Concatenate strings (combine two strings)
String fullMessage = str1 + " " + str2;  // "Hello World"

4️⃣ Reading / Accessing Characters
// Using charAt() method
char ch = str1.charAt(0);  // first character 'H'

// Using for loop to traverse string
for (int i = 0; i < str1.length(); i++) {
    System.out.println("Character at index " + i + " is " + str1.charAt(i));
}

// Using while loop
int i = 0;
while (i < str1.length()) {
    System.out.println("Character at index " + i + " is " + str1.charAt(i));
    i++;
}

5️⃣ Updating Strings
// Strings are immutable, so we create a new string
String newStr = str1.replace('H', 'J');  // "Jello"

// Concatenation also creates a new string
String combined = str1 + " Java";  // "Hello Java"

6️⃣ Removing / Ignoring Characters
// Substring can be used to remove part of string
String sub = str1.substring(1);  // removes first character -> "ello"

// To remove all occurrences of a character
String removed = str1.replace("l", "");  // "Heo"

7️⃣ Summary
- Strings store textual data.
- Immutable: every change creates a new string.
- Access characters using charAt() or loops.
- Combine strings using concatenation (+) or concat() method.
- Use substring, replace for partial changes or removing parts.
*/

