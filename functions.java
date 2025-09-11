import java.util.*;

public class functions{
    //1. Function with no return & no parameter
    public static void greet(){
        System.out.println("Hello Welcome to java functions.");

    }

    //2.Function with no return & with Parameter
    public static void printName(String name){
        System.out.println("Your name is: "+name);
    }

    //3.Functions with return & no parameter
    public static int getFixedNumber(){
        return 42;
    }

    //4. Functions with return and parameter
    public static int add(int a, int b){
        return a+b; 
    }

    //5.Recursive Function(factorial Example)
    public static int factorial(int n){
        if(n==0 || n==1) return 1; //base case
        return n*factorial(n-1); //recursive call
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //function 1
        greet();

        //function 2
        System.out.println("Enter your name");
        String name= sc.nextLine();
        printName(name);

        //function 3
        int fixed =getFixedNumber();
        System.out.println("Fixed number = "+fixed);

        //function 4
        System.out.println("Enter two number to add: ");
        int x= sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Sum = "+add(x,y));

        //function 5
        System.out.println("Enter a number for factorial: ");
        int num= sc.nextInt();
        System.out.println("Factorial of "+ num+ "="+ factorial(num));

        sc.close();
    }

}







/*
📌 Functions (Methods) in Java

👉 Definition:
   - A function (in Java called "method") is a block of code 
     that performs a specific task and can be reused multiple times.

👉 Why use Functions?
   - Avoids code repetition (reusability).
   - Improves readability and structure.
   - Makes code easier to test, debug, and maintain.

👉 Syntax:
   returnType methodName(parameters) {
       // method body
       return value; // optional (if returnType is not void)
   }

👉 Types of Methods:
   1. No return, No parameter
   2. No return, With parameter
   3. With return, No parameter
   4. With return, With parameter
   5. Recursive methods (method calling itself)

👉 Key Points:
   - Methods can be static (called without object) or non-static (need object).
   - Java is "pass by value" → only copy of variable is passed.
   - Return type "void" means method does not return anything.
   - Method overloading (same method name, different parameter list) is allowed.
   - Varargs (variable arguments) allow passing multiple values.
*/