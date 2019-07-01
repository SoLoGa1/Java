public class insertion_sorting {

    public insertion_sorting() {

        int sort[] = {5, 3, 8, 2, 1, 9, 4};

        for (int i = 0; i < sort.length; i++) {
            System.out.print(" " + sort[i]);
        }
        Insertion_sort(sort);

        System.out.println();
        for (int i = 0; i < sort.length; i++) {
            System.out.print(" " + sort[i]);
        }
    }

    public static void Insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }
    }
}
