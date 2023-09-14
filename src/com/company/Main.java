package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.print("Digite a distancia em km: ");
            double C = sc.nextDouble();
            double F = 0.621371 * C ;
            System.out.printf("Equivalente em milhas: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);

        } while (resp !='n');

        sc.close();

    }

}

