package com.sda.algorytmy;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int ilosc;
        int pierwszyWyraz;
        int roznica;
        int zmienna;

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ilość wyrazów ciągu do wygenerowania");
        ilosc=scanner.nextInt();

        System.out.println("podaj pierwszy wyraz");
        pierwszyWyraz=scanner.nextInt();

        System.out.println("podaj różniecę \"r\"");
        roznica=scanner.nextInt();

        for (int i = 1; i<=ilosc; i++){
            System.out.println("a"+i+" = "+ (pierwszyWyraz+(roznica*(i-1))));
        }

    }
}
