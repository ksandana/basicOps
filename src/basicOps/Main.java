package basicOps;

import sun.awt.geom.AreaOp;

public class Main {
    public static void main(String[] args) {
        //addition
        //subtraction
        //division
        //multiplication
        //reminder
        int firstNum = 10;
        int secondNum = 30;
        int result = firstNum + secondNum;
        System.out.println("ths sum is " + (firstNum + secondNum));
        System.out.println("ths difference is " + (firstNum - secondNum));
        System.out.println("ths division is " + (firstNum / secondNum));
        System.out.println("ths multiplication is " + (firstNum * secondNum));
        System.out.println("ths remainder is " + (firstNum % secondNum));

        //if condition
        if (firstNum != secondNum) {
            System.out.println("success");
        } else {
            System.out.println("abort value is " +result);
        }

       //for loop
        for (int i=0; i <= firstNum; ++i){

            if (i%5==0){
                System.out.println( i+ " is muliple of 5");
            }
            else
            {
                System.out.println( i+" is not muliple of 5 ");
            }

        }
        int i=0;
        while(i <5)
        {
            System.out.println(+ i + " i am less than 5");
            i++;
        }
    }
}
