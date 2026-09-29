import java.util.Arrays;
public class ShallowCoppyDeepCoppyArray {
    public static void main(String args[]){
        int arr[] ={1,2,3,4,5,6,7,8,9};
        //int[] x=arr;  this is shallow copy because it will copy the reference of the array and any change in x will also change the original array value
      //  x[2]=44;
       // System.out.println(arr[2]);  this will print 44 because x is a shallow copy of arr
       int x[]= Arrays.copyOf(arr,arr.length);// this is deep copy because it will create a new array and copy the values of the original array to the new array and any change in x will not change the original array value
        x[2]=44;
        System.out.println(arr[2]); // this will print 3 because x is a deep copy of arr    
        System.out.println(x[2]); // this will print 44 because x is a deep copy of arr
    }

}
