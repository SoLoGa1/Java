import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    int first=0 , secend=1, third , count;
        System.out.print("Enter Positive Number (how many fibonacci series do you want to print ): ");
        count = scan.nextInt();
        System.out.print(first +" ; "+ secend);
        for(int i = 2; i<count; i++) {
            third = first + secend;
            System.out.print(" ; "+third);
            first = secend;
            secend = third;
        }
    }
}

