import java.util.Scanner;
public class SwitchStatement {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //Switch Case
        System.out.println("Enter the Days-Number(1-7)");
        int day=sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("Invalid Number, Enter Between 1-7: ");
                break;
        }
        sc.close();     

    }
}



/*
Switch Statement in Java

📌 Definition:
   The switch statement in Java is a control flow statement 
   that allows a variable to be tested against a list of values 
   (cases). It is used when we need to execute one block of code 
   out of many options based on the value of an expression.

👉 When to use?
   - Best choice when one variable/value is compared with multiple options.
   - Makes code more readable and cleaner compared to multiple if-else statements.

👉 Basic Syntax:

switch(expression) {
    case value1:
        // executes if expression == value1
        break;

    case value2:
        // executes if expression == value2
        break;

    ...
    default:
        // executes if no case matches
}

👉 Key Points:
   - Expression can be int, char, byte, short, enum, or String.
   - Each "case" must be unique and constant.
   - "break" prevents fall-through (execution of next case).
   - "default" is optional, but good practice to handle unexpected values.
   - Improves code readability and structure in decision-making programs.
*/

