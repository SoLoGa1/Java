import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class BinarySearch {


    private static int binarySearch(int[] arr, int x) {

        int Left = 0; // arrais sawyisi indexi
        int Right = arr.length - 1; // bolo wevri

        int middle = Left + (Right - Left) / 2; // Shua wevri

        while (Left <= Right) {

            if (x == arr[middle]) {
                return middle;
            }

        }
        if (arr[middle] < x) {
            return Left = middle + 1;
        } else {
            Right = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4 , 6 , 8 , 10 , 12 , 14}; // ლუწი რაოდენობის რიცხვებზე არ მუშაობს //
        int x = 8;
        int Answer = binarySearch(arr, x);
        if (Answer == -1) {
            System.out.println(x + " is not in this array ");
        } else {
            System.out.println(x + "" + "'s index is " + Answer);
        }
    }
}
