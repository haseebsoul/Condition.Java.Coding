 package Contions.java;
import java.util.Scanner;
public class  Absolute{
    public static void main(String []args){
        System.out.println("Enter a number integer :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Your number is negative"+n);
            n=n*(-1);
            System.out.println("The number "+ n +"her is the absolute value ");
        }
        else if(n>0)
        {
            System.out.println("Your number is positive"+n);
        }
        else if(n==0)
        {
            System.out.println("Your number is zero"+n);
        }
    }
}
