import java.util.*;

public class ArrayOperations {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        // Create
        int marks[] = new int[3];

        // Input
        marks[0] = 100;
        marks[1] = 89;
        marks[2] = 89;

        // output
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // Update

        marks[1] = 100;
        marks[2] = marks[2] + 1;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // Loops
        // array index starts from 0
        // array index ends at length-1
        // size = 50
        // index -> 0 to 49

        // Create
        int num[] = new int[5];
        
        // Input from user
        for(int i=0; i<num.length; i++){
            System.out.println("Enter a no.");
            num[i] = sc.nextInt();
        }
        
        // Output loop
        for(int i=0; i<num.length; i++){
            System.out.println(i + " index no. = " + num[i]);
        }
        
        // Update by 1
        for(int i=0; i<num.length; i++){
            num[i] = num[i] + 1;
        }
        
        System.out.println("----After updation by 1----");
        // Output loop after updation
        for(int i=0; i<num.length; i++){
            System.out.println(i + " index no. = " + num[i]);
        }

        sc.close();

    }
}