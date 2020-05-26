package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("KALKULATOR KCAL I WARTOŚCI ODŻYWCZYCH");
        System.out.println(" ");
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj swoją płeć Men/Women");
        String sex = skaner.next();
        System.out.println("Podaj swój wiek");
        int age = skaner.nextInt();
        System.out.println("podaj swój wzrost w [cm]");
        int growth = skaner.nextInt();
        System.out.println("podaj swoją masę ciała w [kg]");
        int weight = skaner.nextInt();

        System.out.println("Jaka jest Twoja aktywność fizyczna?");
        System.out.println(" ");
        System.out.println("W skali 1-5");
        System.out.println("1 - żadna aktywność (brak ćwiczeń)");
        System.out.println("2 - mała aktywność (ćwiczenia 1-3 razy w tygodniu)");
        System.out.println("3 - umiarkowana aktywność (ćwiczenia 3-5 razy w tygodniu");
        System.out.println("4 - duża aktywność (ćwiczenia 6-7 razy w tygodniu");
        System.out.println("5 - Bardzo duża aktywność (ćwiczenia 2 razy dziennie)");
        int activity = skaner.nextInt();

        double a = 1.2;
        double b = 1.375;
        double c = 1.55;
        double d = 1.725;
        double e = 1.9;

        if (sex.equalsIgnoreCase("Men")) {
            if (activity== 1) {
                System.out.println(a * (66.47 + (13.7 * weight) + (5 * growth) - (6.76 * age)));
            } else if (activity ==2){
                System.out.println(b * (66.47 + (13.7 * weight) + (5 * growth) - (6.76 * age)));
            } else if (activity == 3){
                System.out.println(c * ((66.47 + (13.7 * weight) + (5 * growth) - (6.76 * age))));
            } else if (activity == 4){
                System.out.println(d * ((66.47 + (13.7 * weight) + (5 * growth) - (6.76 * age))));
            } else if (activity == 5) {
                System.out.println(e * ((66.47 + (13.7 * weight) + (5 * growth) - (6.76 * age))));
            } else {
                System.out.println("podaj liczbę w prawidłowym zakresie");
            }
        } else if (sex.equalsIgnoreCase("Women")) {
            if (activity== 1) {
                System.out.println(a*(655.1 + (9.56 * weight) + (1.85 * growth) - (4.68 * age)));
            } else if (activity == 2){
                System.out.println(b*(655.1 + (9.56 * weight) + (1.85 * growth) - (4.68 * age)));
            } else if (activity == 3){
                System.out.println(c*(655.1 + (9.56 * weight) + (1.85 * growth) - (4.68 * age)));
            } else if (activity == 4) {
                System.out.println(d*(655.1 + (9.56 * weight) + (1.85 * growth) - (4.68 * age)));
            } else if (activity == 5) {
                System.out.println(e*(655.1 + (9.56 * weight) + (1.85 * growth) - (4.68 * age)));
            } else {
                System.out.println("podaj liczbę w prawidłowym zakresie");
            }
        }else {
            System.out.println("Podałeś niewłaściwą płeć");
        }
        System.out.println("to zalecana dzienna ilosc kalorii");

    }
}

