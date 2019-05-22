import java.util.Arrays;

public class sorting {

    public static void main(String[] args)
    {
        int[] setOfnums={50,40,30,5,40,15,0,75,4};

        int min;
        min= setOfnums[0];

for (int i=0;i<setOfnums.length-1;i++) {
          if(min > setOfnums[i+1]) {
              min = setOfnums[i+1];
          }
            }
System.out.println(min);
        }

    }

