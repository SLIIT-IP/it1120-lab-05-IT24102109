import java.util.Scanner;

public class IT24102109Lab5Q3{

        public static void main(String[] args){

               final double ROOMCHARGE_PERDAY = 48000.0;
               final double DISCOUNT_3_TO_4_DAYS = 0.1;
               final double DISCOUNT_5_OR_MORE_DAYS = 0.2;

               int start_date, end_date, reserved_days;
               double discount_amount, total_amount;

               Scanner sc = new Scanner(System.in);

               System.out.print("Enter Start Date (1-31): ");
               start_date = sc.nextInt();

               System.out.print("Enter End Date (1-31): ");
               end_date = sc.nextInt();

               if (start_date < 1 || start_date > 31 || end_date < 1 || end_date > 31){
                          System.out.println("Error: Days must be between 1 and 31");
               }
               else if (start_date > end_date){
                          System.out.println("Error: Start Date must be less than End Date");
               }  
               else{

                          System.out.println(" ");

                          reserved_days = end_date - start_date;
                          
                          if (reserved_days >= 5){
                              discount_amount = ROOMCHARGE_PERDAY*reserved_days*DISCOUNT_5_OR_MORE_DAYS; 
                              
                          }
                          else if (reserved_days >= 3){
                              discount_amount = ROOMCHARGE_PERDAY*reserved_days*DISCOUNT_3_TO_4_DAYS;

                          }
                          else{
                              discount_amount = 0;

                          }

                          total_amount = ROOMCHARGE_PERDAY*reserved_days - discount_amount;

                              System.out.println("Room Charge Per Day: " + "Rs." + " " + ROOMCHARGE_PERDAY + "/=");
                              System.out.println("Number of Days Reserved: " + reserved_days); 
                              System.out.println("Total Amount to be Paid: " + total_amount);



               }



        }



}