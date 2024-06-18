/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.circle2;

/**
 *
 * @author hp
 */
import java.util.Scanner;
//working with constructors
public class cirles{
    //Fields
    double radius;
    static double P1=3.142;
    //Creat a Constructor
    public circlee(double radius){
}
    return P1*radius*radius;
}
//Method for computing perimeter
double computePerimeter(){
return 2*P1*radius;
}
public static void manin(String[] args){
//object for the Scanner
Scanner save=new Scanner(System.in);

        System.out.println("Enter the shape required");
  String shape=save.nextLine();
System.out.println(" Enter value of a radius of a"+shape);
 double r=save.nextDouble();
//creating an object of a cirlcle c
circles c=new circles(r); 
System.out.println(" The area of acirle is"+c.computePerimeter());
    }
}
