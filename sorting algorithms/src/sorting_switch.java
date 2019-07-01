import java.util.Scanner;

public class sorting_switch {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int casse;
        System.out.print("\n\n\t\t Choose one from this sortings ");
        System.out.println("\n\n\t Selection Sorting  (input 1 to choose )");
        System.out.println("\n\n\t Bubble Sort  (input 2 to choose )");
        System.out.println("\n\n\t Insertion Sorting  (input 3 to choose )");
        casse = scan.nextInt();
switch (casse){

    case 1 :
        //Selection sorting class obj implementation
selection_sort selection = new selection_sort();

        break;
    case 2 :
        //Bubble sorting class obj implementation
bubble_sort bubble = new bubble_sort();
        break;
    case 3 :
        //Selection sorting class obj implementatio
insertion_sorting insertion = new insertion_sorting();
        break;

    default:
        break;

}


    }
}
