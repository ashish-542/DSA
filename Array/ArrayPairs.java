public class ArrayPairs {
    public static void arrayPairs(int arr[]){
        int totalPairs = 0; // n(n-1)/2 //Sum of n-1 nos. in Arithmetic Progression
        for(int i=0; i<arr.length; i++){
            int currentIndex = i;
            for(int j=currentIndex+1; j<arr.length; j++){
                System.out.print("("+arr[currentIndex]+","+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        
        System.out.println("Total Pairs = "+ totalPairs);
    }
    
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50};
    
        arrayPairs(num);
    }
}
