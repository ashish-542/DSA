public class BinarySearch {
    // prerequisite : Sorted Array
    // Time Complexity : O(log n)
    public static int binarySearchFun(int arr[], int key){
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            
            if(arr[mid] == key){
                return mid;
            }
            
            if(arr[mid]<key){
                start = mid+1;
            }
            
            if(arr[mid]>key){
                end = mid-1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50};
        int key = 10;
    
        System.out.println("No. found at "+ binarySearchFun(num,key));
    }
}
