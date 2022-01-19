/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */

// Name:- Gopal Sharma
import java.util.Scanner;
public class Q1 
{
    public static void main(String[] args) 
    {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        a = s.nextInt();
        if(a % 2 == 0)
        {
            System.out.println("The given number "+a+" is Even ");
        }
        else
        {
            System.out.println("The given number "+a+" is Odd ");
	}
    }
}