package org.launchcode.java.studios.areaofacircle;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        //variables
        double radius;
        boolean gateKeep = true;
        radius = -1;
        radius = input.nextDouble();
        while (radius<0) {
            System.out.println("Radius must be a positive integer");
            System.out.println("Enter a radius: ");
            radius = input.nextDouble();
        }


        System.out.println("The area of the circle of radius " + radius + " is: " + Circle.getArea(radius));


    }}