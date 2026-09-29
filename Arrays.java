//import java.util.*;
public class Arrays {
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        int mark[] = new int[4];
      //  mark[0] = sc.nextInt();
        //mark[1] = sc.nextInt();
       /// mark[2] = sc.nextInt();
       // mark[3] = sc.nextInt();
         mark[0] = 98;
        mark[1] = 99;
        mark[2] = 33;
        mark[3] = 100;
       // System.out.println("phy = " + mark[0]);
       // System.out.println("chem = " + mark[1]);
       // System.out.println("math = " + mark[2]);
        //System.out.println("bio= " + mark[3]);
        //int percentage = (mark[0] + mark[1]  + mark[2] + mark [3])/4;
        //System.out.println("percentage ="+ percentage +"%");
       // System.out.println("length of array =" + mark.length);
        for (int i=0; i<mark.length; i++){
            System.out.println(mark[i]);

        }
        for (int i = 3; i>=0; i--){
            System.out.println(mark[i]);
        }

    }
}
