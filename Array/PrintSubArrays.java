public class PrintSubArrays {
    public static void subArraysFun(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
    
        subArraysFun(num);
    }
}