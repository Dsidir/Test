
package calculateages;

import java.util.Scanner;

public class CalculateAges {

    
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
      System.out.println(" What is your age? ");
      Scanner sc =new Scanner(System.in);
         int age=sc.nextInt();
         int curentYear=2020;
        int yearBorn= curentYear-age;
	System.out.println(" You were born in "+(yearBorn));
        if (yearBorn<1960)
	System.out.println(" In 1960 you were "+(1960-yearBorn)+"y.o.");
        
        else {
        System.out.println("In 1960 you were not borned.");
                }
	System.out.println(" In 2040 you will be "+(2040-yearBorn)+"y.o.");
      }
   }
    }
    