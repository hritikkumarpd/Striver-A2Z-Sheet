import java.util.Scanner;
public class BasicArray {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("====Array Example===");

        //Creating Array of Size 5
        int arr[]= new int[5];

        //Adding Element to the Array using For Loops
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter value at index " + i + ": ");
            arr[i]= sc.nextInt();
        }
        //Accessing Array using For Loops
        for(int i=0; i<arr.length; i++){
            System.out.println("Elements at index "+ i+"  is "+arr[i]);
        }

        //Accessing Array Using While loop
        int j=0;
        while(j<arr.length){
            System.out.println("Elements at index "+j+"  is "+arr[j]);
            j++;
        }
        //Updating Element at Specific Index
        System.out.println("Enter the Index number to be update(0-4)");
        int updateIndex= sc.nextInt();
        System.out.println("Enter the Updated Value");
        int newValue= sc.nextInt();
        if(updateIndex>=0 && updateIndex<arr.length){
            arr[updateIndex]=newValue;
            System.out.println("Updated Array are:");
            for(int i=0; i<arr.length; i++){
                System.out.println("Updated Array is "+arr[i]);
            }
        }
        else{
            System.out.println("Invalid Index(Enter Between 0-4)");
        }

        //Removing Element at Specific Index
        System.out.println("Enter the Index to remove(0-4)");
        int removeIndex= sc.nextInt();
        if(removeIndex>=0 && removeIndex<arr.length){
            for(int i=removeIndex; i<arr.length-1; i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
            System.out.println("Array After Removal");
            for(int i=0; i<arr.length; i++){
                System.out.println("Element at index "+i+ "is "+ arr[i]);
            } 
        } else{
            System.out.println("Invalid Index");
        }
        sc.close();
    }
}


/*
📌 ARRAYS IN JAVA

1️⃣ What is an Array?
- An array is a collection of elements of the same type.
- It is stored in a continuous block of memory.
- Index-based access (first element at index 0).

2️⃣ Creating an Array
int[] numbers = new int[5];   // array of size 5

// Or initialize while declaring
int[] nums = {10, 20, 30, 40, 50};

3️⃣ Adding / Inserting Elements
- For fixed size arrays, we assign values at each index:

numbers[0] = 5;
numbers[1] = 10;
numbers[2] = 15;
numbers[3] = 20;
numbers[4] = 25;

4️⃣ Reading / Accessing Elements
- Using a for loop:

for (int i = 0; i < numbers.length; i++) {
    System.out.println("Element at index " + i + " is " + numbers[i]);
}

// Using while loop:
int i = 0;
while (i < numbers.length) {
    System.out.println("Element at index " + i + " is " + numbers[i]);
    i++;
}

5️⃣ Updating Elements
- Change a value at a particular index:

numbers[2] = 50;  // Now 3rd element becomes 50

// Verify with loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

6️⃣ Removing / Ignoring Elements
- Java arrays have fixed size, so we cannot shrink them.
- To "remove" an element, we can set it to 0 or shift elements:

// Example: Remove element at index 1
for (int i = 1; i < numbers.length - 1; i++) {
    numbers[i] = numbers[i + 1];   // shift left
}
numbers[numbers.length - 1] = 0;   // last element set to 0

7️⃣ Summary
- Arrays store multiple values of same type.
- Index-based access makes it fast.
- Fixed size, so "removal" requires shifting or creating new array.
- Loops are commonly used to traverse and modify arrays.
*/

