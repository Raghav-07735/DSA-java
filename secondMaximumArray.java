public class secondMaximumArray {
    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 8, 9};

        int max = arr[0];
        int smax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Second Maximum = " + smax);
    }
}