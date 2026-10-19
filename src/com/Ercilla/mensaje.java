package com.Ercilla;

import java.util.Scanner;

public class mensaje {
    public String solicitarDatos (String mensaje){
        System.out.print(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    public void saludar(Persona persona1) {
        System.out.printf("Hola %s, bienvenido a java\n",persona1.getNombre()+" "+persona1.getApellido());
    }
}

