package iegcode.io;

import java.util.Scanner;

public class InputApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Nama: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
