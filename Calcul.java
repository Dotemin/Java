public class Calcul {

    static void printSumOddNumbers(int lowNumber, int highNumber) {
        float count = 0;
        float sum = 0;
        for (int i = lowNumber; i <= highNumber; i++) {
            if (i % 2 != 0) { //sort odd number
                continue;
            }
            sum += i;
            count++;
        }
        System.out.println(" To sum only the odd numbers from " + lowNumber + " to " + highNumber + ", and print  the average.");
        System.out.println("The sum is " + sum);
        System.out.printf("The average is %.2f", ((double) sum / count));
        System.out.println();
    }

    static void printSumNumbersDivisibleBySeven(int lowNumber, int highNumber) {
        float count = 0;
        float sum = 0;

        for (int i = lowNumber; i <= highNumber; i++) {
            if (i % 7 != 0) {
                continue;
            }
            sum += i;
            count++;
        }

        System.out.println("6. Sum numbers from " + lowNumber + " to " + highNumber + " that is divisible by 7, and compute the average.");
        System.out.println("The sum is " + sum);
        System.out.printf("The average is %.2f", ((double) sum / count));
        System.out.println();
    }

   static void printSumSquares(int lowNumber, int highNumber) {
        float count = 0;
        float sum = 0;

        for (int i = lowNumber; i <= highNumber; i++) {
            sum += i * i;
            System.out.println(i * i);
            count++;
        }
        System.out.println("7. Sum of the squares from " + lowNumber + " to " + highNumber + ".");
        System.out.println("The sum is " + sum);
        System.out.printf("The average is %.2f", ((double) sum / count));
        System.out.println();
    }


    public static void main(String[] args) {
        int upperNumber = 100;
        if (upperNumber <= 0) {
            System.out.println("Error: upperNumber less than 0!");
            return;
        }
        printSumOddNumbers(1, 100);
        printSumNumbersDivisibleBySeven(1, 100);
        printSumSquares(1, 100);
    }
}