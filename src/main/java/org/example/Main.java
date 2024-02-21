package org.example;

import org.example.ReservationSystem.ReservationSystem;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] tipoAsientos = {'A', 'B', 'C', 'D', 'E'};
        int[] asientosTotals = {2, 4, 6, 8, 10};
        double[] precios = {10, 8, 6, 4, 2};
        double recargoNocturno = 0.2;

        System.out.println("Sistema de reservas");
        ReservationSystem sys = new ReservationSystem(asientosTotals, precios, tipoAsientos, recargoNocturno);

        boolean exit = false;

        do {

            System.out.println("Seleccione una opcion");
            System.out.println("1. Ver Disponibilidad");
            System.out.println("2. Reservar");
            System.out.println("3. Ver reservas");
            System.out.println("4. Calcular ganancias");
            System.out.println("5. Salir");

            int selection = scan.nextInt();

            switch (selection) {
                case 1:
                    sys.ver();
                    break;
                case 2:
                    System.out.println("Que tipo de asiento deseas reservar?");
                    String tipo = scan.next();
                    sys.reservar(tipo.charAt(0));
                    break;
                case 3:
                    sys.verReservas();
                    break;
                case 4:
                    sys.ganancias();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (!exit);

    }

}