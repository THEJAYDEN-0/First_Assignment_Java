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
public class Q2 {
    public static void main(String args[])  
{    
 int a=0,b=1,c,i,count=10;    
 System.out.print(a+" "+b); 
 for(i=2;i<count;++i)  
 {    
  c=a+b;    
  System.out.print(" "+c);    
  a=b;    
  b=c;    
 }    
}
}
