/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rupa.VolumeCalculation;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Calculator {

    Scanner input = new Scanner(System.in);


    public void getArea() {
        System.out.println("Enter length");
        int length = input.nextInt();
        System.out.println("Enter breath");
        int breath = input.nextInt();
        double area = length * breath;
        System.out.println("Area of rectangle is " + area);

    }

    public void getVolume() {
        System.out.println("Enter length");
        int length = input.nextInt();
        System.out.println("Enter breath");
        int breath = input.nextInt();
        System.out.println("Enter height");
        int height = input.nextInt();
        double volume = length * breath;
        System.out.println("Area of rectangle is " + volume);
    }

    public void getPerimeter() {
        System.out.println("Enter length");
        int length = input.nextInt();
        System.out.println("Enter breath");
        int breath = input.nextInt();
        double perimeter = 2 * (length + breath);
        System.out.println("Area of rectangle is " + perimeter);
    }

}
