package javamtcifrabroj;

import java.util.Scanner;

public class JavaMTCifraBroj {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String red;
        int brojSlova = 0;
        int brojCifara = 0;

        System.out.println("Unesite jedan red teksta:");
        red = input.nextLine();
        for (int i = 0; i < red.length(); i++) {
            char znak = red.charAt(i);
            System.out.printf("%3d. znak %c\n", i + 1, znak);
            if (Character.isLetter(znak)) {
                brojSlova++;
            }
            if (Character.isDigit(znak)) {
                brojCifara++;
            }
        }

        System.out.println("Broj slova  u ulaznom redu je: " + brojSlova);
        System.out.println("");
        System.out.println("Broj cifara u ulaznom redu je: " + brojCifara);
    }

}
