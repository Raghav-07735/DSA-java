public class minimumArray {
    public static void main(String args[]){
        int arr[] = {-6,8,14,-2,23,47,4,3,10};
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            else{
                continue;
            }
            
            
        }
        System.out.println("Minimum element in the array is: " + min);
    }
}
