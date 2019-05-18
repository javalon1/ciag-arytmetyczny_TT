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
        zmienna=scanner.nextInt();
        ilosc = zmienna;

        System.out.println("podaj pierwszy wyraz");
        zmienna=scanner.nextInt();
        pierwszyWyraz=zmienna;

        System.out.println("podaj różniecę \"r\"");
        zmienna=scanner.nextInt();
        roznica=zmienna;

        for (int i = 1; i<=ilosc; i++){
            System.out.println("a"+i+" = "+ (pierwszyWyraz+(roznica*(i-1))));
        }

    }
}
