package app;

import java.util.Scanner;

public class ex9 {

    public static String menorStringMaior(String name) {
        for (int i = 0; i < name.length(); i++) {
            name = name.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        }
        return name;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a String A: ");
        String A = input.nextLine();

        String B = menorStringMaior(A);

        System.out.print("Ordem: " + B); // só consegui reordenar do "maior" ao "menor" :p

        input.close();
    }
}
