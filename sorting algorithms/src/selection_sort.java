public class selection_sort {

    public  selection_sort(){

int sort[]={15,4,3,10,5};

  for (int i=0;i<sort.length;i++)  {
      System.out.print(" "+ sort[i]);
    }
        Selection_sort(sort);

        System.out.println();
        for (int i=0;i<sort.length;i++)  {
            System.out.print(" "+ sort[i]);
        }
    }
    public static void Selection_sort(int sort[]){

         int min;

    for (int i = 0; i < sort.length - 1; i++) {
        min = i;

        for (int j = i + 1; j < sort.length; j++) {
            if (sort[j] < sort[min]) {
                min = j;

            }

            if (min != i) {
                int temp = sort[i];
                sort[i] = sort[min];
                sort[min] = temp;
            }

         }
      }
    }
}



