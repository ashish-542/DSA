import java.util.*;

public class LoopQues{
    public static void main(String args[]){
        // Question 1 :How many times 'Hello' is printed?
        // for(int i=0;i<5;i++) {
        //     System.out.println("Hello - "+i);
        //     i+=2;
        // }
        // my ans - 3
        // actual ans - 2
        // After first print and i+=2, i becomes 2.

        // Then loop's i++ makes i=3 before next iteration.

        // After printing for i=3, i+=2 makes i=5.

        // Then i++ makes i=6.

        // At this point, i<5 is false, so loop ends.


        // Question2:Write a program that reads a set of integers, and then prints the sum of the even and odd integers

        // Scanner sc = new Scanner(System.in);
        // int even_sum =0, odd_sum = 0,n;
        // while(true){
        //     System.out.print("Enter a no. - ");
        //     n = sc.nextInt();
        //     if(n%2==0){
        //         even_sum +=n;
        //     }else{
        //         odd_sum +=n;
        //     }
        //     System.out.println("\nSum of even nos - "+even_sum);
        //     System.out.println("Sum of odd nos - "+odd_sum);
        // }

        // Getting error - 
        // Enter a no. - Exception in thread "main" java.util.NoSuchElementException
        // at java.base/java.util.Scanner.throwFor(Scanner.java:962)
        // at java.base/java.util.Scanner.next(Scanner.java:1619)
        // at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
        // at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
        // at LoopQues.main(LoopQues.java:29)

        // Optimized approach

        // int choice;

        // do{
        //     System.out.print("Enter a no. - ");
        //     n = sc.nextInt();
        //     if(n%2==0){
        //         even_sum +=n;
        //     }else{
        //         odd_sum +=n;
        //     }

        //     System.out.println("\nDo you want to keep entering the nos ? \nPress 0 - No \nPress 1 - Yes");
        //     choice = sc.nextInt();
            
        // }while(choice==1);

        // System.out.println("\nSum of even nos - "+even_sum);
        // System.out.println("Sum of odd nos - "+odd_sum);

        // Question 3 :Write a program to find the factorial of any number entered by the user.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a no. - ");
        // int n = sc.nextInt();

        // int factorial = 1;
        // if(n<0){
        //     System.out.println("Error - You entered a negative no.");
        // }else{
        //     if(n==0 || n==1){
        //         factorial = 1;
        //     }else{
        //         for(int i=2;i<=n;i++){
        //             factorial *=i;
        //         }
        //     }
        //     System.out.println("Factorial of no. - "+n+" = "+factorial);
        // }

        // Question4: Write a program to print the multiplication table of a number N,entered by user

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a no. - ");
        // int n = sc.nextInt();

        // System.out.print("\nEnter a range - ");
        // int r = sc.nextInt();

        // for(int i=1; i<=r; i++){
        //     System.out.println(n+" X "+i+" = "+n*1);
        // }

        // Question 5 :What is wrong in the following program?

        // for(int i=0; i<=5; i++){
        //     System.out.println("i = "+i);
        // }

        // System.out.println("i after the loop = "+ i);

        // Sol. Scope of variable is referred to the part of the program where the variable can be used.
        // In this programvariableiisdeclaredintheforloop.Soscopeofvariableiislimitedtotheforlooponlythatisbetween{and}oftheforloop.Thereisadisplaystatementaftertheforloopwhere variableiis used which meansiis used outof scope. This leads to compilation errors.Theprogramgivenwillnotrunandgiveanerrorinstead.Tocorrecttheprogram,thevariableineeds to be declared outside the for loop

    }
}