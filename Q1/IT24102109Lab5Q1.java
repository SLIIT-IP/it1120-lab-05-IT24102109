import java.util.Scanner;

public class IT24102109Lab5Q1{

              public static void main(String[] args){
      
                           int num1, num2, num3, max, min;
          

                           Scanner sc = new Scanner(System.in);

                           System.out.print("Enter the first integer: ");
                           num1 = sc.nextInt();

                           System.out.print("Enter the second integer: ");
                           num2 = sc.nextInt();

                           System.out.print("Enter the third integer: ");
                           num3 = sc.nextInt();

                           System.out.println(" ");

                           System.out.println("User entered numbers are: " + num1 + " " + num2 +" " + num3);
                           

                           if (num1 > num2){
                                   max = num1;
                                   min = num2;
                           }
                           else{
                                   min = num1;
                                   max = num2;
                           }


                          if(num3 > max){
                                   max = num3;
                               
                          }
                          else if(num3 < max && num3 < min){
                                   min = num3;
                          }

 
                          System.out.println("The smallest number is: " + min);
                          System.out.println("The largest number is: " + max);



              }

}