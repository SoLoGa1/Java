public class bubble_sort {

    public  bubble_sort(){

        int sort[]={15,43,105,50,1,5,75};

        for (int i=0;i<sort.length;i++)  {
            System.out.print(" "+ sort[i]);
        }
        Bubble_sort(sort);

        System.out.println();
        for (int i=0;i<sort.length;i++)  {
            System.out.print(" "+ sort[i]);
        }
    }
    public static void Bubble_sort(int arr[]) {
        boolean check = false;
int temp;
        while (!check) {
            check=true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {

                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                    check=false;
                }
            }

        }
    }
}
