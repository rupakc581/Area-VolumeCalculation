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
public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator cl = new Calculator();

        while (true) {
        System.out.println("Enter your choice:[1-4]");
        System.out.println("1.Area");
        System.out.println("2.Volume");
        System.out.println("3.Perimeter");
        System.out.println("4.Exit");
        int choice = input.nextInt();
        switch (choice) {
            case 1: {
                cl.getArea();
                break;
            }
            case 2: {
                cl.getVolume();
                break;
            }
            case 3: {
                cl.getPerimeter();
                break;

            }
        }
        
    }
}
}