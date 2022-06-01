package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean boo = true;
        while (boo) {
            System.out.println("Kun tandanyz.");
            switch (scanner.nextLine()){
                case "DYISHEMBI":
                    System.out.println("Bul kunu teopiya bolot.");
                    break;
                case "SHARSHEMBI":
                    System.out.println("Sharshembi kunu praktica.");
                    break;
                case "SHEISHEMBI":
                    System.out.println("Sheishembi kunu english cabagy bolot.");
                    break;
                case "BEISHEMBI":
                    System.out.println("Beishembi kunu praktica bolot.");
                    break;
                case "JUMA":
                    System.out.println("JUMA kunu event bolot.");
                    break;
                case "ISHEMBI":
                    System.out.println("ISHEMBI kunu es aluu.");
                    break;
                case "JEKSHEMBI":
                    System.out.println("Jekshembi kunu dem alysh.");
                    break;
            }

        }
    }
}