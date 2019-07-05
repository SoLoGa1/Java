public class JumpSearch {
    public static int jumpSearch(int[] arr, int x){
       int n = arr.length;
        int jumpStep = (int)Math.floor(Math.sqrt(n)); // fesvi arrais zomidan jump stepis zomis gansazgvristvis
        int answer = 0;

        while(arr[Math.min(jumpStep,n)-1] < x){
answer = jumpStep;

jumpStep += (int)Math.floor(Math.sqrt(n));
            if (answer >= n)
                return -1;  // arraishi jump searchit mosadzebni ricxvi ar aris

        }
        while(arr[answer]<x) // sanam mosadzebni ricxvi didia indexze myof ricxvze
        {
 answer++;
            if (answer == Math.min(jumpStep, n))
                return -1;  // tu ver moidzebna
        }
        if (arr[answer] == x)
            return answer;

        return -1;
    }

    public static void main(String[] args){
        int[] arr = new int[] {0,2,2,10,20,30,35,60,75,175,180,195,250,295};
        int x = 10;
       int answer = jumpSearch(arr,x);

        System.out.println(x + " aris indexat "+ answer);


    }
}
