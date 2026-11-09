package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bulundugunuz kat: ");
        Scanner giris = new Scanner(System.in);
        int kat = giris.nextInt();
        System.out.println("Gideceginiz kat: ");
        int gidilen = giris.nextInt();
        if (kat < 1 || kat > 10 || gidilen < 1 || gidilen > 10 ) {

            System.out.println("Gecersiz veri tespit edilmistir sistem kendini 5 saniye icinde imha edecektir");
            System.out.println("5");
            System.out.println("4");
            System.out.println("3");
            System.out.println("2");
            System.out.println("1");
            System.out.println("Bommmmmmmm");
        } else {
            if (gidilen == kat){
                System.out.println("Ayni kattasiniz");
            }else {
                if (gidilen > kat) {
                    System.out.println("Yukari dogru gidilecektir");
                    int cikilan_kat= gidilen-kat;
                    System.out.println(cikilan_kat + " kat cikilmistir");
                }else{
                    System.out.println("Asagi dogru gidilecektir");
                    int inilen_kat= kat-gidilen;
                    System.out.println(inilen_kat + " kat inmistir");
                }
            }
        }






    }
}
