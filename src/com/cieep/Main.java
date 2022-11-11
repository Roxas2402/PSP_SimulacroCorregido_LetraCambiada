package com.cieep;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        frase = frase.toLowerCase().replace('e', 'a');
        frase = frase.toLowerCase().replace('E', 'A');

        StringTokenizer str = new StringTokenizer(frase);

        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
        System.out.println("FIN");
    }
}