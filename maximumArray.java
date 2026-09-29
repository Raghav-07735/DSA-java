public class maximumArray {
public static void main(String args[]){
    int arr[] = {-6,8,14,-2,23,47,4,3,10};
    int max = arr[0];
    for(int i=0; i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
        
        
    }
    System.out.println("Maximum element in the array is: " + max);
}
}
