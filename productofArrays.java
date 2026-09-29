public class productofArrays {
    public static void main(String args[]){
        int[] arr = {3,4,6,7,8,9};
        int product = 1;
        for(int i = 0; i<arr.length; i++){
            product*=arr[i];
        }
        System.out.println(product);
    }
}
