import java.util.Scanner;

public class Incometaxcalulator {
    public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
     int Income = scanner.nextInt();
     int Tax;
        if(Income <= 300000) {
        Tax = 0;
        }
        else if (Income >= 300001 && Income < 700000)
        {
                 Tax =(int) (Income *0.005);   
        }
        else if (Income >= 700001 && Income < 1000000)
        {
             Tax =(int) (Income *0.01);
         }
         else if (Income >= 1000001 && Income < 1200000)
        {
             Tax =(int) (Income *0.15);
            }
            else if (Income >= 1200001 && Income < 1500000)
        {
             Tax =(int) (Income *0.2);
            }
            else
             {
                Tax = (int) (Income * 0.3);
            }
        System.out.println("Your Tax is "+ Tax);
           }
 }

