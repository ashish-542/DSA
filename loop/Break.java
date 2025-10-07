import java.util.*;

public class Break {
    public static void main(String args[]){
        // Q1. Print nos. from 1-5 but skip 3
        // for(int i=1;i<=5;i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println("No. is "+i);
        // }

        // Q2. Keep entering nos. till user enters a multiple of 10
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a no. - ");
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println("------ Loop break ------");
                break;
            }
            System.out.println("No. is "+n);
            sc.close();
        }
    }
}