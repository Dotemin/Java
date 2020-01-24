/*
* Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average. The output shall look like:
The sum is 5050
The average is 50.5
* */

public class SumAndAverage {
    public static void main(String[] args) {
        int sum=0;
        int lowNumber=1;
        int highNumber=100;
        float average;
        for(int i=lowNumber; i<=highNumber; ++i){
            sum+=i;
        }
        average = sum/highNumber;
        System.out.println("the sum = " + sum);
        System.out.println("the average = " + average);
    }


}
