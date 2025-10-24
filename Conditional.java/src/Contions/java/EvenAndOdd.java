package Contions.java;
import java.util.Scanner;
public class EvenAndOdd {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num=input.nextInt();
        int x=input.nextInt();
        if(num%2==0 &&  x%2==0){
            System.out.println("Even"+ num +"The one you enterd "+x);
        }
        else if(num%2!=0&&x%2!=0){
            System.out.println("Odd"+""+x+"The one you entered "+num );
        }
    }
}
