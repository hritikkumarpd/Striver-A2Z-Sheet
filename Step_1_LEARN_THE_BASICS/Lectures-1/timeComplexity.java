import java.util.*;
public class timeComplexity {
    
    //Constant Time-- O(1)
    public static void constantExample(int[] arr){
        System.out.println("First element= "+arr[0]);
    }

    //Linear Time--O(n)
    public static void linearExample(int[] arr){
        System.out.println("Array Elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " "); //run n times

        }
        System.out.println();

    }

    //O(n^2)--Quadratic Time
    public static void quadraticExample(int n){
        System.out.println("Pairs");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println("(" +i+ ","+j+")");
            }
            System.out.println();
        }
    }

    //O(Log n)-- Logarithmic Time 
    public static void logarithmicExample(int n){
        System.out.println("Halving sequence: ");
        while(n>1){
            System.out.print(n+" ");
            n=n/2;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //Input array for examples
        int[] arr={ 1,2,3,4,5};

        //O(1)
        constantExample(arr);

        //O(n)
        linearExample(arr);

        //O(n^2)
        System.out.println("Enetr n for quadratic example: ");
        int n=sc.nextInt();
        quadraticExample(n);

        //O(Log n)
        System.out.print("Enetr a number for logarithmic example:");
        int num=sc.nextInt();
        logarithmicExample(num);

        sc.close();
    }
}


/*
📌 Time Complexity in Java (Basics)

👉 Definition:
   - Time Complexity measures how the runtime of an algorithm 
     grows with the size of the input (n).
   - It does not give actual time in seconds, but the growth rate.

👉 Why Learn Time Complexity?
   - To compare efficiency of algorithms.
   - To predict performance on large inputs.
   - To write optimized and scalable programs.

👉 Common Time Complexities:
   1. O(1)  → Constant Time
   2. O(log n) → Logarithmic Time
   3. O(n)  → Linear Time
   4. O(n log n) → Linearithmic Time
   5. O(n²) → Quadratic Time
   6. O(2^n) → Exponential Time
   7. O(n!) → Factorial Time

👉 Key Points:
   - Always analyze the number of operations with input size.
   - Focus on the "growth" not the exact runtime.
   - Big-O (O) → Worst Case, Ω → Best Case, Θ → Average Case.
   - Constants and smaller terms are ignored (e.g., O(2n) → O(n)).

👉 Rules of Thumb:
   - Single loop → O(n)
   - Nested loop → O(n²)
   - Divide by 2 each step → O(log n)
   - Loop inside loop with log → O(n log n)
*/
