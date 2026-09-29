public class changeArraytoMethod {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        System.out.println(arr[2]);
        //change(arr); {// this call the method and change the value of the array but it will not change the original array value because java is pass by value}
        arr[2] =88;
        System.out.println(arr[2]);
    }
    //public static void change(int[] arr) { // this is use for changing the array value in the method but it will not change the original array value because java is pass by value
       // arr[2] = 88;
        
    //}
}
