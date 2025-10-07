public class ReverseArray {
    public static void reverseArrayFun(int arr[]){
        
        int startIndex = 0;
        int endIndex = arr.length-1;
        
        while(startIndex<endIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            
            startIndex++;
            endIndex--;
        }
    }

    public static void main(String[] args) {
        int num[] = {10,20,30,40,50};
    
        reverseArrayFun(num);
        
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
