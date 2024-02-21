package org.example.ReservationSystem;

import java.util.HashMap;

public class ReservationSystem {

    int[] asientosDisponibles;

    int[] asientosReservados;

    char[] tipos;

    double tasarecargoNocturno;

    HashMap<Character, Double> precioPorAsiento;

    public ReservationSystem(int[] asientosTotales, double[] precios, char[] tiposAsientos, double recargoNocturno) {
        this.asientosDisponibles = asientosTotales;
        this.asientosReservados = new int[asientosTotales.length];
        this.tipos = tiposAsientos;
        this.tasarecargoNocturno = recargoNocturno;
        precioPorAsiento = new HashMap<>();
        for (int i = 0; i < tiposAsientos.length; i++) {
            precioPorAsiento.put(tiposAsientos[i], precios[i]);
        }
    }

    public void ver() {
        System.out.println("Cantidad de acientos disponibles: ");
        for (int i = 0; i < asientosDisponibles.length; i++) {
            System.out.println("Tipo: " + tipos[i] + " Disponibles: " + asientosDisponibles[i] + " Precio: " + precioPorAsiento.get(tipos[i]));
        }
    }

    public void reservar(char tipo) {
        int asientoReservado = -1;
        for (int i = 0; i < tipos.length; i++) {
            if (tipo == tipos[i]) {
                asientosDisponibles[i]--;
                asientosReservados[i]++;
                asientoReservado = i;
            }
        }
        if (asientoReservado > -1) {
            System.out.println("Asiento reservado correctamente: ");
            System.out.println("Tipo " + tipo);
            System.out.println("Precio " + precioPorAsiento.get(tipo));
        } else {
            System.out.println("Ocurrio un error");
        }
    }

    public void verReservas() {
        for (int i = 0; i < tipos.length; i++) {
            if (!(asientosReservados[i] <= 0)) {
                System.out.println("Tipo: " + tipos[i] + " Tiene: " + asientosReservados[i] + " Asientos reservados.");
            }
        }
    }

    public void ganancias() {
        double total = 0;
        for (int i = 0; i < tipos.length; i++) {
            double gananciaPorTipo = asientosReservados[i] * precioPorAsiento.get(tipos[i]);
            if (!(gananciaPorTipo <= 0)) {
                total += gananciaPorTipo;
                System.out.println("Ganancias por asiento tipo: " + tipos[i] + " es " + gananciaPorTipo);
            }
        }
        System.out.println("Total de ganancias actuales es:" + total);
    }
}
