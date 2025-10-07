public class linearSearch {
    public static int linearSearchFun(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60};
        int key = 90;
        
        // for(int i=0; i<numbers.length; i++){
        //     if(numbers[i]==key){
        //         System.out.println(key + " is found at index " + i);
        //     }
        // }

        int index = linearSearchFun(numbers,key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println(key + " is found at index " + index);
        }
    }
}
