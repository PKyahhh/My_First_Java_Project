package com.pkdev;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //find principal value
        Scanner principal = new Scanner(System.in);
        System.out.print("Principal: ");
        double prince = principal.nextDouble();

        //find rate of intrest
        Scanner intrest = new Scanner(System.in);
        System.out.print("Annual Intrest Rate: ");
        double inter = intrest.nextDouble();

        //find how much time there is in years
        Scanner time = new Scanner(System.in);
        System.out.print("Amount of time to pay (in years): ");
        double tim = principal.nextDouble();

        //Calculate mortgage
        double ti = tim * 12;
        double intdec = (double)inter / 100 / 12;
        double intdecuno = intdec + 1;
        double intpowered = Math.pow(intdecuno,ti);
        double top = intpowered * intdec;
        double bottompowered = intpowered;
        double bottom = bottompowered - 1;
        double divided = top / bottom;
        double m = prince * divided;

        //Put value into number format and print
        NumberFormat curent = NumberFormat.getCurrencyInstance();
        String finale = curent.format(m);
        System.out.println(finale);



        }
    }

