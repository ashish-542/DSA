import java.util.*;

public class FindMinMaxNo {
    
    public static void findMinMax(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        
        System.out.println("Largest No. = "+ largest);
        System.out.println("Smallest No. = "+ smallest);
    }
    
    public static void main(String[] args) {
        // Find largest and smallest no. from an array
        
        int numbers[] = {10,20,30,40,50,90,70};
        findMinMax(numbers);
    }

}