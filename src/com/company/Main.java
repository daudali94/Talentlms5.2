package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Консольдон бир сан бериниз.
         * Ал санга чейинки сандардын суммасын табыныз.
         * Мисалы:
         * 10
         * Жооп:
         * 55 -> себеби 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
         */
        Scanner scanner = new Scanner(System.in);
        int san = scanner.nextInt();
        int shet = 0;
        for (int i = 0; i <= san; i++) {
            shet += i;
        }
        System.out.println(shet);
    }
}
