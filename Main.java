package com.pkdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("What is the temprature: ");
        int value = temp.nextInt();
        if (value >= 30) {
            System.out.println("It is very hot");
        } else if (value < 30 && value >= 20){
            System.out.println("It is nice outside");
        } else {
            System.out.println("It is cold outside");
        }
        }


    }

