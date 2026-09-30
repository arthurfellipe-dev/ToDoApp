package Util;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Leitor {
    private static final Scanner sc = new Scanner(System.in);

    public static Scanner getScanner() {
        return sc;
    }

    public static String lerString(String mensagem) {
        System.out.println(mensagem);

        return sc.nextLine();
    }
    public static int lerInt(String mensagem) {
        while (true) {
            System.out.println(mensagem);

            String linha = sc.nextLine().trim();

            try {
                return Integer.parseInt(linha);
            } catch (NumberFormatException e) {
                System.out.println("Numero invalido, tente de novo.");
            }
        }
    }

    public static LocalDate lerData(String mensagem) {
        while (true) {
            System.out.println(mensagem + " (aaaa-mm-dd)");

            String linha = sc.nextLine().trim();

            try {
                return LocalDate.parse(linha);
            } catch (DateTimeParseException e) {
                System.out.println("Data invalida, use o formato aaaa-mm-dd.");
            }
        }
    }
}

