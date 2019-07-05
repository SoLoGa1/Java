
import java.util.Scanner;

public class linearSearch {


    private static int linear(int[] arr, int x){

        for (int i =0;i<arr.length;i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x;
        int[] arr = new int[]{10,15,47,12,6};
        x = scan.nextInt();
        int check = linear(arr,x);
        if (check == -1){
            System.out.println("tqvens mier sheyvani ricxvi arrayishi ar aris ");
        }else{
            System.out.println("ricxvi "+x +" arrayishi aris indexat  "+ check);
        }




    }
}
