package Contions.java;
import java.util.Scanner;
public class AreaOfRectangleGreaterThenPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length :");
        int length=sc.nextInt();
        System.out.println("Enter a bridth :");
        int bridth=sc.nextInt();
        int area=length*bridth;
        System.out.println("The area of the rectangle is:"+area);
        int perimeter=2*(length*bridth);
        System.out.println("The perimeter of the rectangle is:"+perimeter);
        if(area>perimeter){
            System.out.println("The area is greater than perimeter");
        }
        if (perimeter>area){
            System.out.println("The area is less than perimeter");
        }
        if(perimeter==area){
            System.out.println("The area is equal to perimeter");
        }


    }
}
