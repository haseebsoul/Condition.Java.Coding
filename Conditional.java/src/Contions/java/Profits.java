package Contions.java;
import java.util.Scanner;
public class Profits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price :");
        double costPrice = sc.nextDouble();
        System.out.println("Enter the seeling price :");
        double seelingPrice = sc.nextDouble();
        if (costPrice <= seelingPrice) {
            System.out.println("The seeling price is lower than cost price");
            System.out.println(seelingPrice-costPrice);
        }
        else  {
            System.out.println("The seeling price is higher than cost price");
            System.out.println(costPrice-seelingPrice);
        }


     }
}
