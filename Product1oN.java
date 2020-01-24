
public class Product1oN {

    static void printProduct1ToN(int number)
    {
        float prod = 1F;
        for(int i=1; i <= number; i++) {
            prod *= i;
        }
        System.out.println("8. Product of integers 1 to " + number + ".");
        System.out.println(prod);
    }

    public static void main(String[] args) {
        printProduct1ToN(10);
        printProduct1ToN(11);
        printProduct1ToN(12);
        printProduct1ToN(13);
        printProduct1ToN(14);


    }
    }
