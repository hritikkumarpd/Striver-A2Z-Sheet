import java.util.Scanner;
public class inputOutput{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Name");
        String name=sc.nextLine();                   //for String Input
        System.out.println("Enter the Age");
        int age=sc.nextInt();                        //Integer Input
        System.out.println("Enter Phone Number");
        long phn=sc.nextLong();                      //Long Input



        sc.close();

        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("Phone Number: "+ phn);

    }
}