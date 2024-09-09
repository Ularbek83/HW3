import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] functionalNums={2.2, 4.1, -5.5, 16.5, 10.1, -20.3, -80.8, 30.9, -6.6, 7.8, 10.5, 5.3, -7.7, 6.5, 9.0};

        double average = 0.0;
        int count = 0;

        boolean isNegativeNumberFound = false;


        for (int i = 0; i < functionalNums.length; i++) {
            if (isNegativeNumberFound && functionalNums[i] > 0)
            {
                average = average + functionalNums[i];
                        count ++ ;
                    }

            if ( functionalNums[i] <  0 && !isNegativeNumberFound  )
            {
              isNegativeNumberFound = true;
            }
        }
           System.out.println(("average: " + average));
           System.out.println(("count: " + count));
           System.out.println(("average/count: " + average/count));

        }
    }
