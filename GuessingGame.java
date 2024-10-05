import java.io.*;
import java.util.*;
class GuessingGame
{
    public static void main(String args[])
    {
        int n,turns,attempts[],diff[];
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------WELCOME TO THE GUESSING GAME------------------\n You have five turns to guess the number and win!!! ");
        n=(int)(Math.random()*100);
        turns=1;
        attempts=new int[6];
        diff=new int[6];
        do
        {
            System.out.print("\nGuess the number : ");
            attempts[turns]=sc.nextInt();
            if(attempts[turns] == n)
            {
                System.out.println("*************** CONGRATULATIONS YOU HAVE WON!!! ***************");
                flag=true;
                break;
            }
            else if(turns<5)
            {
                System.out.println("Wrong Guess!!! Try again");
                System.out.println("Number of turns left : "+(5-turns));                
            }
            else if(turns==5)
            {
                System.out.println("*************** OOPS!!! YOU HAVE LOST!!! ***************");       
            }
            diff[turns]= Math.abs(n-attempts[turns]);
            if(diff[turns]<5)
            System.out.println("++++++++++++++++You were too close++++++++++++++++");
            turns++;
        }while(turns<=5);
        if(flag==true)
        {
            System.out.print("Number of turns taken : "+turns+"\nTitle Awarded : ");
            switch(turns)
            {
                case 1 : System.out.println("DIAMOND LEVEL");
                break;
                case 2 : System.out.println("PLATINUM LEVEL");
                break;
                case 3 : System.out.println("GOLD LEVEL");
                break;
                case 4 : System.out.println("SILVER LEVEL");
                break;
                case 5 : System.out.println("BRONZE LEVEL");
                break;
            }   
        }
        else
        {
            System.out.println("The Number was : "+n);
            System.out.println("Better Luck Next Time :)");
           
            //System.out.println("Closest Guess : ");
        }
    }
}