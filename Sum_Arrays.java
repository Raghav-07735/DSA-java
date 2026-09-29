import java.util.*;

public class Sum_Arrays {
    public static void main(String args[]) {
        float marks[] = {88.5f, 90.5f, 78.8f, 80.9f, 70.0f, 90.0f};
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("Sum of array elements: " + sum);

        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }

        if (isInArray) {
            System.out.println("The value is present in the array.");
        } else {
            System.out.println("The value is not present in the array.");
        }

        int mat1[][] = {{1, 2, 3},
                        {4, 5, 6}};
        int mat2[][] = {{1, 4, 3},
                        {4, 5, 6}};
        int resultant[][] = {{0, 0, 0},
                            {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                resultant[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Resultant matrix:");
        for (int i = 0; i < resultant.length; i++) {
            for (int j = 0; j < resultant[i].length; j++) {
                System.out.print(resultant[i][j] + " ");
            }
            System.out.println();
        }
    }
}

