package com.banubalta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        input = 5   output = 120   (5*4*3*2*1)


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir pozitif tamsayi giriniz");
        int sayi = scanner.nextInt();

        long faktoryel = 1 ;

        for (int i = 1; i <=sayi ; i++) {

            faktoryel *= i;

        }
        System.out.println(faktoryel);

    }
}


